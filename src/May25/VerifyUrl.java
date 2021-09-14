package May25;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUrl {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		Thread.sleep(5000);
		String expected="https://";
		String actual=driver.getCurrentUrl();
		if (actual.startsWith(expected)) {
			System.out.println("url is secured::"+expected+ " "+actual);
		}
		else {
			System.out.println("url is not secured::"+expected+ " "+actual);
		}
		driver.close();
		
		

	}

}
