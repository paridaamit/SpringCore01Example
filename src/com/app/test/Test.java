package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.model.Sudent;

public class Test 

{
 public static void main(String[] args) 
 {

	 ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
	 Object o =ac.getBean("sob");
	 Sudent s = (Sudent)o;
	 System.out.println(s);
 }
}
