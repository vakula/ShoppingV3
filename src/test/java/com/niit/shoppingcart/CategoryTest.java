package com.niit.shoppingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.dao.CategoryDAO;

public class CategoryTest {
	public static void main(String[]args){
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context=  new  AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		Category category =  (Category) context.getBean("category");
		CategoryDAO categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
		category.setId("1");
		category.setName("sravan");
		category.setDescription("happy");
		categoryDAO.saveOrUpdate(category);
	}

}
