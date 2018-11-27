package com.PracticeNorthwind.pracnorthwind;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.PracticeNorthwind.pracnorthwind.repo.CustomersRepository;

@Controller
public class PracNorthwindController {
	
	@Autowired
	CustomersRepository c;
	
	@RequestMapping("/")
	public ModelAndView index() {
		//ModelAndView mv = new ModelAndView("index", "customercity", "c.findAll(");
		ModelAndView mv = new ModelAndView("index", "customercity", "c.findAll()");
		return mv;
	}

	@RequestMapping("/search") // this makes the page show up
	public String search() {
		return "search";
	}
	@RequestMapping("/find")
	public ModelAndView searchResults(@RequestParam("customerCity") String customerCity) {
		//System.out.println(c.findByCustomerCity(customerCity));
		return new ModelAndView("search", "customers", c.findByCustomerCity(customerCity));
	}
}
