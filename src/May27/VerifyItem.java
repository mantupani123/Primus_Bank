package May27;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyItem {

	public static void main(String[] args) throws Throwable {
		String expectedItem = "books";
		boolean itemexist = false;

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		Select listbox=new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement> olist=listbox.getOptions();
		System.out.println("No of items are::"+olist.size());
		for(int i=1;i<olist.size();i++) {
			String actualItem=olist.get(i).getText();
			Thread.sleep(1000);
			System.out.println(actualItem);
			if(actualItem.equalsIgnoreCase(expectedItem)) {
				itemexist=true;
				break;
				
			}
		}if(itemexist) {
			System.out.println("Item found in listbox::"+expectedItem);
		}else {
			System.out.println("Item not found in listbox::"+expectedItem);
			Thread.sleep(5000);
			driver.quit();
			
		}

	}

}
