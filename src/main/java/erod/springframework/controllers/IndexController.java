package erod.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
*@author erod 2020-12-31
*/
@Controller
public class IndexController {

	@RequestMapping({"/","/index",""})
	public String getIndexPage() {
		System.out.println("Some messge to say.... 1");
		return "index";
	}
}
