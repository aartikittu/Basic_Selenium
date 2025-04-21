package propertyFiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WritePropertiesFile {

	public static void main(String[] args) throws IOException 
	{
		Properties properties=new Properties();
		properties.setProperty("name", "Aarti Gupta");
		properties.setProperty("emailId", "aarti.gupta745@gmail.com");
		properties.setProperty("age", "25");
		
		String filePath=System.getProperty("user.dir")+"\\data\\example.properties";
		FileOutputStream file=new FileOutputStream(filePath);

		properties.store(file , "sample data in properties");
		file.close();
		
		System.out.println("properties are written into "+filePath);
	}
}
