package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodofWebelemnt {
public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "D:\\Ram Shinde\\Selenium\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver = new ChromeDriver(); // Browser Launch

	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	Thread.sleep(2000);
	
	WebElement web=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
	web.click();
	
	System.out.println(web.isSelected());  // to check the selected path is correct or not
	
	
	WebElement loginbutton=driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	System.out.println(loginbutton.isEnabled());  // button enabled hai ki nhi check karta hai
	System.out.println(loginbutton.isDisplayed());  // action perform kiya hua validatation karna 

	System.out.println(loginbutton.getAttribute("type"));  // xpath mai use kiya hua attribute ko check karna.
	

	WebElement brnlink=driver.findElement(By.xpath("//a[text()='Already have an account?']"));
	System.out.println(brnlink.isEnabled());
	
}
}
