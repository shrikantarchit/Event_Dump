package com.dump.event.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "requesturl")
public class RequestUrl {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	@Column(name = "issueid")
	private String issueId;
	 
	@Column(name = "crtdate")
	private Date crtDate;
	@Column(name = "url")
	private String url;
	public RequestUrl(Integer id, String issueId, Date crtDate, String url) {
		super();
		this.id = id;
		this.issueId = issueId;
		this.crtDate = crtDate;
		this.url = url;
	}
	public String getUrl() {
		return url;
	}
	public RequestUrl() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getIssueId() {
		return issueId;
	}
	public void setIssueId(String issueId) {
		this.issueId = issueId;
	}
	 
	public Date getCrtDate() {
		return crtDate;
	}
	public void setCrtDate(Date crtDate) {
		this.crtDate = crtDate;
	}
	@Override
	public String toString() {
		return "RequestUrl [id=" + id + ", issueId=" + issueId + ", crtDate=" + crtDate + ", url=" + url + "]";
	}

	
}
