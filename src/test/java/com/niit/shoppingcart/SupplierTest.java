package com.niit.shoppingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.model.Supplier;
import com.niit.shoppingcart.dao.SupplierDAO;

public class SupplierTest {
	public static void main(String[]args){
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context=  new  AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		Supplier supplier =  (Supplier) context.getBean("supplier");
		SupplierDAO supplierDAO = (SupplierDAO) context.getBean("supplierDAO");
		supplier.setId("1");
		supplier.setName("sravan");
		supplier.setAddress("happy");
		supplierDAO.saveOrUpdate(supplier);
	}

}
