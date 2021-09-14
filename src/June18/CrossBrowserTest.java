package June18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTest {
	WebDriver driver;
	@Parameters({"url","Browser"})
	@BeforeTest
	public void setUp(String appurl,String brw) {
		switch(brw)
		{
		case "chrome":
			Reporter.log("Executing on chromebrowser",true);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(appurl);
			break;
		case "firefox":
			Reporter.log("Executing on firefoxbrowser",true);
			driver = new FirefoxDriver();
			driver.get(appurl);
			break;
			default:
				Reporter.log("Browser value is not matching",true);
				break;
		}
	}
	@Test
	public void verifyLogin()throws Throwable
	{
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Qedge123!@#");	
	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	Thread.sleep(4000);
		if(driver.getCurrentUrl().contains("dashboard"))
		{
			Reporter.log("Login success",true);
		}
		else
		{
			Reporter.log("Login Fail",true);
		}
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	}