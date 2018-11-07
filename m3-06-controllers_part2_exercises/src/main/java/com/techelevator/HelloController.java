package com.techelevator;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.techelevator.model.Review;
import com.techelevator.model.ReviewDao;

@Controller 
public class HelloController {

	@Autowired 
	private ReviewDao reviewDao;
	
	@RequestMapping("/home")
	public String displayHomePage(HttpServletRequest request) {
		
		request.setAttribute("reviewList", reviewDao.getAllReviews());
		return "home";
	}
	
	@RequestMapping(path = "/newReviewForm", method = RequestMethod.GET)
	public String displayNewReviewForm(HttpServletRequest request) {
		
		return "newReviewForm";
	}
	
	@RequestMapping(path="/reviewOutput", method=RequestMethod.POST)
	public String addNewCityByPostWithModelMap(Review newReview, ModelMap map) {
	    
//		map.addAttribute("methodUsed", "POST-REDIRECT-GET");
		LocalDateTime date = LocalDateTime.now();
		
		
		newReview.setDateSubmitted(date);
		reviewDao.save(newReview);
	
		
		/*
		 * Instead of returning a view name, we can return redirect:<controller request mapping> to redirect to
		 * a GET and keep the form from submitting again on a refresh
		 */
		return "redirect:/home";  
	}
	
}
