package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePopUp7 {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/frames");
		
		driver.findElement(By.xpath("//a[text()=\"iFrame\"]")).click();
		
		WebElement frame=driver.findElement(By.id("mce_0_ifr"));
		
		//driver.switchTo().frame(frame);
	}

}
