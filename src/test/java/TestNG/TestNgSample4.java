package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestNgSample4 
{
	@Test(enabled=false)
	public void createContact()
	{

	System.out.println("contact created TestNgSample4");

	}
    @Test(priority=0)
	public void modifyContact()
	{
		System.out.println("modify contact TestNgSample4");
	}
	
	@Test(priority=-1)
	public void deleteContact()
	{
		System.out.println("delete contact TestNgSample4");
	}
}
