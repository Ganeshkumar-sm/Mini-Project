package seleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Method {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\USERi\\eclipse-workspace\\Selenium_Training\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // Upcasting
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println(title);

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		// Navigation Methods

		driver.navigate().to("https://www.google.com/gmail/");

		String title3 = driver.getTitle();
		System.out.println(title3);

		driver.navigate().back();

		driver.navigate().forward();

		Thread.sleep(1000);

		driver.navigate().refresh();

		driver.navigate().to("https://www.youtube.com/");

		Thread.sleep(1000);

		String title2 = driver.getTitle();
		System.out.println(title2);

		String currentUrl2 = driver.getCurrentUrl();
		System.out.println(currentUrl2);

		driver.navigate().refresh();

		driver.navigate().to("https://www.facebook.com/");
		
		driver.quit();

	}
}