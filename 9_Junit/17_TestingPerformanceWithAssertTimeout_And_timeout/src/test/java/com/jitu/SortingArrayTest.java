package com.jitu;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

//import java.util.Arrays;

import org.junit.jupiter.api.Test;

class SortingArrayTest {

	@Test
	void testArrayUsingException() {

		int arr[]= {1,2,3,4,5};
		SortingArray sortingArray=new SortingArray();
		
//		assertTimeout(Duration.ofNanos(100000), ()->sortingArray.sortingarray(arr) );	// Negative case
		
		assertTimeout(Duration.ofMillis(1), ()->sortingArray.sortingarray(arr) );	// Positive case
				
	}

}
