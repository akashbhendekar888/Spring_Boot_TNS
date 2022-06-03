package com.tns.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Human {
	@Autowired
	private Heart heart;

	
	public Heart getHeart() {
		return heart;
	}


	public void setHeart(Heart heart) {
		this.heart = heart;
	}


	public void startPump() {
		heart.pump();
		
	}

}
