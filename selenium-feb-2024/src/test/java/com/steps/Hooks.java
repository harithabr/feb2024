package com.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	
	@Before
	public void setup() {
		System.out.println("i am a setup");
	}
	
	@After
	public void teardown() {
		System.out.println("i am a teardown");
	}
}
