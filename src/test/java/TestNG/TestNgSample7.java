package TestNG;

import org.testng.annotations.Test;

public class TestNgSample7 
{

	@Test(enabled = false)
	public void A()
	{
		System.out.println("A");
	}
	@Test(enabled = true)//by default it is true
	public void B()
	{
		System.out.println("B");
	}
	@Test(enabled = false)
	public void C()
	{
		System.out.println("C");
	}
	@Test(enabled = true)
	public void D()
	{
		System.out.println("D");
	}
}
