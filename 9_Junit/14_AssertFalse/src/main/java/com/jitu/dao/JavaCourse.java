package com.jitu.dao;

public class JavaCourse implements Course
{

	@Override
	public boolean coursePurchased() 
	{
		System.out.println("Java course purchased");
		System.out.println("But there is issue with connecting with server");
		
		return false;
	}
}
