package com.tns.module;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
public class College {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String collegename;
	private String location;
	   

	public College() {
	}
	public College(Integer id, String collegename, String location) {
		this.id = id;
		this.collegename = collegename;
		this.location = location;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	

}
