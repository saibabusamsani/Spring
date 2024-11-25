package com.dj.model;

public class Address {
	private String city ;
	private String area;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		String res="";
		int n=city.length();
		int j=0;
		for(int i=0;i<n;i++)
		{
			if(i<n/2)
			{
				res+=city.charAt(i);
			}
			else
			{
				res+=city.charAt(n-1-j);
				j++;
			}
		}
		System.out.println(res);
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		int n=area.length();
		char[] v= {'a','e','i','o','u'};
		String res="";
		for(int i=0;i<n;i++)
		{
			boolean isVowel=false;
			for(int j=0;j<v.length;j++)
			{
				if(area.charAt(i)==v[j])
				{
					isVowel=true;
					break;
				}
	
			}
			if(isVowel)
			{
				res+="@";
			}
			else
			{
				res+=area.charAt(i);
			}
		}
		System.out.println(res);
		this.area = area;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", area=" + area + "]";
	}
	
	

}
