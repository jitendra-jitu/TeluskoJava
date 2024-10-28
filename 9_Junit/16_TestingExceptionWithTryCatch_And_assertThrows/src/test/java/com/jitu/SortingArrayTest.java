package com.jitu;

import static org.junit.jupiter.api.Assertions.*;

//import java.util.Arrays;

import org.junit.jupiter.api.Test;

class SortingArrayTest {

	@Test
	void testArrayUsingException() {
		
		
		
//
///
////
/////	Method -1
		
//		int arr[]=null;
			
//		try {
//			
//			SortingArray sortingArray=new SortingArray();
//			sortingArray.sortingarray(arr);
//			
//			for(int x:arr) {
//				System.out.print(x+" ");
//			}
//			
//			System.out.println();
//			System.out.println("End of the code...");
//			
//			fail();		
//			
//		}
//		
//		catch(NullPointerException e) {
//				
//		}
		
////////////////////////////////////////////////////////////////////////////
///
////	
/////		
//		Method -2 
		
		
		int arr[]=null;
//		int arr[]= {1,23,4};
		
		SortingArray sortingArray=new SortingArray();
		assertThrows(NullPointerException.class, ()->sortingArray.sortingarray(arr) );
		
		
		
		
		
		
			
	}

}
