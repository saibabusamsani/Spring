package com.dj.model;

public class College {
	private  int collegeId;
	private  String collegeName;
	private String collegeAddress;
	public College() {

	}
	public College(int collegeId, String collegeName, String collegeAddress) {
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.collegeAddress = collegeAddress;
	}
	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", collegeAddress=" + collegeAddress
				+ "]";
	}
	

}
