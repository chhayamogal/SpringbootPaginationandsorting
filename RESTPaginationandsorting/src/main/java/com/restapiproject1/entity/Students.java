package com.restapiproject1.entity;

import jakarta.persistence.*;
@Entity
@Table(name="Students")
public class Students {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sid;
	private String name;
	private String scity;
	
	public Students()
	{
		
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getScity() {
		return scity;
	}

	public void setScity(String scity) {
		this.scity = scity;
	}

	public Students(int sid, String name, String scity) {
		super();
		this.sid = sid;
		this.name = name;
		this.scity = scity;
	}
	

}
