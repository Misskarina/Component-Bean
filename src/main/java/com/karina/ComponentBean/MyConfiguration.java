package com.karina.ComponentBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// @Bean annotation must be used into the @Configuration

@Configuration//this is the class level annotation to define @Bean method level
public class MyConfiguration
{
	@Bean//this is method level annotation
	public Student getStudent()
	{
		return new Student();//returning object i.e can access any method of class student
	}
	
	@Bean
	public Person getPerson()
	{
		return new Person();//returning object
	}
}
