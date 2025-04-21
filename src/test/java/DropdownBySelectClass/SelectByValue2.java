package DropdownBySelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		driver.manage().window().maximize();
		
		WebElement day = driver.findElement(By.name("birthday_day"));
		Select select=new Select(day);
		select.selectByValue("7");
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select select1=new Select(month);
		select1.selectByValue("9");
		
		WebElement year=driver.findElement(By.name("birthday_year"));
		Select select2=new Select(year);
		select2.selectByValue("1992"); 
		
	}

}
