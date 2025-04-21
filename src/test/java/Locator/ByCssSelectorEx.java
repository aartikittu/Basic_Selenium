package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByCssSelectorEx {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("secret_sauce");
		WebElement login_btn=driver.findElement(By.className("btn_action"));
		login_btn.click();
		
		WebElement shirt=driver.findElement(By.linkText("Test.allTheThings() T-Shirt (Red)"));
		shirt.click();
		
		WebElement back=driver.findElement(By.className("inventory_details_back_button"));
		back.click();
		
		WebElement bike_light=driver.findElement(By.partialLinkText("Sauce Labs Bike Light"));
		bike_light.click(); 

		WebElement add_to_cart=driver.findElement(By.cssSelector("button[class=\"btn_primary btn_inventory\"]"));
		add_to_cart.click();
	}

}
