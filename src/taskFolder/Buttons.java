package taskFolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USERi\\eclipse-workspace\\Selenium_Training\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/");

		driver.manage().window().maximize();

		WebElement Btn = driver.findElement(By.xpath("//img[@alt='Buttons']"));
		Btn.click();

		WebElement ghp = driver.findElement(By.id("home"));
		ghp.click();
		
		

	}

}
