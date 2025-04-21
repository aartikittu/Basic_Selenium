package web_element_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement login_btn=driver.findElement(By.className("btn_action"));
		login_btn.click();
		
		WebElement add_to_cart=driver.findElement(By.xpath("//button[@class=\"btn_primary btn_inventory\"]"));
		System.out.println(add_to_cart.isSelected());
	}

}
