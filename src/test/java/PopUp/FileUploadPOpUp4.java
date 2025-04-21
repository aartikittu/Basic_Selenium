package PopUp;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPOpUp4 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jumpshare.com/file-sharing/txt");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		File file=new File("C:\\Users\\priya\\OneDrive\\Desktop\\Aarto.txt");
		
		Thread.sleep(2000);
		
		WebElement ele=driver.findElement(By.xpath("//p[contains(text(),\"drop the file here\")]"));
		
		//ele.click();
		Thread.sleep(5000);
		
		ele.sendKeys(file.getAbsolutePath());
		
		}

}
