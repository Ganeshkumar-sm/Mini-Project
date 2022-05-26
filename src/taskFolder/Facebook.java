package taskFolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USERi\\eclipse-workspace\\Selenium_Training\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("gshkumar015@gmail.com");

		WebElement pswrd = driver.findElement(By.xpath("//input[@type='password']"));
		pswrd.sendKeys("014465465165");

		WebElement fpswrd = driver.findElement(By.linkText("Forgotten password?"));
		fpswrd.click();
		String title = driver.getTitle();
		System.out.println(title);

	}

}
