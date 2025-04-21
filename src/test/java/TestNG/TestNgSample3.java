package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestNgSample3 
{
	@Test(invocationCount = 2, priority = -1)
	public void createContact()
	{

	System.out.println("contact created TestNgSample3");

	}
    @Test
	public void modifyContact()
	{
		System.out.println("modify contact TestNgSample3");
	}
	

	public void deleteContact()
	{
		System.out.println("delete contact TestNgSample3");
	}
}
