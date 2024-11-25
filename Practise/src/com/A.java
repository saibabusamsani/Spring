package com;

import java.util.PriorityQueue;

public class A
{
	public static void main(String[] args) {
	}
	public static int[] selection(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			int index=i;
//			5,4,3,2,1
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j]) index=j;
				
			}
		}
	}
}