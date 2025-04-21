package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SvgElementEx  
{

	public static void main(String[] args) throws Exception
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.kayak.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//*[name()=\"svg\" and @role=\"presentation\"])[1]")).click();
		
	}

}
