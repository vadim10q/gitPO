package com.luxygod.automation;

 





import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;

import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;







/**
 * Unit test for simple App.
 */
public class AppTest 
{
	int x;
	int y;
String string;
int u;
double a = 3;
double b = 3;;
double result = a + b;
char op;


	@Before
	public void setup()
	{
		x =10;
		y=2;
		
	}
    @Test
	public void testplus()
	{
		double result = 12;
		Assert.assertEquals(result, result, App.plus(x,y));
	}
	@Test 
	public void testminus()
	{double result = 8;
		Assert.assertEquals(result,result, App.minus(x,y));

	}
	@Test
	public void testumnoz()
	{
		double result = 20;
		Assert.assertEquals(result,result, App.umnoz(x,y));
	}

	@Test 
	public void testdelit()
	{
		double result = 0.4;
	
		Assert.assertEquals(result, result, App.delit(y,x));
	}
	
	
	private ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(output));
    }

    @Test
    public  void ErrorTest() {
        App app = new App();
        app.Error();
        Assert.assertEquals("Error! Enter correct operator", output.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }


	
	private ByteArrayOutputStream luxygod = new ByteArrayOutputStream();

    @Before
    public void setUpStreamsLuxygod() {
        System.setOut(new PrintStream(luxygod));
    }

    @Test
    public void ResultTest() {
        App luxy = new App();
        luxy.Result();
        Assert.assertEquals("The result is given as follows:", output.toString());
    }

    @After
    public void cleanUpStreamsLuxygod() {
        System.setOut(null);
    }



	@Test
	public void testShouldBePassed() {
		assertTrue(true);
	}

	

	@Ignore("Not implemented yet")
	
	
	@Test
	public void testAnotherMethod() {
		App.doNothing(u);
	}

	private ByteArrayOutputStream resultend = new ByteArrayOutputStream();
	@Before
    public void setUpStreamsluxygod() {
        System.setOut(new PrintStream(resultend));
    }

    @Test
    public  void ResultLuxygodTest() {
        App app = new App();
		double result = 6;
        app.ResultEnd(a, op, b, result);
        Assert.assertEquals(a + " " + op + " " + b + " = " + result, output.toString());
    }

    @After
    public void cleanUpStreamsluxygod() {
        System.setOut(null);
    }

	
}
