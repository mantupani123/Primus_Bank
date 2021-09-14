package June2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountingRadioButtons {

	public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.cleartrip.com/");
	Thread.sleep(5000);
	List<WebElement> radios=driver.findElements(By.xpath("//ul/li/label/strong"));
	System.out.println("No of Radio Buttons are::"+radios.size());
	for(WebElement each:radios) {
		
		
		System.out.println(each.getText());
	}
	
	Thread.sleep(5000);
	driver.quit();
	}

}
