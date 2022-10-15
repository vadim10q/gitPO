package com.luxygod.automation;

 import static org.junit.Assert.assertTrue;

import org.junit.Test;

// import static org.junit.Assert.*;
import org.junit.Ignore;


/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
	public void testShouldBePassed() {
		assertTrue(true);
	}

	@Test
	public void testShouldBeFailed() {
		assertTrue(false);
	}

	@Ignore("Not implemented yet")
	@Test
	public void testShouldBeSKipped() {
		assertTrue(true);
	}
	
	@Test
	public void testAnotherMethod() {
		App.doNothing();
	}
	
	@Test
	public void testAnotherClass() {
		EmptyClass.emptyMethod();
	}
}
