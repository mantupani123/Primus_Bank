package June16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HrmOrange {
WebDriver driver;
@Parameters({"url"})
@BeforeTest
public void setUp(String appurl)
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(appurl);
}
@Parameters({"username","password"})
@Test
public void verifyLogin(String user,String pass)
{
driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(user);
driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(pass);	
driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
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

	


