package Selenium1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popups {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\Ram Shinde\\Selenium\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver = new ChromeDriver(); // Browser Launch

	driver.manage().window().maximize();
	driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	Thread.sleep(2000);

	driver.findElement(By.xpath("//input[@name='prompt']")).click();
	Thread.sleep(2000);
	
	Alert al=driver.switchTo().alert();
	
	driver.switchTo().alert();  // alert is interface & TargetLocator is also interface.

	driver.switchTo().alert();
		
	//al.accept();
	
	//al.dismiss();
	
	//al.getText();
	
	System.out.println(al.getText());
	
	al.sendKeys("Group 16");
	
	Thread.sleep(3000);
	
	driver.quit();
	
}
}
