package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class NaukriWebsite {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Ram Shinde\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Browser Launch

		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		Thread.sleep(2000);
		/*System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		 * driver.navigate().back(); // back button perform Thread.sleep(2000);
		 * driver.navigate().forward(); // forword btton perform Thread.sleep(2000);
		 * driver.navigate().refresh(); // refresh the current page.
		 * 
		 * //Dimension D1= new Dimension(200,400); // create dimension class object
		 * //driver.manage().window().setSize(D1); // by using method chaining
		 * 
		 * 
		 * //Point D2= new Point(400,600); // create dimension class object
		 * //driver.manage().window().setPosition(D2);
		 * 
		 * 
		 * driver.findElement(By.xpath("//a[text()='Register']")).click();
		 * 
		 * WebElement tryit = driver.findElement(By.xpath("//input[@id='mobile']"));
		 * JavascriptExecutor js=(JavascriptExecutor) driver;
		 * 
		 * js.executeScript("arguments[0].scrollIntoView(true)", tryit);
		 * tryit.sendKeys("1111222112");
		 
		WebElement ListSelect = driver.findElement(By.xpath("//input[@name='expereinceDD']"));
		ListSelect.click();
		Select year = new Select(ListSelect);
		//year.selectByIndex(1);
		//Thread.sleep(2000);

		year.selectByVisibleText("1 year");
		/*
		System.out.println(year.isMultiple());

		List<WebElement> l1 = year.getOptions();

		for (int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i).getText());
		}*/

		// child browser
		WebElement cb=driver.findElement(By.xpath("//a[text()='View jobs']"));
		cb.click();
		Thread.sleep(2000);
		
		// mouse action 
		WebElement move=driver.findElement(By.xpath("//a[@title='Naukri FastForward- Resume Services']"));
		Actions a1= new Actions(driver);
		a1.moveToElement(move).click().perform();
		Thread.sleep(2000);
		
	}
}
