package Selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Ram Shinde\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Browser Launch

		driver.manage().window().maximize();
		driver.get("http://practice.cybertekschool.com/dropdown");
		Thread.sleep(2000);

		WebElement lan = driver.findElement(By.xpath("//select[@name='Languages']"));
		Thread.sleep(2000);

		Select s2 = new Select(lan);
		Thread.sleep(2000);
		s2.selectByValue("java");
		Thread.sleep(2000);

		s2.selectByValue("c#");
		Thread.sleep(2000);

		s2.selectByValue("python");
		Thread.sleep(2000);

		s2.deselectByValue("python");
		Thread.sleep(2000);
		
		/*
		 * s2.deselectByIndex(2); Thread.sleep(2000); s2.deselectByVisibleText("Java");
		 * Thread.sleep(2000);
		 */

		WebElement Fselect = s2.getFirstSelectedOption(); // create an object of webelement
		System.out.println(Fselect.getText());

		System.out.println(s2.getFirstSelectedOption().getText()); // Method Chaining

		s2.getAllSelectedOptions();  // returns all the options of the list box
	
		
		List <WebElement>l=s2.getOptions();  
		
	System.out.println(l.size());  //  count of options present in list box 
		
	for(int i=0; i<l.size();i++) {
		System.out.println(l.get(i).getText());
	}
	System.out.println("###");
		for(int i=l.size()-1; i>=0; i--)
		{
			System.out.println(l.get(i).getText());
		}
	}
}
