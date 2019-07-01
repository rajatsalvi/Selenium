package test;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  //System set property
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hemant\\Downloads\\New folder/chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.navigate().to("https://www.yahoo.com");
		
		((JavascriptExecutor)wd).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(wd.getWindowHandles());
		wd.switchTo().window(tabs.get(1));
		wd.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		
		Thread.sleep(5000);
		wd.findElement(By.id("identifierId")).sendKeys("rajatsalvi6");;
		wd.findElement(By.id("identifierNext")).click();
		Thread.sleep(2000);
		wd.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("mikefarwell");
		wd.findElement(By.id("passwordNext")).click();
		Thread.sleep(5000);
		wd.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div/div[2]/div/a")).click();
		wd.findElement(By.xpath("//*[@id=\"gb_71\"]")).click();
		Thread.sleep(2000);
		wd.navigate().refresh();
		
		
		wd.switchTo().window(tabs.get(0));
		Thread.sleep(5000);
//		wd.close();
		
		wd.findElement(By.cssSelector("#uh-signin")).click();
		Thread.sleep(2000);
		wd.findElement(By.id("login-username")).sendKeys("rajatsalvi@yahoo.com");
		Thread.sleep(1000);
//		wd.findElement(By.id("persistent")).click();
//	    Thread.sleep(1000);
		wd.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
		Thread.sleep(2000);
		wd.close();
			wd.switchTo().window(tabs.get(0));
			wd.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
			Thread.sleep(2000);
			wd.findElement(By.id("login-passwd")).sendKeys("st.josephs");
			Thread.sleep(2000);
			wd.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
//			if(wd.findElement(By.xpath("//*[@id=\"login-body\"]")).isDisplayed()) {
//				wd.findElement(By.xpath("//*[@id=\"comm-channel-module\"]/form/div[3]/button")).click();
//			}
			Thread.sleep(2000);
			wd.findElement(By.xpath("//*[@id=\"yui_3_18_0_3_1561115709639_771\"]")).click();
			wd.findElement(By.id("uh-signout")).click();
			
			
			
		
		
//		Thread.sleep(2000);
//		wd.get("https://www.yahoo.com");
//		wd.navigate().back();
//		Thread.sleep(2000);
//		wd.navigate().forward();
		
		
		
		
	}

}
