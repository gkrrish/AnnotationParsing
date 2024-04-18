package com.abc.framework;

import java.lang.reflect.Method;

import com.abc.annotation.CustomOne;
import com.abc.annotation.CustomTwo;
import com.abc.service.Service;

public class Framework {

	// normal
	public void serviceCall() {
		Service service = new Service();
		service.test();
		service.testx();
	}

	// annotation parsing
	public void serviceCallx() throws Exception {
		
		Service service = new Service();
		Method method = service.getClass().getMethod("testx"); // give specific method in string format

		if (method.isAnnotationPresent(CustomOne.class)) {
			CustomOne customOne = method.getAnnotation(CustomOne.class);
			
			System.out.println("Custom One Annotation Parsing : " + customOne.valueOne() + " " + customOne.valueTwo());
		}
		if (method.isAnnotationPresent(CustomTwo.class)) {
			CustomTwo customTwo = method.getAnnotation(CustomTwo.class);
			
			System.out.println("Custom Two Annotation Parsing : " + customTwo.valueThree() + " " + customTwo.valueFour());
		}

	}

}
