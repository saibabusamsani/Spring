package com.dj.model;

public class User {
	Bike bike;
	String name;
	public User(Bike bike,String name)
	{
		this.bike=bike;
		this.name=name;
	}
	public  void welcome() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Teca show room : "+name);

	}
	public  void bikeDetaile() {
		System.out.println("name of the bike : "+bike.nameOfBike());
		System.out.println("cc of the bike : "+bike.ccOfBike());
		System.out.println("color of the bike : "+bike.colorOfBike());

	}
	public void thankYou()
	{
		System.out.println("Thank you visit again......");
	}
}
