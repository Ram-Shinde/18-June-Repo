package Selenium1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListInterface {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Ram Shinde\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Browser Launch

		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);

		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));

		Select s1 = new Select(month);

		List<WebElement> l1 = s1.getOptions();
	

		ArrayList<String> ar = new ArrayList<String>();

		for (WebElement w : l1) {
			System.out.println(w.getText());

			ar.add(w.getText());
		}
		Collections.sort(ar); // ArrayList

		System.out.println("#######");
		for (String s2 : ar) {
			System.out.println(s2);

		}

	}
	
}
