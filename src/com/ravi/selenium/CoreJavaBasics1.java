package com.ravi.selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBasics1 {

	public static void main(String[] args) {
		
		//If and else statements in Array
		
		int []  k = {1,2,3,4,5,6,7,8,9,11,14,16,18,12,13,15,17 };
		for(int i=0;i<k.length;i++)
		{
			if(k[i] % 2 ==0)
			{
				System.out.println(k[i]);
				break;
			}
			else
			{
				System.out.println(k[i]+ "this number is not multiple by 2");
			}
		}
		//ArrayList storing and printing Integer Values
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		System.out.println(al);
		
		ArrayList<String> br = new ArrayList<String>();
		br.add("Hyd");
		br.add("Pune");
		br.add("Noida");
		br.add("Vizag");
		br.add("Mumbai");
		
		for(int i =0; i<br.size();i++)
		{
			System.out.println(br.get(i));
			
		}
		for(String s:br)
		{
			System.out.println(s);
			
		}
		String[] name = {"Phython","C++","Javascript","HTML-CSS"};
		List<String> demo=Arrays.asList(name);
		System.out.println(demo.contains("C++"));
		System.out.println(demo);
		
		
		
			
		
		
				
		
		
		

	}

}
