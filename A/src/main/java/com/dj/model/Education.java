package com.dj.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Education {
	@Value("2023")
	private int year;
	@Value("Anu")
	private String college;
	
	public Education() {
		super();
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public Education(int year, String college) {
		super();
		this.year = year;
		this.college = college;
	}

	@Override
	public String toString() {
		return "Education [year=" + year + ", college=" + college + "]";
	}
	

}
