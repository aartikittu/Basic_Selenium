package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestNgSample2 
{
	@Test
	public void createContact()
	{

	System.out.println("contact created TestNgSample2");

	}
    @Test(priority=0, enabled = false )
	public void modifyContact()
	{
		System.out.println("modify contact TestNgSample2");
	}
	
	@Test(priority=-1 )
	public void deleteContact()
	{
		System.out.println("delete contact TestNgSample2");
	}
}
