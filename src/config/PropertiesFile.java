package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {
	//Create object of properties class
	static Properties prop = new Properties();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readPropertiesFile();
		writePropertiesFile();
		readPropertiesFile();

	}

	public static void  readPropertiesFile() {
		
		try {
			//Create a object of input stream
			InputStream input = new FileInputStream("C:\\Users\\hemant\\eclipse\\SeleniumTest\\src\\config\\config.properties");
			//load the contain of properties file
			prop.load(input);
			//get value which is store in properties file
			System.out.println(prop.getProperty("browser"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void writePropertiesFile() {
		try {
			//Create a object of output stream
			OutputStream output = new FileOutputStream("C:\\Users\\hemant\\eclipse\\SeleniumTest\\src\\config\\config.properties");
			//Set value which is store in properties file
			prop.setProperty("browser", "Firefox");
			//Store the value in properties file
			prop.store(output, "This is the value");
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
