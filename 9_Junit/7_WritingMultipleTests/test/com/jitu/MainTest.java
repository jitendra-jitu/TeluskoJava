package com.jitu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void WordTest() {	
		assertEquals(Main.ReverseString("immu"),"ummi");
	}
	
	
	@Test
	void SentenceTest() {
		assertEquals(Main.ReverseString("he is he"),"eh si eh");
	}

}
