package basic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LoginEx {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://example.com/login");
		WebElement username= driver.findElement(By.id("username"));
		WebElement password= driver.findElement(By.id("password"));
		username.sendKeys("testuser");
		password.sendKeys("password123");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.close();
		
		WebElement countryList=driver.findElement(By.id("country"));
		Select select=new Select(countryList);
		select.selectByVisibleText("India");
		 
		Alert alt=driver.switchTo().alert();
		String text=alt.getText();
		alt.accept();
		System.out.println(text);
		
		Set<String> ids= driver.getWindowHandles();
		for(String id:ids)
		{
			if(id.equals("14546"))
			{
				driver.switchTo().window(id);
				break;
			}
		}
		 
		TakesScreenshot ss=(TakesScreenshot)driver;
		File src=ss.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\Screenshot.png");
		FileUtils.copyFile(src, dest);
		

		WebElement drag=driver.findElement(By.id("drag"));
		WebElement drop=driver.findElement(By.id("drop"));

			Actions act=new Actions(driver);
			act.dragAndDrop(drag, drop).perform();

		
	}

}
