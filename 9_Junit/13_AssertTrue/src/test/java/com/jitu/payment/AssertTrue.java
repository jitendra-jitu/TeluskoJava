package com.jitu.payment;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AssertTrue {
	
	@Test
	public void TestAssertTrue() {
		
//		assertTrue(true);
		
		
		String str="jitu";
		assertTrue(str.equals("jitu"),"ASSERTION FAILED.......");
	}

}
