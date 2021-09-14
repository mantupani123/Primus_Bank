package June22;


import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PropertyFile {
	Properties config;
	WebDriver driver;
	@BeforeTest
	public void setUp()throws Throwable
	{
		config = new Properties();
		//load property file
		config.load(new FileInputStream("D:\\Selenium1\\Primus_Bank\\OR.properties"));
		if(config.getProperty("Browser").equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(config.getProperty("url"));
			Thread.sleep(5000);
		}
		else if(config.getProperty("Browser").equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
			driver.get(config.getProperty("Url"));
			Thread.sleep(5000);
		}
		else
		{
			Reporter.log("Browser value is not matching",true);
		}
	}
	@Test
	public void login()
	{
		driver.findElement(By.xpath(config.getProperty("ObjUser"))).sendKeys("Admin");
		driver.findElement(By.xpath(config.getProperty("ObjPass"))).sendKeys("Admin");
		driver.findElement(By.xpath(config.getProperty("ObjLogin"))).click();
	}
	@AfterTest
	public void tearDown()throws Throwable
	{
		Thread.sleep(5000);
		driver.close();
	}
}
