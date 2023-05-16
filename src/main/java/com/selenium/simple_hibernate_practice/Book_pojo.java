package com.selenium.simple_hibernate_practice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Book")
public class Book_pojo {

	@Id
	private int id;
	
	@Column(name = "name")
	private String name_of_book;
	
	@Column(name = "pages")
	private int no_of_pages;
	
	public Book_pojo(int id, String name_of_book, int no) {
		super();
		this.id = id;
		this.name_of_book = name_of_book;
		this.no_of_pages = no;
	}

	public Book_pojo(String name_of_book, int no_of_pages) {
		super();
		this.name_of_book = name_of_book;
		this.no_of_pages = no_of_pages;
	}

	public Book_pojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName_of_book() {
		return name_of_book;
	}

	public void setName_of_book(String name_of_book) {
		this.name_of_book = name_of_book;
	}

	public int getNo_of_pages() {
		return no_of_pages;
	}

	public void setNo_of_pages(int no_of_pages) {
		this.no_of_pages = no_of_pages;
	}

	@Override
	public String toString() {
		return "Book_pojo [id=" + id + ", name_of_book=" + name_of_book + ", no_of_pages=" + no_of_pages + "]";
	}
	
	
}
