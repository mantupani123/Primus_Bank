package June2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountingCheckBoxes {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/PRATAP%20PANIGRAHY/Downloads/checkbox_1.html");
		Thread.sleep(5000);
		List<WebElement> Checkboxes= driver.findElements(By.xpath("//*[@type='checkbox']"));
		System.out.println("No of CheckBoxes are::"+Checkboxes.size());
		Thread.sleep(5000);
		for(WebElement each: Checkboxes) {
			boolean value=each.isSelected();
			String checkbox=each.getAttribute("value");
			System.out.println(checkbox+"\n"+value);
			if(value) {
				each.click();
			}else {
				each.click();
			}
			Thread.sleep(5000);
		}
		Thread.sleep(5000);
		driver.close();
	}
 	}


