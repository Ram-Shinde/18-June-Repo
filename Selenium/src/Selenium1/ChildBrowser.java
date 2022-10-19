package Selenium1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Ram Shinde\\Selenium\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver = new ChromeDriver(); // Browser Launch

	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/js/js_assignment.asp");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_assign_equal']")).click();
	
	driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_assign_minequal']")).click();
	
	
	
	
	String mainwindowID=driver.getWindowHandle();  // Return ID Of main window
	String excUrl="https://www.w3schools.com/js/tryit.asp?filename=tryjs_assign_equal";
	String ExcID="";
	System.out.println(driver.getWindowHandle());
	
	Set<String> alladd=driver.getWindowHandles();  // ID Of child window + Main Window ID are achieved.
	    										   // ID of main window always stored at 1st Index [0].
	for(String s: alladd) {
		System.out.println(s);
		
		driver.switchTo().window(s);
		String actUrl=driver.getCurrentUrl();
		
		if(excUrl.equals(actUrl)) {
			System.out.println("correct Window");
			
		}
		else
		{
			System.out.println("Wrong Window");
		}
		
	}
	
	driver.switchTo().window(ExcID);
	
}
}
