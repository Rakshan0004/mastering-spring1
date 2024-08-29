package com.wolkop1st.learnspringframework.game;

import org.springframework.stereotype.Service;

@Service
public interface GamingConsole {
	void up();
	void down();
	void left();
	void right();
}
