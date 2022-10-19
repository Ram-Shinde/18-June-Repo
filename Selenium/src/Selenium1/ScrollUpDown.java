package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Ram Shinde\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Browser Launch

		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/js_intro.asp");
		Thread.sleep(2000);

		WebElement tryit = driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_intro_show']"));
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true)", tryit);
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0, 2000)");
		Thread.sleep(2000);

		js.executeScript("window.scrollBy(0, -2000)");
		Thread.sleep(2000);

	}
}
