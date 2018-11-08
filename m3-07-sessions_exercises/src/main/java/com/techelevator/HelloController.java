package com.techelevator;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller 
@SessionAttributes("answers")
public class HelloController {

	@RequestMapping("/greeting")
	public String displayGreeting() {
		
		return "greeting";
	}
	
	@RequestMapping(path = "/page1", method = RequestMethod.GET)
	public String displayPage1() {
		
		return "page1";
	}
	
	@RequestMapping(path = "/page2", method = RequestMethod.GET)
	public String displayPage2() {
		
		return "page2";
	}
	
	@RequestMapping(path = "/page3", method = RequestMethod.GET)
	public String displayPage3() {
		
		return "page3";
	}
	
	@RequestMapping(path = "/summary", method = RequestMethod.GET)
	public String displaySummary() {
		
		return "summary";
	}
	
	@RequestMapping(path = "/page1", method = RequestMethod.POST)
	public String getFavoriteColor(@RequestParam String color, ModelMap model) {
		
		Map<String, String> answersMap = new HashMap<String, String>();
		answersMap.put("color", color);
		model.addAttribute("answers", answersMap);
		return "redirect:/page2";
	}
	
	@RequestMapping(path = "/page2", method = RequestMethod.POST)
	public String getFavoriteFood(@RequestParam String food, ModelMap model) {
		
		Map<String, String> answersMap = (Map<String, String>) model.get("answers");
		answersMap.put("food", food);
		model.addAttribute("answers", answersMap);
		return "redirect:/page3";
	}
	
	@RequestMapping(path = "/page3", method = RequestMethod.POST)
	public String getFavoriteClub(@RequestParam String club, ModelMap model) {
		
		Map<String, String> answersMap = (Map<String, String>) model.get("answers");
		answersMap.put("club", club);
		model.addAttribute("answers", answersMap);
		return "redirect:/summary";
	}
}
