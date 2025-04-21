package DropdownXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownXpath2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//option[text()=\"7\"]")).click();
		
		driver.findElement(By.xpath("//option[text()=\"Sep\"]")).click();
		
		driver.findElement(By.xpath("//option[text()=\"1992\"]")).click();
	}

}
