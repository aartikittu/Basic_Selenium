package PopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingEx1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.xpath("//button[contains(text(), \"click\")]")).click();
		
		String main_id=driver.getWindowHandle();
		Set<String> ids=driver.getWindowHandles();
		System.out.println("main Id "+ main_id);
		System.out.println(ids);
		
		for(String id:ids)
		{
			if(!id.contains(main_id))
			{
				driver.switchTo().window(id);
			}
		}
		
		driver.findElement(By.xpath("//span[text()=\"Downloads\"]")).click();
	}

}
