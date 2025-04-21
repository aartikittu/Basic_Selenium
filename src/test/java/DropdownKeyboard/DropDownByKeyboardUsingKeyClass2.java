package DropdownKeyboard;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownByKeyboardUsingKeyClass2 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/lifecycle/steps/signup/name?dsh=S1157733638:1742392527408747&flowEntry=SignUp&flowName=GlifWebSignIn&ifkv=AXH0vVu393plfjLoxaZIZnOLM6oe0qLHlPNyWjwS2tY9FRpiEiFjHXwF3bP7dm1v8WlmlYgktygpow&TL=ADBLaQDZxbVYQR5UkZDKZfdIVxQ3sQBxPmgwEMLd24A1JZe8zxgo6MSRMfFqt4t4&continue=https://accounts.google.com/ManageAccount?nc%3D1");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class=\"VfPpkd-RLmnJb\"]")).click();	
		driver.findElement(By.name("firstName")).sendKeys("Aarti");
		driver.findElement(By.xpath("//input[@aria-label=\"Last name (optional)\"]")).sendKeys("Gupta");
		driver.findElement(By.xpath("//div[@class=\"VfPpkd-RLmnJb\"]")).click();
		WebElement day=driver.findElement(By.id("month"));
		day.click();
		day.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.TAB,"7",Keys.TAB,"2014",Keys.TAB);
		WebElement gender=driver.findElement(By.id("gender"));
		gender.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
	}

}
