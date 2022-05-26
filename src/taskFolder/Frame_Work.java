package taskFolder;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Work {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USERi\\eclipse-workspace\\Selenium_Training\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		WebElement amazon = driver.findElement(By.xpath("//*[@id=\'navFooter\']/div[3]/span[1]/div/a/div"));
		JavascriptExecutor sc = (JavascriptExecutor) driver;
	    sc.executeScript("arguments[0].scrollIntoView();" ,amazon);
		sc.executeScript("window.scrollby, (0,-100);");
		
		
		
		
		

	}

}
