package com.example.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertTest {

	@Test
	public void test() {
		boolean cond = true;
		assertEquals(true,cond);
		assertTrue(cond);
		assertFalse(cond);
	}

}
