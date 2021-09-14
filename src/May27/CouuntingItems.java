package May27;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class CouuntingItems {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		Thread.sleep(5000);
		Select listbox = new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement> olist = listbox.getOptions();
		System.out.println("No of items are::" + olist.size());
		for (WebElement each : olist) {
			Thread.sleep(5000);
			System.out.println(each.getText());
			each.click();

		}
		Thread.sleep(5000);
		driver.close();

	}

}
