package com.dump.event.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.dump.event.dao.EventDaoImpl;

@Service
public class EventService {
	@Autowired
	private EventDaoImpl eventDaoImpl;

}
