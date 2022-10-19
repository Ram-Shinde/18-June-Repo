package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Ram Shinde\\Selenium\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver = new ChromeDriver(); // Browser Launch

	driver.manage().window().maximize(); 
	driver.get("https://www.facebook.com/login/");
	Thread.sleep(2000);
	
	//WebElement loginbutton=driver.findElement(By.tagName("input"));  //by using locators tagname
    //loginbutton.sendKeys("ramshinde");_

  // driver.findElement(By.tagName("button")).click() ; //by using locators tagname
    
   
      //driver.findElement(By.id("loginbutton")).click();
     
      
      driver.findElement(By.name("email")).sendKeys("Ram Shinde");
  	Thread.sleep(2000);
  	
  	driver.findElement(By.id("pass")).sendKeys("ramshinde9034@gmail.com");
  	
  	Thread.sleep(2000);
  	
  	//WebElement lb=driver.findElement(By.tagName("button"));
  	//lb.click();
  	//Thread.sleep(2000);
  	
  	//driver.findElement(By.linkText("Forgotten account?")).click();  	
  	//Thread.sleep(2000);
  	
  	driver.findElement(By.partialLinkText("Forgotten")).click();
  	Thread.sleep(2000);
  	
  	
  	driver.close();
    
}
}
