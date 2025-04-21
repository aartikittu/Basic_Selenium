package basic;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	@Test
	public void launchBrowser()
	{
		Thread thread=new Thread();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//img[@alt=\"Appliances\"]"));
		
		ele.click();
		
		WebElement ele1=driver.findElement(By.xpath("//a[text()=\"Explore\"]"));
		ele1.click();
		
	//		driver.close();
		
		
		
	}

}
