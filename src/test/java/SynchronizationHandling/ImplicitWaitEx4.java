package SynchronizationHandling;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitEx4 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();		
		
		Options opt=driver.manage();
		Timeouts time=opt.timeouts();
		time.implicitlyWait(Duration.ofSeconds(10));
	}

}
