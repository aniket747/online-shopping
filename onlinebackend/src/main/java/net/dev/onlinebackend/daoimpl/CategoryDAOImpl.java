package net.dev.onlinebackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.dev.onlinebackend.dao.CategoryDAO;
import net.dev.onlinebackend.dto.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	

	private static List<Category> categories = new ArrayList<>(); 
	
	static {
		// adding first category
		Category category = new Category();
		// adding first category
		category.setId(1);
		category.setName("Television");
		category.setDesccription("All kind of TV's are available");
		category.setImageURL("CAT1.png");
		categories.add(category);
		
		// adding second category
		
		category = new Category();
		// adding first category
		category.setId(2);
		category.setName("Mobiles");
		category.setDesccription("All kind of Mobiles are available");
		category.setImageURL("CAT2.png");
		categories.add(category);
		
		// Adding Third category
		category = new Category();
		// adding first category
		category.setId(3);
		category.setName("Laptops");
		category.setDesccription("All kind of Laptops are available");
		category.setImageURL("CAT3.png");
		categories.add(category);
		
	}
	
	@Override
	public List<Category> list() {
		return categories;
	}

	@Override
	public Category get(int id) {
		for(Category ct : categories) {
			if(ct.getId() == id)
				return ct;
		}
		return null;
	}
}
