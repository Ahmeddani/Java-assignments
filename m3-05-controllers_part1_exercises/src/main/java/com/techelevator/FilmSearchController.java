package com.techelevator;

import com.techelevator.dao.FilmDao;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * FilmSearchController
 */
@Controller
public class FilmSearchController {

    @Autowired
    FilmDao filmDao;

    @RequestMapping("/filmList")
    public String showFilmSearchForm() {
        return "filmList";
    }

    @RequestMapping("/AllFilmSearch")
    public String searchFilms(HttpServletRequest request) {
    	int minLength = 0;
    	int maxLength = 0;
    	try {
    	minLength = (int)Integer.parseInt(request.getParameter("minLength"));
		maxLength = (int)Integer.parseInt(request.getParameter("maxLength"));
    	}catch(Exception e) {}
		String genre = request.getParameter("genreSelection");
		request.setAttribute("films", filmDao.getFilmsBetween(genre, minLength, maxLength));
        return "filmList";
    }
    
    
}