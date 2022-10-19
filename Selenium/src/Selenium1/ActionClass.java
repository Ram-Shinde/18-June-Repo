package Selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Browser Launch

		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);

		WebElement Changelanguage = driver.findElement(By.xpath("//a[@aria-label='Choose a language for shopping.']"));

		Actions act = new Actions(driver);

		act.moveToElement(Changelanguage).perform();
		Thread.sleep(2000);

		// act.contextClick().perform();
		// Thread.sleep(2000);

		// act.contextClick(Changelanguage).perform();

		// act.click().perform();
		// Thread.sleep(2000);
		// act.click(Changelanage).perform();

		// act.doubleClick().perform();
		// act.doubleClick(Changelanage).perform();

		act.moveToElement(Changelanguage).click().perform();

		// act.dragAndDrop(src, dest); // 1st way

		// act.click().clickAndHold(src); //2nd way

	}
}
