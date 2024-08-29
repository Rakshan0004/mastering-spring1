package com.wolkop1st.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class PacManGame implements GamingConsole{
	
	public void up() {
		System.out.println("up");
	}
	public void down() {
		System.out.println("sit down");
	}
	public void left() {
		System.out.println("Go back");
	}
	public void right() {
		System.out.println("shoot");
	}
}
