package basic;

import java.time.Duration;

import javax.swing.plaf.basic.BasicSliderUI.ActionScroller;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import HandlingScrollBar.UsingJavaScriptExecutor;

public class ScrollToEnd
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		Actions act=new Actions(driver);
		act.moveByOffset(50, 50).click().perform();
		WebElement iphone=driver.findElement(By.xpath("//span[@class=\"appSprite icAppStore pointer\"]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",iphone);		
		
	}
	
}
