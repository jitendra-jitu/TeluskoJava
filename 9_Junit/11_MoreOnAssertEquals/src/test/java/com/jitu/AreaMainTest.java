package com.jitu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AreaMainTest extends AreaMain {

	@Test
	void testAreaOfCircle() {
		assertEquals(28.26, AreaMain.AreaOfCircle(3),0.000001,"error occured due to diff b/w actual & expected values");
		
	}
	
	//SUPPLIER
	@Test
	void testAreaOfCircle_Supplier() {
		assertEquals(28.26, AreaMain.AreaOfCircle(3),0.00001,()->"error occured due to diff b/w actual & expected values");
		
	}

	
	@Test
	void testAreaOfSquare() {
		
		assertEquals(16, AreaMain.AreaOfSquare(4));
	}

}
