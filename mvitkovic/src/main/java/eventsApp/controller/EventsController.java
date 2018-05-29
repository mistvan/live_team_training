package eventsApp.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;

@Controller
@Scope(WebApplicationContext.SCOPE_SESSION)
public class EventsController {
	
	@RequestMapping("/")
	public String index() {
		System.out.println("Loading events page.");
		return "index";
	}

}
