package May27;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelection {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/PRATAP%20PANIGRAHY/Downloads/Multi.html");
		Thread.sleep(5000);
		Select dropdown = new Select(driver.findElement(By.name("multiSelection")));
		boolean value = dropdown.isMultiple();
		System.out.println(value);
		for (int i = 0; i < 8; i++) {
			Thread.sleep(4000);
			dropdown.selectByIndex(i);

		}
		List<WebElement>olist=dropdown.getAllSelectedOptions();
		System.out.println("No of items Selected::"+olist.size());
		for(WebElement each: olist) {
			System.out.println(each.getText());
			
		}
		dropdown.deselectByIndex(7);
		Thread.sleep(5000);
		dropdown.deselectByIndex(0);
		Thread.sleep(5000);
		dropdown.deselectAll();
		Thread.sleep(5000);
		driver.close();

	}

}
