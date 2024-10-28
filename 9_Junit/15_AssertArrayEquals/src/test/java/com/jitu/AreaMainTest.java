package com.jitu;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class AreaMainTest extends AreaMain {

	@Test
	public void arrayTest() {
		
		int[] arr1= {2,3,4,1};
		int[] arr2=arr1;
		
		Arrays.sort(arr2);
		
		assertArrayEquals(arr1, arr2);
	
	}

}
