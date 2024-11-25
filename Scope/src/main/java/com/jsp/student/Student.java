package com.jsp.student;

public class Student {
	private int studentid;
	private String studentName;
	private double studentPercentage;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public double getStudentPercentage() {
		return studentPercentage;
	}
	public void setStudentPercentage(double studentPercentage) {
		this.studentPercentage = studentPercentage;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", studentName=" + studentName + ", studentPercentage="
				+ studentPercentage + "]";
	}
	

}
