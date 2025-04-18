package com.ravi.selenium;

public class CorejavaStringBasics {

	public static void main(String[] args) {
		
		String t=new String("Jami");
		
		System.out.println(t);
		
		String s= "Ravi Kumar Selenium";
		String[] demo=s.split("Kumar");
		System.out.println(demo[0]);
		System.out.println(demo[1]);

		
		String g="JamiRavikumar";
		for(int i=g.length()-1;i>0;i--)
		{
			System.out.println(g.charAt(i));
		}
				
		

	}

}
