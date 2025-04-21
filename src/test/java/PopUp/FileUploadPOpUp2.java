package PopUp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPOpUp2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/upload-download.php");
	       
		File file=new File("C:\\Users\\priya\\OneDrive\\Desktop\\aarti.txt");
		
		WebElement ele = driver.findElement(By.id("uploadFile"));
			    
		ele.sendKeys(file.getAbsolutePath());
		
		  if (ele.getAttribute("value").equalsIgnoreCase("save.pdf")) {
		         System.out.println("File uploaded successfully ");
		      } else {
		         System.out.println("File uploaded unsuccessfully ");
		      }

	       
	}

}
