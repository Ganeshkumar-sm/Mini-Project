package taskFolder;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mini_Project {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USERi\\eclipse-workspace\\Selenium_Training\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]")).click();
		WebElement img = driver.findElement(By.xpath("//img[@itemprop='image']"));
		img.click();
		driver.switchTo().frame(0);
		WebElement addcrt = driver.findElement(By.name("Submit"));
		addcrt.click();
		driver.switchTo().parentFrame();

		WebElement ptco = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		ptco.click();
		WebElement ptco1 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		Actions a = new Actions(driver);
		a.moveToElement(ptco1).build().perform();
		a.click(ptco1).build().perform();

		driver.findElement(By.id("email")).sendKeys("practicemail@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("123456789practice");
		driver.findElement(By.id("SubmitLogin")).click();

		WebElement ptco2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		ptco2.click();

		WebElement chbox = driver.findElement(By.id("cgv"));
		chbox.click();

		WebElement ptcof = driver.findElement(By.name("processCarrier"));
		ptcof.click();

		WebElement pay = driver.findElement(By.xpath("//a[@title='Pay by check.']"));
		pay.click();

		WebElement cnfm = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		cnfm.click();

		WebElement back = driver.findElement(By.xpath("//*[@id='center_column']/div/strong[3]"));

		JavascriptExecutor jc = (JavascriptExecutor) driver;
		jc.executeScript("arguments[0].scrollIntoView();", back);
		jc.executeScript("window.scrollby, (0,-1000);");

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		File destination = new File("C:\\Users\\USERi\\eclipse-workspace\\Selenium_Training\\Screenshots\\pic4.png");

		org.openqa.selenium.io.FileHandler.copy(source, destination);

	}

}
