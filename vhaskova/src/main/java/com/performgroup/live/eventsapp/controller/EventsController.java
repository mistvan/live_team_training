package com.performgroup.live.eventsapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventsController {
	
	@RequestMapping("/")
	public String index() {
		System.out.println("Loading events page.");
		return "index";
	}

}
