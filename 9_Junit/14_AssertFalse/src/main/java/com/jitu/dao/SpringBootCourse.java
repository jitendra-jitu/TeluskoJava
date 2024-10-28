package com.jitu.dao;

public class SpringBootCourse implements Course
{

	@Override
	public boolean coursePurchased() 
	{
		System.out.println("SpringBoot course purchased");
		System.out.println("But there is issue with connecting with server");
		return false;
	}
}
