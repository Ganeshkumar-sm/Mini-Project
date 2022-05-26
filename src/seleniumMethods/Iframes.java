package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\USERi\\eclipse-workspace\\Selenium_Training\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("URL");// URL OF WEBPAGE HAVING FRAMES
		//First finding the element using any of locator strategy
		WebElement iframeElement = driver.findElement(By.id("iFrameResult"));
		//now using the switch command to switch to main frame.
		driver.switchTo().frame(0);
		//Perform all the required tasks in the frame 0
		//Switching back to the main window
		driver.switchTo().defaultContent();
		driver.quit();
	}

}
