package net.dev.onlinebackend.dao;

import java.util.List;

import net.dev.onlinebackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
}
