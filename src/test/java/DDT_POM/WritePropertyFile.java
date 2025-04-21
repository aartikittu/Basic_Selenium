package DDT_POM;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class WritePropertyFile {

	public static void main(String[] args) throws IOException 
	{
		Properties pro=new Properties();
		pro.setProperty("url", "https://www.saucedemo.com/v1/");
		pro.setProperty("username", "standard_user");
		pro.setProperty("password", "secret_sauce");
		
		String filePath=System.getProperty("user.dir")+"\\data.properties";
		
		FileOutputStream fos=new FileOutputStream(filePath);
		pro.store(fos, "hi!");
		fos.close();
		
		System.out.println("File Written successfully!!!!!"); 
	}

}
