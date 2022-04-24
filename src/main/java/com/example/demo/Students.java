package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Students {
	@Id
	@GeneratedValue
	int rollno;
	String name;
	int mark1;
	int mark2;
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark1() {
		return mark1;
	}
	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}
	public int getMark2() {
		return mark2;
	}
	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}
	@Override
	public String toString() {
		return "Students [rollno=" + rollno + ", name=" + name + ", mark1=" + mark1 + ", mark2=" + mark2 + "]";
	}
	
	

}
