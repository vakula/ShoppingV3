package com.niit.shoppingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.model.User;
import com.niit.shoppingcart.dao.UserDAO;

public class UserTest {
	public static void main(String[]args){
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context=  new  AnnotationConfigApplicationContext();
		context.scan("com.vishu");
		context.refresh();
		User user =  (User) context.getBean("user");
		UserDAO userDAO = (UserDAO) context.getBean("userDAO");
		user.setId("1");
		user.setName("sravan");
		user.setMail_Id("happy");
		user.setMobile_No(52828);
		userDAO.saveOrUpdate(user);
	}

}
