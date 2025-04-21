package KeyBoard_KeyClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyClassEx {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.TAB,Keys.ENTER );
		/*
		 * WebElement password=driver.findElement(By.name("password"));
		 * password.sendKeys(,Keys.TAB); WebElement
		 * login_btn=driver.findElement(By.className("btn_action"));
		 * login_btn.sendKeys(Keys.ENTER);
		 */
	}

}
