package com.pojo;

public class pojoB {
	public static void main(String[] args) {
		
		pojoA a=new pojoA();
		
		String name = a.getName();
		System.out.println(name);
		
		a.setName("Green");
		
		String name2 = a.getName();
		System.out.println(name2);
		
		a.setName("Yellow");
		
		String name3 = a.getName();
		System.out.println(name3);
		
		a.setName("Purple");
		
		String name4 = a.getName();		
		System.out.println(name4);
		
		
	}
	
}
	


