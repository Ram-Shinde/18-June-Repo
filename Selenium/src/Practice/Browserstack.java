package Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Browserstack {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\Ram Shinde\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Browser Launch

		driver.manage().window().maximize();
		driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Ram");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("Patil");
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='check1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='radio2']")).click();
		Thread.sleep(2000);
		
		WebElement List=driver.findElement(By.xpath("//select[@id='Carlist']"));
		List.click();
		
		Select  s1=new Select(List);
		s1.selectByIndex(3);
	
		WebElement List1=driver.findElement(By.xpath("//select[@ name='FromLB']"));
	
		Select s2=new Select(List1);
		s2.selectByVisibleText("Russia");
		Thread.sleep(2000);
		s2.selectByVisibleText("Mexico");
		Thread.sleep(2000);
		s2.selectByVisibleText("Italy");
		Thread.sleep(2000);
		s2.deselectByIndex(4);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text()='Show Me Confirmation']")).click();
		Thread.sleep(2000);
		Alert a1=driver.switchTo().alert();
		
		a1.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='http://only-testing-blog.blogspot.in/2013/09/test.html']")).click();
	
		Thread.sleep(2000);
		
		/*
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("D:\\eclipse-workspace\\Screenshot\\SS.jpg");
	
		FileHandler.copy(source, dest);*/
		Thread.sleep(2000);
		driver.quit();
	
	}
}
