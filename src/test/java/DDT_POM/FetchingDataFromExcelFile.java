package DDT_POM;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingDataFromExcelFile {

	public static void main(String[] args) throws IOException 
	{
		//Read data from property file
		
		String file_path=System.getProperty("user.dir")+"\\data.properties";
		FileInputStream fis=new FileInputStream(file_path);
		Properties pro=new Properties();
		pro.load(fis);
		String URL=pro.getProperty("url");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get(URL);
		
		//Read data from excel file
		
		String file_path1=System.getProperty("user.dir")+"\\Book.xlsx";
		FileInputStream fis1=new FileInputStream(file_path1);
		Workbook book=WorkbookFactory.create(fis1);
		Sheet sheet=book.getSheet("Sheet1");
		Row row=sheet.getRow(1);
		Cell cell=row.getCell(0);
		String username=cell.getStringCellValue();
		
		Row row1=sheet.getRow(1);
		Cell cell1=row1.getCell(1);
		String password=cell1.getStringCellValue();
		
		driver.findElement(By.id("user-name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("btn_action")).click();
		
	}

}
