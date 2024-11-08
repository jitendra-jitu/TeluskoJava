package com.jitu.payment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.jitu.dao.Course;
import com.jitu.dao.JavaCourse;
import com.jitu.dao.JunitCourse;
import com.jitu.dao.SpringBootCourse;

class PurchaseCourseTest {

	@Test
	void testProceeedWithJavaCourse() {
		
		PurchaseCourse purchaseCourse = new PurchaseCourse(); 
		
		Boolean status=purchaseCourse.ProceeedWithCourse(new JavaCourse());
		assertTrue(status);
		
//		purchaseCourse.ProceeedWithCourse(new JunitCourse());
//		purchaseCourse.ProceeedWithCourse(new SpringBootCourse());
		
	}
	
	
	@Test
	void testProceeedWithJunitCourse() {
		
		PurchaseCourse purchaseCourse = new PurchaseCourse(); 
		
		
//		purchaseCourse.ProceeedWithCourse(new JavaCourse());
		boolean status = purchaseCourse.ProceeedWithCourse(new JunitCourse());
		assertTrue(status);
		
//		purchaseCourse.ProceeedWithCourse(new SpringBootCourse());
		
	}
	
	
	@Test
	void testProceeedWithSpringCourse() {
		
		PurchaseCourse purchaseCourse = new PurchaseCourse(); 
		
//		purchaseCourse.ProceeedWithCourse(new JavaCourse());
//		purchaseCourse.ProceeedWithCourse(new JunitCourse());
		boolean status = purchaseCourse.ProceeedWithCourse(new SpringBootCourse());
		assertTrue(status);
		
		
		
	}
	
	

}
