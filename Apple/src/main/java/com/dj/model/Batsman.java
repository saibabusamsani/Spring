package com.dj.model;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Batsman {
	@Id
	private int jersy;
	private String name;
	private String roll;
	
	public Batsman() {
		super();
	}
	public int getJersy() {
		return jersy;
	}
	public void setJersy(int jersy) {
		this.jersy = jersy;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	@Override
	public String toString() {
		return "Batsman [jersy=" + jersy + ", name=" + name + ", roll=" + roll + "]";
	}
	
	

}
