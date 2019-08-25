package com.mySpringTest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mySpringTest.RepositoryImpl.EmployeeRepository;

public class SpringRepositoryMainApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext c=new AnnotationConfigApplicationContext();
		c.scan("com.mySpringTest");
		c.refresh();
		EmployeeRepository e= c.getBean(EmployeeRepository.class);
		e.store(new Employee(1, "Pankaj", "T"));
		e.store(new Employee(2, "Anupam", "E"));
		e.store(new Employee(3, "Meghna", "C"));
		
		System.out.println("Deleting a Record "+e.delete(1).getFirstName());
	}
}
