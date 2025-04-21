package PopUp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPOpUp3 {

	public static void main(String[] args) 
	{
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://filebin.net/");
		
		File file=new File("C:\\Users\\priya\\OneDrive\\Desktop\\aarti.txt");
		
		WebElement ele=driver.findElement(By.id("fileField"));
		
		ele.sendKeys(file.getAbsolutePath());
	}

}
