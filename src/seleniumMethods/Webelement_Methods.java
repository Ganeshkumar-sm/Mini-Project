package seleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_Methods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USERi\\eclipse-workspace\\Selenium_Training\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Upcasting
		driver.get("https://www.facebook.com/"); // current url

		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("9988745662");

		String attribute = email.getAttribute("value");
		System.out.println(attribute);

		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("fddfdd");
		password.clear();

		boolean displayed = email.isDisplayed();
		System.out.println("IsDisplayed or Not   " + displayed);

		boolean enabled = email.isEnabled();
		System.out.println("IsEnabled or Not  " + enabled);

		boolean selected = email.isSelected();
		System.out.println("IsSelected or Not   " + selected);

		// driver.findElement(By.id("pass")).sendKeys("dhgdgdhd");

		WebElement Login = driver.findElement(By.name("login"));
		Login.click();

		driver.quit();

	}

}
