package HandlingScrollBar;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingJseByLocatingElement {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		WebElement contact_us=driver.findElement(By.xpath("(//a[@href=\"/contactus\"])[3]") );
		
		Point loc=contact_us.getLocation();
		System.out.println(loc.getX());
		System.out.println(loc.getY());
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(176,451)");
		contact_us.click();
	}

}
	