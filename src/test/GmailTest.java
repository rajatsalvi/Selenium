package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailTest {

	static String browser;
	static WebDriver wd;
	
	public static void main(String[] args) throws InterruptedException  {
		GmailTest ts = new GmailTest();
		ts.setBrowser();
		ts.setBrowserConfig();
		ts.runTest();
		
	}
	
	//set browser
	//setbrowser config
	//run test
	
	
	public void setBrowser() {
		browser = "chrome";	
	}
	
	public void setBrowserConfig() {
		//setting the chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hemant\\Downloads\\New folder/chromedriver.exe");
		wd =new ChromeDriver();
		wd.manage().deleteAllCookies();
	}
	
	public void runTest() throws InterruptedException {
		//setting the site to navigate
		wd.navigate().to("https://mail.google.com");
		//setting the user name for gmail
		wd.findElement(By.id("identifierId")).sendKeys("assassinsfearless@gmail.com");
		//
		wd.findElement(By.id("identifierNext")).click();
		//thread.sleeep is used to stop the execution in specified milliseconds to see the user changes
		Thread.sleep(3000);
		//set the password for the user
		wd.findElement(By.name("password")).sendKeys("mikefarwell");
	    
		wd.findElement(By.id("passwordNext")).click();
		
	}
}
