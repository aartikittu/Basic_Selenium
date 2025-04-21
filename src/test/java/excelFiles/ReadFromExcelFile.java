package excelFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{

		String file_path=System.getProperty("user.dir")+"\\data\\Book.xlsx";	
		FileInputStream fis=new FileInputStream(file_path);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sheet=book.getSheet("Sheet1");
		Row row=sheet.getRow(1);
		Cell cell=row.getCell(1);
		String str=cell.getStringCellValue();
		
		System.out.println(str);
	}

}
