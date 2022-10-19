package Selenium1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Ram Shinde\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Browser Launch

		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[@href='tryit.asp?filename=tryjs_alert']")).click();
		Thread.sleep(2000);

		ArrayList<String> ar = new ArrayList<String>(driver.getWindowHandles());

		driver.switchTo().window(ar.get(1));

		Thread.sleep(2000);

		WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));

		// driver.switchTo().frame(frame); by using xpath

		driver.switchTo().frame("iframeResult"); // by using id or name attribute

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Try it']")).click();

		Thread.sleep(2000);

		driver.switchTo().window(ar.get(0));
	}
}
