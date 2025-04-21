package basic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.GoogleSearchPage;
public class GoogleSearch {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		GoogleSearchPage g=new GoogleSearchPage(driver);
		g.searchTheQues("Hi!!");
		
	}

}
