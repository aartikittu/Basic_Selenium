package DropdownXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownXpath {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB");
		driver.manage().window().maximize();
		WebElement day= driver.findElement(By.xpath("//option[text()=\"3\"]"));
	//	)
		day.click();
	}

}
