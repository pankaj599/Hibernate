package com.CRUD.operations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.selenium.simple_hibernate_practice.Book_pojo;

public class Delete {

	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Book_pojo.class);
		SessionFactory sf= config.buildSessionFactory();
		
		Session session=sf.openSession();
		
		session.beginTransaction();
		Book_pojo deleteObjectValue = session.get(Book_pojo.class, 565);
		session.delete(deleteObjectValue);
		session.getTransaction().commit();
		
	}
}
