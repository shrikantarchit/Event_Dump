package com.dump.event.dao;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import com.dump.event.dto.IssueRequest;
import com.dump.event.dto.Request;
import com.dump.event.model.RequestUrl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@Repository
public class EventDaoImpl implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6021988760823322901L;
	// logger settings
	public static final Logger LOGGER = LoggerFactory.getLogger(EventDaoImpl.class);
	// define field for entitymanager
	private EntityManager entityManager;
	@Autowired
	RestTemplate restTemplate;
	ObjectMapper mapper = new ObjectMapper();

	// set up constructor injection
	@Autowired
	public EventDaoImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	int issueId = 0;
	int size = 0;

	//@Scheduled(cron = "0 0/2 * * * *")
	@Scheduled(initialDelay = 400000,fixedRate    = 200000)
	@Bean

	public void dumpData() throws Exception {

		try {

			RequestUrl req = new RequestUrl();

			Session currentSession = entityManager.unwrap(Session.class);
			String query = "FROM RequestUrl where id>:i";

			Query query1 = currentSession.createQuery(query);
			query1.setParameter("i", issueId);
			List<RequestUrl> result = new ArrayList<RequestUrl>();
			result = query1.list();
			size = result.size();
			LOGGER.info("Task Scheduler Time " + new Date());
			int f = result.get(size - 1).getId();

			issueId = result.get(size - 1).getId();

			for (int i = 0; i < size; i++) {

				if (result.get(i).getUrl().contains("eRightsAptaraPacmPapersDump")) {

					LOGGER.info("Data to be dumped for  Id : " + result.get(i).getId() + "from URL "
							+ result.get(i).getUrl());

					String value = "https://cfapidev.acm.org/rest/eRightsAptaraPacmPapersDump/eRightsAptaraPacmPapersDump/"
							+ result.get(i).getIssueId();

					HttpHeaders headers = new HttpHeaders();
					headers.add("user-agent",
							"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");

					HttpEntity<String> entity = new HttpEntity<String>(headers);
					String requestJson = restTemplate.exchange(value, HttpMethod.GET, entity, String.class).getBody();

					try {
						mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
						TypeReference<List<Request>> typeRef = new TypeReference<List<Request>>() {
						};
						List<Request> inboundRequest = mapper.readValue(requestJson, typeRef);
						LOGGER.info("INBOUND REQUEST : " + inboundRequest);
					} catch (JsonProcessingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				} else {
					LOGGER.info("Data to be dumped for  Id : " + result.get(i).getId() + "from URL "
							+ result.get(i).getUrl());

					String url = result.get(i).getUrl();
					HttpHeaders headers = new HttpHeaders();
					headers.add("user-agent",
							"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
					// headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
					HttpEntity<String> entity = new HttpEntity<String>(headers);
					String requestJson = restTemplate.exchange(url, HttpMethod.GET, entity, String.class).getBody();

					try {
						mapper.enable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT);
						TypeReference<List<IssueRequest>> typeRef = new TypeReference<List<IssueRequest>>() {
						};
						List<IssueRequest> inboundRequest = mapper.readValue(requestJson, typeRef);
						LOGGER.info("INBOUND REQUEST : " + inboundRequest);
					} catch (JsonProcessingException e) {
						// TODO Auto-generated catch block
						
						e.printStackTrace();
					}

				}

			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			LOGGER.info("Sleep Time " + new Date());
			Thread.sleep(200000);
			LOGGER.error("No Issue Ids to dump");

		}

	}

	public static String formatDate(Date date, String format) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
		String convertedDate = simpleDateFormat.format(date);
		return convertedDate;
	}

}
