package com.jnit;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring.xml");
		
		Category x = (Category)appContext.getBean("cat");
		System.out.println("CategoryName="+x.getCategoryName());
		Book b=x.getJava();
		System.out.println(b.getBookName()+" "+b.getBookPrice()+" "+b.getBookAuthor());

	}

}
