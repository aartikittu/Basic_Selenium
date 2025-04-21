package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion2 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.className("Pke_EE"));
		search.sendKeys("iphone");
		Thread.sleep(2000);	
		List<WebElement> allsugg=driver.findElements(By.xpath("//ul[@class=\"_1sFryS _2x2Mmc _3ofZy1\"]"));
		//System.out.println(allsugg);
		for(WebElement sugg:allsugg)
		{
			System.out.println(sugg.getText());
			String val=sugg.getText();
			if(val.contains("16"))
			{
				System.out.println("Hi!!!!!!!!!!!");
				sugg.click();
				break;
			}
		}
	}

}
