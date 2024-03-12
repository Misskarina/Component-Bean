package com.karina.ComponentBean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ComponentBeanApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComponentBeanApplication.class, args);
	
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyConfiguration.class);
	Student s=context.getBean(Student.class);//@Bean
	s.test();
	
	Person p=context.getBean(Person.class);//@Bean
	p.getPerson();

}
}