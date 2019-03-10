package net.dev.onlinefront.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView md = new ModelAndView("page");
		md.addObject("title", "Home");
		md.addObject("userClickHome",true);
		return md;
	}
	
	@RequestMapping(value = "/about")
	public ModelAndView about() {
		ModelAndView md = new ModelAndView("page");
		md.addObject("title", "About Us");
		md.addObject("userClickAbout",true);
		return md;
	}
	
	@RequestMapping(value = "/contact")
	public ModelAndView contact() {
		ModelAndView md = new ModelAndView("page");
		md.addObject("title", "Contact Us");
		md.addObject("userClickContact",true);
		return md;
	}
}
