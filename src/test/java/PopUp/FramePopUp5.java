package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePopUp5 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/frames");
		
		WebElement nes_frame=driver.findElement(By.xpath("//a[text()=\"Nested Frames\"]"));
		nes_frame.click();
		
	//	WebElement up_frame=driver.findElement(By.name("frame-top"));
		driver.switchTo().frame(0);
		
	//	WebElement middle_frame=driver.findElement(By.name("frame-middle"));
		driver.switchTo().frame("frame-middle");
		
		String text=driver.findElement(By.id("content")).getText();
		System.out.println("Text is---->"+ text);
	}

}
