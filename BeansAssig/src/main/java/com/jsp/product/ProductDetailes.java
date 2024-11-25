package com.jsp.product;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
public class ProductDetailes {
	public static void sortingByPrice(List products)
	{
		Collections.sort(products);
		System.out.println(products);
		
	}
	public static void productIdEven(List p)
	{
		ListIterator c=p.listIterator();
		while(c.hasNext())
		{
			Product product=(Product)c.next();
			if(product.getProductId()%2==0)
			{
				System.out.println(product);
			}
		}
	}
	public static void productPriceByReverse(List p)
	{
		ListIterator c=p.listIterator();
		while(c.hasNext())
		{
			Product product=(Product)c.next();
			int p1=product.getProductPrice();
			System.out.println(p1+" ascending  order : "+rev(p1));
		}
	}
	public static String rev(int  price)
	{
		String n=price+"";//672
		char[] a=n.toCharArray();// 7 6 3 1
		          //                6 7 3 1
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					char temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		String res="";
		for(char t:a)
		{
			res+=t;
		}
		return res;
		
	}

}
