package taskFolder;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selection {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USERi\\eclipse-workspace\\Selenium_Training\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement crt = driver.findElement(By.xpath("//a[@rel='async']"));
		crt.click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.name("firstname")).sendKeys("GANESHKUMAR");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElement(By.name("lastname")).sendKeys("SOUNDHARAPANDIYAN");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("gshkumar015@gmail.com");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("gshkumar015@gmail.com");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("ganeshkumar");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement date = driver.findElement(By.id("day"));
		Select s = new Select(date);
		s.selectByIndex(0);
		
		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
		s1.selectByValue("6");
		
		WebElement year = driver.findElement(By.id("year"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("1995");
		
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.name("websubmit")).click();

		boolean multiple = s.isMultiple();
		System.out.println("Multiple or not  "+ multiple);
		
		List<WebElement> options = s1.getOptions();
		for (WebElement webElement : options) {
			
			String text = webElement.getText();
			System.out.println(text);
	
		}
		
		System.out.println(".........First selected options.........");
		WebElement fso = s2.getFirstSelectedOption();
		System.out.println(fso.getText());
		
		
		
	}

}
