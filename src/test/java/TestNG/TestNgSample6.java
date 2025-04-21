package TestNG;

import org.testng.annotations.Test;

public class TestNgSample6 
{

		@Test(invocationCount = 1)
		public void A()
		{
			System.out.println("A");
		}
		@Test(invocationCount = 2)
		public void B()
		{
			System.out.println("B");
		}
		@Test(invocationCount = 3)
		public void C()
		{
			System.out.println("C");
		}
		@Test(invocationCount = 4)
		public void D()
		{
			System.out.println("D");
		}
	}


