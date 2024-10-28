package com.jitu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AreaMainTest {

	@Test
	void testAreaOfCircle() {
		
		
		//1
	    assertEquals(32.1536, AreaMain.AreaOfCircle(3.2), 0.0001);
//		Delta/Epsilon: 0.0001 ensures the comparison allows minor differences due to how floating-point numbers are represented in memory.
	
	        
	    //2
//	    assertEquals(32.1536, AreaMain.AreaOfCircle(3.2), "This has error difference in between the Actual & expected");
//	    void org.junit.jupiter.api.Assertions.assertEquals (
//	    		double expected, 
//	    		double actual, 
//      		String message
//	    )
	    
	    
	    
	}
	
	
	
	@Test
	void testAreaOfSquare() {
		
		//1
	    assertEquals(16, AreaMain.AreaOfSquare(4), "ERROR IN FINDING THE AREA OF THE SQUARE");
//		Delta/Epsilon: 0.0001 ensures the comparison allows minor differences due to how floating-point numbers are represented in memory.
	     
	}

}
