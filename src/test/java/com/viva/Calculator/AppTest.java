package com.viva.Calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class AppTest 
{
	App app;
	@Before
	public void init() {
		app = new App();
	}
	
	@Test
	public void addTest() {
		assertEquals(25, app.add(12, 13));
	}
  
}
