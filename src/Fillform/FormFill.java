package Fillform;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormFill {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\hemant\\\\Downloads\\\\New folder/chromedriver.exe");
      WebDriver wd = new ChromeDriver();
      wd.get("http://www.gcrit.com/build3/create_account.php");
      Thread.sleep(2000);
      wd.findElement(By.xpath("//*[@id=\"bodyContent\"]/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")).click();
      wd.findElement(By.name("firstname")).sendKeys("Rajat");
      wd.findElement(By.name("lastname")).sendKeys("Salvi");
      wd.findElement(By.id("dob")).sendKeys("11/15/1996",Keys.ENTER);
      Thread.sleep(5000);
      wd.findElement(By.name("email_address")).sendKeys("rajatsalvi6@gmail.com");
      wd.findElement(By.name("company")).sendKeys("Karma");
      wd.findElement(By.name("street_address")).sendKeys("38/B Twin House Colony, Near Fire Station, LBS Marg, Vikhroli-west");
      wd.findElement(By.name("suburb")).sendKeys("Mumbai Suburban");
      wd.findElement(By.name("postcode")).sendKeys("400079");
      wd.findElement(By.name("city")).sendKeys("Mumbai");
      wd.findElement(By.name("state")).sendKeys("Maharashtra");
      Select Dropdown = new Select (wd.findElement(By.name("country")));
      Dropdown.selectByIndex(99);
      wd.findElement(By.name("telephone")).sendKeys("+91 9768118799");
      wd.findElement(By.name("password")).sendKeys("st.josephs");
      wd.findElement(By.name("confirmation")).sendKeys("st.josephs");
      
      ((JavascriptExecutor)wd).executeScript("window.open()");
      ArrayList<String> tab = new ArrayList<String>(wd.getWindowHandles());
      wd.switchTo().window(tab.get(1));
      wd.get("https://mail.google.com");
      
	}

}
