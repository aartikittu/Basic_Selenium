package PopUp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPOpUP {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
				
		File upload=new File("C:\\Users\\priya\\OneDrive\\Desktop\\aarti.txt");
		
		Thread.sleep(1000);
		
		WebElement upload_file=driver.findElement(By.id("file-upload"));
		
		Thread.sleep(1000);
		
		upload_file.sendKeys(upload.getAbsolutePath());
		
		Thread.sleep(1000);
		
		//driver.findElement(By.id("file-submit")).click();
		
	}

}
