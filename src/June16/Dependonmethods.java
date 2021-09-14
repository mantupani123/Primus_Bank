package June16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dependonmethods {
	WebDriver driver;
	@BeforeTest
	public void setUp() throws Throwable {
		driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("txtPword")).sendKeys("Admin");
		driver.findElement(By.name("login")).click();

	}
	@Test(groups="Primusbank")
	public void branches() throws Throwable {
		driver.findElement(By.xpath("//a[@href='admin_banker_master.aspx']//img")).click();
		Thread.sleep(5000);
	}
	@Test(dependsOnMethods="branches")
	public void roles() throws Throwable {
		driver.findElement(By.xpath("//a[@href='Admin_Roles_details.aspx']//img")).click();
		Thread.sleep(5000);
		
	}
	@Test(dependsOnMethods = "roles")
	public void users() throws Throwable {
		driver.findElement(By.xpath("//a[@href='userdetails.aspx']//img")).click();
		Thread.sleep(5000);
		
	}
	@Test(dependsOnMethods = "users")
	public void employee() throws Throwable {
		driver.findElement(By.xpath("//a[@href='Admin_Emp_details.aspx']//img")).click();
		Thread.sleep(5000);
		
	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
