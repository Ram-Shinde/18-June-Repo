package Selenium1;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Ram Shinde\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Browser Launch

		driver.manage().window().maximize();
		driver.get("http://practice.cybertekschool.com/dropdown");
		Thread.sleep(2000);
		// selenium 4+
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Implicite Wait

		// 3.14
		// WebDriverWait ewait = new WebDriverWait(driver, 20); // explicit wait ka
		// object

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // new Version

		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20)); // new Version

		WebElement ele1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));

		Wait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(20)) // maximum waiting
																										// time
				.pollingEvery(Duration.ofSeconds(3)) // frequency 
				.ignoring(NoSuchElementException.class); // condition
		// above methodchaining
		// Wait <WebDriver> fwait =new
		// FluentWait<WebDriver>(driver)..withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);

		WebElement elele = fwait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("dfghjk"));
			}
		}); // Limited Time Period }}
	}
}
