package com.wolkop1st.learnspringframework.examples.d1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component

class ClassA{
	
}

@Component
@Lazy
class ClassB{
	private ClassA classA;

	public ClassB(ClassA classA) {
		System.out.println("some initialization logic");
		this.classA = classA;
	}
	
	public void doSomething() {
		System.out.println("do something");
		
		
	}
}

@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {
	

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext
				(LazyInitializationLauncherApplication.class);) {
			
			
			System.out.println("Inititalaization if context is completed");
			
			context.getBean(ClassB.class).doSomething();
		}
	}
}
