package com.example.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {

	@Test
	public void sum_whit3numbers() {
//		fail("Not yet implemented");
		MyMath myMath = new MyMath();
		
		assertEquals(6,myMath.sum(new int[] {1,2,3}));
	}
	
	@Test
	public void sum_whit1numbers() {
		MyMath myMath = new MyMath();
		
		assertEquals(3,myMath.sum(new int[] {3}));
	}
	
	

}
