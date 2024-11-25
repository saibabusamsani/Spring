package com.student.entity;

public class Marks {
	private int id;
	private int telugu;
	private int english;
	private int maths;
	public Marks(int id, int telugu, int english, int maths) {
		super();
		this.id = id;
		this.telugu = telugu;
		this.english = english;
		this.maths = maths;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTelugu() {
		return telugu;
	}
	public void setTelugu(int telugu) {
		this.telugu = telugu;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	

}
