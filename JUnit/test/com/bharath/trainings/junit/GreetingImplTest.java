package com.bharath.trainings.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class GreetingImplTest {

	
	
	@Test
	public void greetShouldReturnValidOutput() {
//	fail("Not yet implemented");
		Greeting greeting = new GreetingImpl();
		String result = greeting.greet("Junit");
		assertNotNull(result);
		assertEquals("Hello Junit", result);
		
	}
//	@Test
//	public void greetShouldThrowAnException_For_NameIsNull() {
//		Greeting greeting = new GreetingImpl();
//		greeting.greet(null);
//	}
}