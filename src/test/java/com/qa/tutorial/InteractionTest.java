package com.qa.tutorial;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InteractionTest {
	
	@Test
	public void greetingtest() {
			Interraction interraction = new Interraction(); 
			assertEquals("Hi friend", interraction.greeting());
	}

}
