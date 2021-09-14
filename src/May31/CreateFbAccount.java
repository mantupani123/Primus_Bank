package May31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFbAccount {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[starts-with(@id,'u_0_2')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//form[@name='reg']//following::input[2]")).sendKeys("Testing");
		driver.findElement(By.xpath("//form[@name='reg']//following::input[3]")).sendKeys("Selenium");
		driver.findElement(By.xpath("//form[@name='reg']//following::input[4]")).sendKeys("Selenium@gmail.com");
		driver.findElement(By.xpath("//form[@name='reg']//following::input[5]")).sendKeys("Selenium@gmail.com");
		driver.findElement(By.xpath("//form[@name='reg']//following::input[6]")).sendKeys("testing12345");
		new Select(driver.findElement(By.xpath("//form[@name='reg']//following::select[1]"))).selectByIndex(1);
	Thread.sleep(5000);
	new Select(driver.findElement(By.xpath("//form[@name='reg']//following::select[2]"))).selectByVisibleText("Dec");
	Thread.sleep(5000);
	new Select(driver.findElement(By.xpath("//form[@name='reg']//following::select[3]"))).selectByVisibleText("1978");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//form[@name='reg']//following::input[10]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//form[@name='reg']//following::button[1]")).click();
	}

}
