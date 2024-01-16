package com.tobeto;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringOrnegi2Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.tobeto");
		System.out.println(context.getBean("b1"));
		context.close();
	}

}
