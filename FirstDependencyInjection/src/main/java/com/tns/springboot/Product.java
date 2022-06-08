package com.tns.springboot;

import org.springframework.stereotype.Component;

@Component
public class Product {
	private int pid;
	private String pname;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void show() {
		System.out.println("Product is out of stock now");
	}
	
	

}
