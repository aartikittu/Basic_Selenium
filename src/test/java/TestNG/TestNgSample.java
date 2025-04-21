package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestNgSample 
{
	@Test(priority = -1,invocationCount = 2)
	public void createContact()
	{
		Assert.fail();
	System.out.println("contact created TestNgSample");

	}
    @Test(dependsOnMethods = "createContact")
    public void modifyContact()
	{
    	
		System.out.println("modify contact TestNgSample");
	}
	
	@Test(priority=1,enabled =false )
	public void deleteContact()
	{
		System.out.println("delete contact TestNgSample");
	}
	
	@Test
	public void updateContact()
	{
		System.out.println("update contact TestNgSample");
	}
}
