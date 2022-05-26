package taskFolder;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USERi\\eclipse-workspace\\Selenium_Training\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = " https://www.tutorialspoint.com/tutor_connect/index.php";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		/*Select s = new Select(driver.findElement(By.xpath("//select[@name=’selType’]")));
		// getting the list of options in the dropdown with getOptions()
		List<WebElement> op = s.getOptions();
		int size = op.size();
		for (int i = 0; i < size; i++) {
			String options = op.get(i).getText();
			System.out.println(options);*/
			
		}
		// driver.quit();
	}


