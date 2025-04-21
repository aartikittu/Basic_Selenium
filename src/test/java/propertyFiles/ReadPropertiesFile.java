package propertyFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException 
	{
		Properties pro=new Properties();
		String filePath=System.getProperty("user.dir")+"\\data\\example.properties";
		
		FileInputStream fis=new FileInputStream(filePath);
		pro.load(fis);
		
		fis.close();
		
		String name=pro.getProperty("name");
		String email=pro.getProperty("emailId");
		String age=pro.getProperty("age");
		
		System.out.println(name+" "+email+" "+age);
	}

}
