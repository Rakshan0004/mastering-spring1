package com.wolkop1st.learnspringframework.examples.c1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;




@Configuration
@ComponentScan
public class RealWorldSpringContextLauncherApplication {
	

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext
				(RealWorldSpringContextLauncherApplication.class);) {
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		}
	}
}
