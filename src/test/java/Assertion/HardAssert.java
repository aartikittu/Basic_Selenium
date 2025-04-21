package Assertion;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

public class HardAssert 
{
	@Test
	public void createCustomer()
	{
		System.out.println("Step 1");
		System.out.println("Step 2");
		Assert.assertEquals(true, true);
		System.out.println("Step 3");
		System.out.println("Step 4");
	}
	
	@Test
	public void m1()
	{
		String expName="aarti";
		String actName="aarti";
		System.out.println("Step 1");
		System.out.println("Step 2");
		Assert.assertEquals(expName, actName);
		System.out.println("Step 3");
		System.out.println("Step 4");
	
	}
}
