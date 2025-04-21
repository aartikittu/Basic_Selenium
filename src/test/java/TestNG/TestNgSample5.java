package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestNgSample5 
{
	@Test(priority = 1)
	public void A()
	{
		System.out.println("A");
	}
	@Test
	public void B()
	{
		System.out.println("B");
	}
	@Test(priority = 0)
	public void C()
	{
		System.out.println("C");
	}
	@Test(priority = -1)
	public void D()
	{
		System.out.println("D");
	}


}
