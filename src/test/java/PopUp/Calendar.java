package PopUp;

import java.beans.JavaBean;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calendar {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		act.moveByOffset(50, 100).click().perform();
		
		Thread.sleep(1000);

		WebElement departure=driver.findElement(By.xpath("//span[text()=\"Departure\"]"));
		departure.click();
		
		Thread.sleep(2000);
		WebElement date= driver.findElement(By.xpath("//div[text()=\"April 2025\"]/ancestor::div[@class=\"DayPicker-Month\"]/descendant::p[text()=\"16\"]"));
		date.click();
		
	}

}
