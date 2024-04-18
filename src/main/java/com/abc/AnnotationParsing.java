package com.abc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.abc.framework.Framework;

@SpringBootApplication
public class AnnotationParsing {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(AnnotationParsing.class, args);
		

		Framework myFramework = new Framework();
		myFramework.serviceCall();
		
		System.out.println("==Annotation Parsing==");
		myFramework.serviceCallx();
	}

}
