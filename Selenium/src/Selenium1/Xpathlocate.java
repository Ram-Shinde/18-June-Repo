package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathlocate {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Ram Shinde\\Selenium\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver = new ChromeDriver(); // Browser Launch

	driver.manage().window().maximize(); 
	driver.get("https://www.facebook.com/login/");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Ram Shinde");
	Thread.sleep(2000);
	
	
	//driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
	//Thread.sleep(2000);
	
	//driver.findElement(By.xpath("//button[text()='Log In']")).click();
	//Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
	Thread.sleep(2000);
	driver.close();
	
	
}
}
