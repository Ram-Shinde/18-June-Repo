package Selenium1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ABC {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Ram Shinde\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Browser Launch

		driver.manage().window().maximize(); // method chaining browser maximize
		// driver.manage().window().minimize(); // we cant minimize the brower in
		// selenuim 3.14. browser minimize use in new version only
 

		Options op = driver.manage();
		Window w = op.window();
		w.maximize();
        
		
		Dimension D = new Dimension(150, 300);
		driver.manage().window().setSize(D); // browser ka size se hoga
        Thread.sleep(3000);
		
		Point p = new Point(200, 250);
		driver.manage().window().setPosition(p); // set to position of the browers

		driver.get("https://meet.google.com/oik-hesd-onp"); // Url Insert
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.navigate().to("https://meet.google.com/oik-hesd-onp");

		Navigation nv = driver.navigate();

		nv.back(); // From backword arrows
		nv.forward(); // From forword arrows
		nv.refresh(); // refresh current tab

		Thread.sleep(5000); // delay from the task time in milisecond
		// driver.close(); // close prticular tab
		driver.quit(); // close all the tab or browser.

	}

}
