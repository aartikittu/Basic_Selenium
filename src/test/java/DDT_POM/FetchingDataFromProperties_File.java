package DDT_POM;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingDataFromProperties_File {

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new ChromeDriver();
		String filePath=System.getProperty("user.dir")+"\\data.properties";
		FileInputStream fis=new FileInputStream(filePath);
		Properties pro=new Properties();
		pro.load(fis);
		
		String URL=pro.getProperty("url");
		String USERNAME=pro.getProperty("username");
		String PASSWORD=pro.getProperty("password");
		
		driver.get(URL);
		driver.manage().window().maximize();
		driver.findElement(By.name("user-name")).sendKeys(USERNAME);
		driver.findElement(By.name("password")).sendKeys(PASSWORD);
		driver.findElement(By.className("btn_action")).click();
	
	}

}
