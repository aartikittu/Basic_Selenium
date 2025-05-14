package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://easyupload.io/");
		WebElement fileUpload= driver.findElement(By.className("dz-button"));
		//fileUpload.click();
		fileUpload.sendKeys("‪D:\\aarti2\\aarti2\\gst.txt");
	}

}
