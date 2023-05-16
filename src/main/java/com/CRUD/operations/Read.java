package com.CRUD.operations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.selenium.simple_hibernate_practice.Book_pojo;

public class Read {

	public static void main(String[] arg) {
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Book_pojo.class);
		SessionFactory sf=config.buildSessionFactory();
		Session sess=sf.openSession();
		
		Book_pojo book= sess.load(Book_pojo.class, 8999);
		
		System.out.println(book);
	}
}
