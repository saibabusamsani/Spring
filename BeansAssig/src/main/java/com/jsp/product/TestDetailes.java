package com.jsp.product;

public class TestDetailes {
	public void evenOrNot(int n)
	{
	
		if(n%2==0)
		{
			System.out.println(n+" is even ");
		}
		else
		{
			System.out.println(n+" is odd ");
		}
	}
	public void Armstrong(int n)
	{
		if(n==sum(n,0))
		{
			System.out.println(n+" is amstrong number");
		}
		else
		{
			System.out.println(n+" is not a amstrong number");
		}
		
		
		
	}//145
	//1+24+120
	public int sum(int n,int sum)
	{
		if(n!=0)
		{
			sum+=fact(n%10,1);
			return sum(n/10,sum);
		}
		return sum;
		
	}
	public int  fact(int n,int f)//143
	{
		if(n>0)
			
			return fact(n-1,f*n);
		else
			return f;
	
	}
	public void prime(int n)
	{
		int c=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				c++;
		}
		if(c==0)
			System.out.println(n+" is prime");
		else
			System.out.println(n+" is not prime");
			
	}
	public void revOfString(String s)
	{
		String r="";
		for(int i=0;i<s.length();i++)
		{
			r=s.charAt(i)+r;
		}
		System.out.println(s+" reverse : "+r);
	}

}
