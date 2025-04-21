package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFollowingSibling {

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
		
		WebElement ele=driver.findElement(By.xpath("//option[@value=\"az\"]/following-sibling::option"));
		ele.click();
		
	}

}
