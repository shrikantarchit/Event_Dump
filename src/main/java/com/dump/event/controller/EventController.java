package com.dump.event.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.dump.event.service.EventService;

@RestController
public class EventController {
	@Autowired
	private EventService eventService;

 

}
