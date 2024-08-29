package com.wolkop1st.learnspringframework.examples.a1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class DepinjectionLauncherApplication {
	

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext
				(DepinjectionLauncherApplication.class);) {
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
	}
}
