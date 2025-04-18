package com.ravi.selenium;

public class CoreJavaBasics {

	public static void main(String[] args) {
		
		
		// this is basics of Java variables, different types of ARRAY Declaration
		// Also learned For Loop and Enhanced for Loop
		int f = 10;
		double g = 5.6;
		boolean s = true;
		String t = "Selenium";
		char d = 'x';
		
		System.out.println(t);
		System.out.println(s+ "  " + "is blooean value");
		
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 5;
		arr[4] = 10;
		
		System.out.println(arr[4]);
		
		
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		for(int w:arr)
		{
			System.out.println(w);
		}
		
		String[] z= {"ravi","course","Selenium","Udemy"};
		for(int i=0; i<z.length; i++)
		{
			System.out.println(z[i]);
		}
		for(String v:z)
		{
			System.out.println(v);
		}
		
		
		
		

	}

}
