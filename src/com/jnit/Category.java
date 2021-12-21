package com.jnit;

public class Category {

	private String CategoryName;
	private Book java;
	public String getCategoryName() {
		return CategoryName;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	public Book getJava() {
		return java;
	}
	public void setJava(Book java) {
		this.java = java;
	}
	
}
