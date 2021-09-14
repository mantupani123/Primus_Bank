package June15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo3 {
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://calc.qedgetech.com/");
		
	}
@Test(description = "addition test",priority = 1,enabled = true)
public void addition() throws Throwable {
	driver.findElement(By.xpath("(//*[@type='button'])[25]")).click();
	Thread.sleep(4000);
	driver.findElement(By.name("display")).sendKeys("300");
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//*[@type='button'])[5]")).click();
	driver.findElement(By.name("display")).sendKeys("89");
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//*[@type='button'])[19]")).click();
	Thread.sleep(4000);
	String addresult=driver.findElement(By.name("display")).getAttribute("value");
	Thread.sleep(4000);
	Reporter.log(addresult,true);
}
@Test(description = "multiplication test",priority = 0,enabled = true)
public void multiplication() throws Throwable {
	driver.findElement(By.xpath("(//*[@type='button'])[25]")).click();
	Thread.sleep(4000);
	driver.findElement(By.name("display")).sendKeys("98765");
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//*[@type='button'])[15]")).click();
	driver.findElement(By.name("display")).sendKeys("76");
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//*[@type='button'])[19]")).click();
	Thread.sleep(4000);
	String multiresult=driver.findElement(By.name("display")).getAttribute("value");
	Thread.sleep(4000);
	Reporter.log(multiresult,true);
}
@Test(description = "division test",priority = 2,enabled = false)
public void division()throws Throwable
{
	driver.findElement(By.xpath("(//*[@type='button'])[25]")).click();
	Thread.sleep(4000);
	driver.findElement(By.name("display")).sendKeys("65465654");
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//*[@type='button'])[20]")).click();
	driver.findElement(By.name("display")).sendKeys("56");
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//*[@type='button'])[19]")).click();
	Thread.sleep(4000);
	String divresult=driver.findElement(By.name("display")).getAttribute("value");
	Thread.sleep(4000);
	Reporter.log(divresult,true);
}
@AfterTest
public void tearDown()
{
	driver.close();
}
}
