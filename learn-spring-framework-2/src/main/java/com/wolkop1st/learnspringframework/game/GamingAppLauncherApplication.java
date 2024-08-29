package com.wolkop1st.learnspringframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;



@Configuration
@ComponentScan("com.wolkop1st.learnspringframework.game")
public class GamingAppLauncherApplication {
	

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext
				(GamingAppLauncherApplication.class);) {
			
			context.getBean(GamingConsole.class).down();
			context.getBean(GameRunner.class).run();
			
		}
	}
}
