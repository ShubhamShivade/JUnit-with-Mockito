package com.bharath.trainings.junit;

public class GreetingImpl implements Greeting {

	@Override
	public String greet(String name) {
		
		if(name == null || name.length() == 0) {
			throw new IllegalArgumentException();
		}
		
		
		return "Hello "+name;
	}

}
//
//	
//	@Before 
//	public void setup() {
//		greeting = new GreetingImpl();
//		
//	}
//
//	
//	
//	@Test(expected=IllegalArgumentException.class)
//	public void greetShouldThrowAnException_For_NameIsNull() {
//		greeting.greet(null);
//	}
//	
//	
//	@Test(expected=IllegalArgumentException.class)
//	public void greetShouldThrowAnException_For_NameIsBlank() {
//		greeting.greet("");
//	}
//
//	@After
//	public void teardown() {
//		greeting = null;
//	}
//
//	
//}

