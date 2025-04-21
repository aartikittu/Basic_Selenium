package PopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingEx2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.xpath("//a[text()=\"Open New Seperate Windows\"]")).click();
		driver.findElement(By.xpath("//button[text()=\"click\"]")).click();
		
		Set<String> ids=driver.getWindowHandles();
		
		for(String id:ids)
		{
			System.out.println(id);
			System.out.println(driver.getTitle());
		}
		for(String id:ids)
		{
			if(driver.getTitle().equals("Selenium"));
			{
				driver.switchTo().window(id);
			}
		}
		driver.findElement(By.xpath("//span[text()=\"Downloads\"]")).click();
	}

}
