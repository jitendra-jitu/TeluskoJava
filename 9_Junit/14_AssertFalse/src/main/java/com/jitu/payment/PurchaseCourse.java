package com.jitu.payment;

import com.jitu.dao.Course;

public class PurchaseCourse {
	
	
	private Course course;
	
	
	public boolean ProceeedWithCourse(Course course ) {		
		return course.coursePurchased();
		
	}

}
