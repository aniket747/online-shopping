package net.dev.onlinefront.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.dev.onlinebackend.dao.CategoryDAO;
import net.dev.onlinebackend.dto.Category;

@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDAO;

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView md = new ModelAndView("page");
		md.addObject("title", "Home");
		md.addObject("categories", categoryDAO.list());
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
	
	/*methods to load all the products based on categories*/
	
	@RequestMapping(value = "/show/all/products")
	public ModelAndView showAllProducts() {
		ModelAndView md = new ModelAndView("page");
		md.addObject("title", "All Products");
		md.addObject("categories", categoryDAO.list());
		md.addObject("userClickAllProducts",true);
		return md;
	}
	
	@RequestMapping(value = "/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id) {
		ModelAndView md = new ModelAndView("page");
		//categoryDAO to fetch single category
		Category category;
		category = categoryDAO.get(id);
		
		md.addObject("title", category.getName());
		md.addObject("categories", categoryDAO.list());
		
		// passing single category object
		md.addObject("category",category);
		md.addObject("userClickCategoryProducts",true);
		return md;
	}
}
