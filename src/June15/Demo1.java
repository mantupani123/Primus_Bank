package June15;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo1 {
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://primusbank.qedgetech.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Reporter.log("Running in setup",true);
	}
	@Test
	public void pbanking() {
		driver.findElement(By.xpath("//a[@href='personal_banking.html']//img")).click();
		Reporter.log("Executing pbanking Test",true);
		
	}
	@Test
	public void cbanking() {
		driver.findElement(By.xpath("//a[@href='Corporate Banking.html']//img")).click();
		Reporter.log("Executing pbanking Test",true);
		
	}
	@Test
	public void ibanking() {
		driver.findElement(By.xpath("//a[@href='International Banking.html']//img")).click();
		Reporter.log("Executing pbanking Test",true);
		
	}
	@AfterTest
	public void tearDown() {
		driver.close();
		Reporter.log("Running in teardown",true);
	}



}
