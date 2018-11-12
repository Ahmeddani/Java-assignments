package com.techelevator.validation.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.validation.model.Login;
import com.techelevator.validation.model.Registration;

@Controller
public class UserController {
	// GET: /
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String getMainScreen() {
		return "homePage";
	}

	// Add the following Controller Actions

	// GET: /register
	// Return the empty registration view
	@RequestMapping("/registration")
	public String displayRegistrationPage(Model model) {
		if(!model.containsAttribute("registration")) {
    		model.addAttribute("registration", new Registration());
    	}
		return "registration";
	}
	// POST: /register
	// Validate the model and redirect to confirmation (if successful) or return
	// the
	// registration view (if validation fails)
	@RequestMapping(path = "/registration", method = RequestMethod.POST)
	public String validateRegistration(@Valid @ModelAttribute("registration") Registration registration, BindingResult result, RedirectAttributes attr) {
		if (result.hasErrors()) {
		    		
		    		return "registration";
		    	}
		    	return "redirect:/confirmationPage";
    	
		
	}
	// GET: /login
	// Return the empty login view
    @RequestMapping("/login")
    public String displayLoginPage(Model model) {
    	
    	if(!model.containsAttribute("login")) {
    		model.addAttribute("login", new Login());
    	}
    	return "login";
    }
	// POST: /login
	// Validate the model and redirect to login (if successful) or return the
	// login view (if validation fails)
    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public String validateLogin(@Valid @ModelAttribute("login") Login login, BindingResult result, RedirectAttributes attr) {
    	if (result.hasErrors()) {
    		
    		return "login";
    	}
    	return "redirect:/confirmationPage";
    	
    }
	// GET: /confirmation
	// Return the confirmation view
    @RequestMapping("/confirmationPage")
    public String displayConfirmationPage() {
    	
    	return "confirmationPage";
    }
}
