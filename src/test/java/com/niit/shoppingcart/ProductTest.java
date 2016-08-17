package com.niit.shoppingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.model.Product;
import com.niit.shoppingcart.dao.ProductDAO;

public class ProductTest {
	public static void main(String[]args){
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context=  new  AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		Product product =  (Product) context.getBean("product");
		ProductDAO productDAO = (ProductDAO) context.getBean("productDAO");
		product.setId(1);
		product.setName("sravan");
		product.setDescription("happy");
		product.setPrice(15000);
		productDAO.saveOrUpdate(product);
	}

}
