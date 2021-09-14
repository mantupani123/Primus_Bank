

package June2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingAlert1 {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//click on signin
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		//get alert text
		String alerttext= driver.switchTo().alert().getText();
		System.out.println(alerttext);
		Thread.sleep(5000);
		//click on ok to alert
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.close();
	}

}