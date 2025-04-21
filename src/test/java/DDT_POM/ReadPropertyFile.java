package DDT_POM;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException 
	{
		Properties pro=new Properties();
		
		String filePath=System.getProperty("user.dir")+"\\data.properties";
		
		FileInputStream fis=new FileInputStream(filePath);
		pro.load(fis);
		
		String url=pro.getProperty("url");
		String username=pro.getProperty("username");
		String password=pro.getProperty("password");
		
		System.out.println(url+" "+username+" "+password);
	}

}
