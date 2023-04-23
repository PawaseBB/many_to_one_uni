package com.jsp.Hos.Branch;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Branch1 {
	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	private int id;
	private String location;
	private String name;
	@ManyToOne
	private Hospital1 hospital1;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Hospital1 getHospital1() {
		return hospital1;
	}
	public void setHospital1(Hospital1 hospital1) {
		this.hospital1 = hospital1;
	}
	
}
