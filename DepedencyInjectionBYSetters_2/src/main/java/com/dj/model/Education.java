package com.dj.model;

public class Education {
	private int yearOfPass;
	private String branch;
	private String nameOfInstitute;
	private String qualification;
	public int getYearOfPass() {
		return yearOfPass;
	}
	public void setYearOfPass(int yearOfPass) {
		this.yearOfPass = yearOfPass;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getNameOfInstitute() {
		return nameOfInstitute;
	}
	public void setNameOfInstitute(String nameOfInstitute) {
		this.nameOfInstitute = nameOfInstitute;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	@Override
	public String toString() {
		return "Education [yearOfPass=" + yearOfPass + ", branch=" + branch + ", nameOfInstitute=" + nameOfInstitute
				+ ", qualification=" + qualification + "]";
	}
	

}
