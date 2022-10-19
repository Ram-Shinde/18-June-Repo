package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {
public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "D:\\Ram Shinde\\Selenium\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver = new ChromeDriver(); // Browser Launch

	driver.manage().window().maximize(); 
	driver.get("https://www.facebook.com");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(2000);
	
	WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
	
	Select s1=new Select(month);
	Thread.sleep(2000);
	
	s1.selectByIndex(3); // apr
	Thread.sleep(2000);
	
	s1.selectByValue("12");  // Dec
	Thread.sleep(2000);
	
	s1.selectByVisibleText("Feb");
	Thread.sleep(2000);
	
	driver.quit();
	
}

}
