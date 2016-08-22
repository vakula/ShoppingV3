package com.niit.shoppingcart.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="User")
@Component
public class User {
	
	private String Id;
	private String Name;
	private String Mail_Id;
	private double Mobile_No;
	@javax.persistence.Id
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getMail_Id() {
		return Mail_Id;
	}
	public void setMail_Id(String mail_Id) {
		Mail_Id = mail_Id;
	}
	public double getMobile_No() {
		return Mobile_No;
	}
	public void setMobile_No(double mobile_No) {
		Mobile_No = mobile_No;
	}
	


}
