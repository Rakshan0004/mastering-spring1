package com.wolkop1st.learnspringframework.examples.a0;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
class YourBusinessClass{
	
	Dependency1 dependency1;
	
	
	Dependency2 dependency2;
	
//	@Autowired
	public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		super();
		System.out.println("Constructor injection - yourbusinessclass ");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}

	
//	@Autowired
//	public void setDependency1(Dependency1 dependency1) {
//		System.out.println("setter injection -setDependency1 ");
//		
//		this.dependency1 = dependency1;
//	}
//	
//	@Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		System.out.println("setter injection -setDependency2 ");
//		this.dependency2 = dependency2;
//	}

	public String toString() {
		return "using " + dependency1 + " and " + dependency2;
	}
}

	@Component
	class Dependency1{
		
	}
	
	
	@Component
	class Dependency2{
		
	}



@Configuration
@ComponentScan
public class SimpleSpringContextLauncherApplication {
	

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext
				(SimpleSpringContextLauncherApplication.class);) {
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean(YourBusinessClass.class));
		}
	}
}
