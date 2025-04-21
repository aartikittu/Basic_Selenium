package DropdownBySelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByVisibleText {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB");
		driver.manage().window().maximize();

		WebElement day=driver.findElement(By.name("birthday_day"));
		Select select=new Select(day);
		select.selectByVisibleText("7");

	}

}
