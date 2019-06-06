package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hemant\\Downloads\\New folder/chromedriver.exe");
		//System.setProperty("webdriver.chrome.bin","C:\\Program Files (x86)\\Google\\Chrome\\Application/chrome.exe");
		WebDriver wd =new ChromeDriver();
		wd.get("https://www.google.com");
		//wd.manage().window().maximize();
		String Title = wd.getTitle();
		System.out.println(Title);
		//wd.navigate().to("https://customer.ambujacement.com");
		wd.findElement(By.linkText("Gmail")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a")).click();
		
		
		
		
	}
	}


