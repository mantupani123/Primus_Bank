package June15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo2 {
WebDriver driver;
@BeforeMethod
public void setUp() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
	driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("Qedge123!@#");
	driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	Reporter.log("Running in setup",true);
}
@Test
public void Admin() throws Throwable {
	driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	Reporter.log("Executing admin test",true);
	Thread.sleep(5000);
}
@Test
public void pim() throws Throwable {
	driver.findElement(By.id("menu_pim_viewPimModule")).click();
	Reporter.log("Executing pim test",true);
	Thread.sleep(5000);
}
@Test
public void leave() throws Throwable {
	driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
	Reporter.log("Executing leave test",true);
	Thread.sleep(5000);
}
@AfterMethod
public void tearDown() {
	driver.close();
	Reporter.log("Running in TearDown",true);
}
}
