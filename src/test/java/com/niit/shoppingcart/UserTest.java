package com.niit.shoppingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.model.Login;
import com.niit.shoppingcart.dao.LoginDAO;

public class UserTest {
	public static void main(String[]args){
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context=  new  AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		Login user =  (Login) context.getBean("user");
		LoginDAO userDAO = (LoginDAO) context.getBean("userDAO");
		user.setId(1);
		user.setUsername("vaku");
		user.setPassword("vakus");
		userDAO.save(user);
		userDAO.Update(user);
	}

}
