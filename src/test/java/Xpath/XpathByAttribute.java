package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("secret_sauce");
		WebElement login_btn=driver.findElement(By.className("btn_action"));
		login_btn.click();
		
		WebElement item1=driver.findElement(By.xpath("//div[@class=\"inventory_item_name\"]"));
		item1.click();
		
	}

}
