package com.jitu.dao;

public class JunitCourse implements Course
{

	@Override
	public boolean coursePurchased() 
	{
		System.out.println("Junit course purchased");
		System.out.println("But there is issue with connecting with server");
		return false;
	}

}
