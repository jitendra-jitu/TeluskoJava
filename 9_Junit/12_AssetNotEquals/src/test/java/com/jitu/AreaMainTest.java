package com.jitu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AreaMainTest extends AreaMain {

	@Test
	void testAreaOfCircle() {
		assertNotEquals(22.26, AreaMain.AreaOfCircle(3),0.000001,"error occured due to diff b/w actual & expected values");
		
	}
	
	//SUPPLIER
	@Test
	void testAreaOfCircle_Supplier() {
		assertNotEquals(2100000008.26, AreaMain.AreaOfCircle(3),0.00001,()->"error occured due to diff b/w actual & expected values");
		
	}

	
	@Test
	void testAreaOfSquare() {
		
		assertNotEquals(111111, AreaMain.AreaOfSquare(4));
	}

}
