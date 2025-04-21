package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.xpath("//input[@class=\"Pke_EE\"]"));
		search.sendKeys("H&M");
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@class=\"_1sFryS _2x2Mmc _3ofZy1\"]"));
		System.out.println(elements);
		Thread.sleep(1000);
		for(WebElement ele:elements)
		{
			System.out.println(ele.getText());
		}
	}
	

}
