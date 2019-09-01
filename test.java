package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
	
	 public static void main(String[] args) throws Exception 
	    {
	        
			
			System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			 driver.get("http://localhost/prac5-ajax/");
			 Thread.sleep(5000);
			 WebElement link=driver.findElement(By.linkText("Register Yourself"));
			 link.click();
			 Thread.sleep(5000);
			 
			 
			 WebElement textbox1=driver.findElement(By.id("username"));
			 textbox1.sendKeys("pccoe");
			// textbox1.submit();
			 
			 WebElement textbox2=driver.findElement(By.id("password"));
			 textbox2.sendKeys("pccoer");
			// textbox2.submit();
			 
			 WebElement textbox3=driver.findElement(By.id("mobile"));
			 textbox3.sendKeys("1234567890");
			// textbox3.submit();
			 
			 WebElement textbox4=driver.findElement(By.id("email"));
			 textbox4.sendKeys("pccoer.com");
			// textbox4.submit();
			 
			 WebElement textbox5=driver.findElement(By.id("age"));
			 textbox5.sendKeys("5");
			 textbox5.submit();
			 driver.quit();
			 driver.get("http://localhost/prac5-ajax/");
			 
			 WebElement textbox6=driver.findElement(By.id("username"));
			 textbox6.sendKeys("montu");
			 
			 WebElement textbox7=driver.findElement(By.id("password"));
			 textbox7.sendKeys("mo");
			 driver.quit();
			 Thread.sleep(10000);
			 
	    }

}
