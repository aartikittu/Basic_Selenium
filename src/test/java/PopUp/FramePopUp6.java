package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePopUp6 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/frames");
		
		driver.findElement(By.xpath("//a[text()=\"Nested Frames\"]")).click();
		
		driver.switchTo().frame("frame-top");
		
		driver.switchTo().frame("frame-left");
		
		WebElement left_ele=driver.findElement(By.xpath("//body[contains(text(),\"LEFT\")]"));
		System.out.println("Text----> "+left_ele.getText());
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("frame-middle");
		
		WebElement mid_ele=driver.findElement(By.id("content"));
		System.out.println("Text----> "+mid_ele.getText());
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("frame-right");
		
		WebElement right_ele=driver.findElement(By.xpath("//body[contains(text(),\"RIGHT\")]"));
		System.out.println("Text----> "+right_ele.getText());
		
		driver.switchTo().parentFrame();
		
		//WebElement bot_frame=driver.findElement(By.xpath("//frame[@name=\"frame-bottom\"]"));
		
		driver.switchTo().parentFrame();
		
		driver.switchTo().frame("frame-bottom");
		
		WebElement bot_ele=driver.findElement(By.xpath("//body[contains(text(),\"BOTTOM\")]"));
		System.out.println("Text----> "+bot_ele.getText());
				
	}

}
