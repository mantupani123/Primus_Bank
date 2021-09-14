package June18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 {
	WebDriver driver;
	@Test
	public void verifyTitle() throws Throwable {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		Thread.sleep(5000);
		String expected="Google";
		try {
		String actual=driver.getTitle();
		Assert.assertEquals(expected, actual,"Title is not matching");
		}catch(Throwable t) {
			System.out.println(t.getMessage());
		}
		driver.close();
		
		
	}

}
