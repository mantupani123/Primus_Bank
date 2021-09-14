package May26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingListbox {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://facebook.com");
		Thread.sleep(5000);
		Select daylistbox=new Select(driver.findElement(By.id("day")));
		boolean value =daylistbox.isMultiple();
		System.out.println(value);
		daylistbox.selectByVisibleText("25");
		Thread.sleep(5000);
		daylistbox.selectByIndex(10);
		Thread.sleep(5000);
		driver.close();

	}

}
