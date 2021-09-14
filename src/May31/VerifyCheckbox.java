package May31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyCheckbox {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement checkbox=driver.findElement(By.xpath("//*[@value='1']"));
		boolean value=checkbox.isSelected();
		System.out.println(value);
		Thread.sleep(5000);
		if(value) {
			checkbox.click();
		}else {
			checkbox.click();
		}
		

	}

}
