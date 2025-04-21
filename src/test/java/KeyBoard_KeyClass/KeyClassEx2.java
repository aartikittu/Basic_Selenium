package KeyBoard_KeyClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyClassEx2 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//img[@alt=\"Become a Seller\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"styles__ButtonStyle-sekd9q-0 jSCZCD styles__Button-sc-a90kxg-8 styles__SecondaryButton-sc-a90kxg-9 styles__SignUpButton-sc-1lklol6-41 kIPDMU\"]")).click();
		/*
		 * Thread.sleep(2000); Alert alt=driver.switchTo().alert(); alt.dismiss();
		 */
		driver.findElement(By.xpath("//input[@class=\"styles__StyledInput-cql555-1 fPuYwe styles__CustomInput-sc-12mlfxt-3 bfXnRM sign-up\"]")).sendKeys("9015643220",Keys.TAB,Keys.TAB,"aarti.gupta745@gmail.com",Keys.TAB,Keys.TAB,"ABNDSDSDSAD");
	}

}
