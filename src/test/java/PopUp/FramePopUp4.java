package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePopUp4 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		WebElement frame= driver.findElement(By.id("singleframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("HI!!!!!!");
	}

}
