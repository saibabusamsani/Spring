package com.jsp.model;

public class UserInformation {
	private int userid;
	private String username;
	private String useremailid;
	private String password;
	private String gender;
	private Address address;
	public UserInformation()
	{
		
	}
	public UserInformation(Address address)
	{
		this.address=address;
	}
	public UserInformation(int userid, String username, String useremailid, String password, String gender) {
		super();
		this.userid = userid;
		this.username = username;
		this.useremailid = useremailid;
		this.password = password;
		this.gender = gender;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUseremailid() {
		return useremailid;
	}
	public void setUseremailid(String useremailid) {
		this.useremailid = useremailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		System.out.println("hii iam using setter way of injection");
		this.address = address;
	}
	@Override
	public String toString() {
		return "UserInformation [userid=" + userid + ", username=" + username + ", useremailid=" + useremailid
				+ ", password=" + password + ", gender=" + gender + ", address=" + address + "]";
	}
	
	
	
	
	
	
}
