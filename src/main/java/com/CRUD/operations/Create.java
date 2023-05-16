package com.CRUD.operations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.selenium.simple_hibernate_practice.Book_pojo;

public class Create {

	public static void main(String[] arg) {
	Configuration config=new Configuration();
	config.configure("hibernate.cfg.xml");
	config.addAnnotatedClass(Book_pojo.class);
	SessionFactory sf=config.buildSessionFactory();
	Session sess=sf.openSession();
	
	Book_pojo book= new Book_pojo(8999,"The jungle book", 500);
	sess.beginTransaction();
	sess.save(book);
	sess.getTransaction().commit();
	
	sess.close();
}
}
