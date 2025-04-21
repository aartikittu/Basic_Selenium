package Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEx 
{
	@Test
	public void A()
	{
		System.out.println("A");
		System.out.println("B");
		SoftAssert soft=new SoftAssert() ;
		soft.assertEquals(false, true);
		System.out.println("C");
		System.out.println("D");
		soft.assertAll();
	}

}
