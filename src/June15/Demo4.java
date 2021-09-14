package June15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo4 {
	WebDriver driver;
	@Test(invocationCount = 5)
	public void multiplication() throws Throwable {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://calc.qedgetech.com/");
		
	
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
		Thread.sleep(5000);
}
	
}