package com.CRUD.operations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.selenium.simple_hibernate_practice.Book_pojo;

public class Update {

	public static void main(String[] ar) {
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Book_pojo.class);
		SessionFactory sf= config.buildSessionFactory();
		Session sess=sf.openSession();
		
		sess.beginTransaction();
		//First fetch the value using either get or load method
		Book_pojo data = sess.get(Book_pojo.class, 2);
		//Then update the value
		data.setName_of_book("Psychology of money");
		sess.update(data);
		sess.getTransaction().commit();
		
		sess.close();
	}
}
