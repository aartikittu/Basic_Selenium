package basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllDropDown {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		WebElement month= driver.findElement(By.id("month"));
		Select select=new Select(month);
		List<WebElement> values = select.getOptions();
		System.out.println("All values------>");
		for(WebElement value:values)
			System.out.println(value.getText());
		
	}

}
