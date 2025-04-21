package basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.HomePage;
import POM.LoginPage;

public class HomePageDriver {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		String file_path=System.getProperty("user.dir")+"\\data.properties";
		FileInputStream fis=new FileInputStream(file_path);
		Properties pro=new Properties();
		pro.load(fis);
	
		String URL=pro.getProperty("url");
		driver.get(URL);
				
		String filepath1=System.getProperty("user.dir")+"\\Book.xlsx";
		FileInputStream fis1=new FileInputStream(filepath1);
		Workbook book=WorkbookFactory.create(fis1);
		Sheet sheet=book.getSheet("Sheet1");
		Row row=sheet.getRow(1);
		Cell cell=row.getCell(0);
		String username=cell.getStringCellValue();
		
		Cell cell1=row.getCell(1);
		String password=cell1.getStringCellValue();
		
		LoginPage lp=new LoginPage(driver);
		lp.loginToApp(username, password);

		HomePage hp=new HomePage(driver);
		hp.clickItem();
		
	}

}
