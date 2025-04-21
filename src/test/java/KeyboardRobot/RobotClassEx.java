package KeyboardRobot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassEx {

	public static void main(String[] args) throws AWTException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt=\"Become a Seller\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"styles__ButtonStyle-sekd9q-0 jSCZCD styles__Button-sc-a90kxg-8 styles__SecondaryButton-sc-a90kxg-9 styles__SignUpButton-sc-1lklol6-41 kIPDMU\"]")).click();
		driver.findElement(By.xpath("//input[@class=\"styles__StyledInput-cql555-1 fPuYwe styles__CustomInput-sc-12mlfxt-3 bfXnRM sign-up\"]")).sendKeys("9015643220");
		Robot rob=new Robot();
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyRelease(KeyEvent.VK_TAB);
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyRelease(KeyEvent.VK_TAB);
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("aarti.gupta745@gmail.com");
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyRelease(KeyEvent.VK_TAB);
		rob.keyPress(KeyEvent.VK_TAB);
		rob.keyRelease(KeyEvent.VK_TAB);
		driver.findElement(By.xpath("//input[@label=\"Enter GSTIN\"]")).sendKeys("bkjabdkjbaJKD");
	}

}
