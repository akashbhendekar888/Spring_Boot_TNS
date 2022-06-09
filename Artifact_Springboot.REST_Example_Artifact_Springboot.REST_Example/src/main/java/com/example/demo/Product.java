package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Product {
	private int pid;
	private String pname;
	private double price;
	private int noofproduct;
	
	public Product() {
		
	}

	public Product(int pid, String pname, double price, int noofproduct) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.noofproduct = noofproduct;
	}

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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getNoofproduct() {
		return noofproduct;
	}

	public void setNoofproduct(int noofproduct) {
		this.noofproduct = noofproduct;
	}
	
	

}
