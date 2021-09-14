package May27;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CoumtingItems2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		Select listbox=new Select(driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")));
		List<WebElement> olist=listbox.getOptions();
		System.out.println("no.of items are::"+olist.size());
		for(WebElement each:olist) {
			Thread.sleep(5000);
			System.out.println(each.getText());
			each.click();
			
		}
		Thread.sleep(5000);
		driver.close();
		

	}

}
