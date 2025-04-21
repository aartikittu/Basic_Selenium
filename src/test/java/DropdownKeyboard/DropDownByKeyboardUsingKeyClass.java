package DropdownKeyboard;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownByKeyboardUsingKeyClass {

	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB");
		driver.manage().window().maximize();
		
		WebElement day= driver.findElement(By.name("birthday_day"));
		day.click();
		day.sendKeys(Keys.ARROW_UP, Keys.ARROW_UP,Keys.ARROW_UP,Keys.ARROW_UP  );
		day.click();
		
		WebElement year=driver.findElement(By.xpath("//select[@aria-label=\"Year\"]"));
		year.click();
		year.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		year.click();
	}
	

}
