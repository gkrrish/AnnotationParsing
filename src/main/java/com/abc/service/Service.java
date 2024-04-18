package com.abc.service;

import com.abc.annotation.CustomOne;
import com.abc.annotation.CustomTwo;

public class Service {
	
	
	@CustomOne(valueOne = "One", valueTwo = "Two")
	@CustomTwo(valueThree = "Three", valueFour = "Four")
	public void test() {

		System.out.println("I am inside Service :: test() method");

	}
	
	
	@CustomOne
	@CustomTwo
	public void testx() {
		
		System.out.println("I am inside Service :: testx() method");
		
	}

}
