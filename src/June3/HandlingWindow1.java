package June3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindow1 {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naukri.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> allwins =driver.getWindowHandles();
		System.out.println(allwins);
		for(String each : allwins)
		{
			if(!parent.equals(each))
			{
				String chilewindowtitle=driver.switchTo().window(each).getTitle();
				Thread.sleep(5000);
				System.out.println(chilewindowtitle);
				driver.manage().window().maximize();
				Thread.sleep(5000);
				driver.close();

			}
		}
		driver.switchTo().window(parent);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[contains(text(),'Register')])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[contains(text(),'I am')])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("fname")).sendKeys("Akhilesh");
		Thread.sleep(5000);
		driver.quit();
	}

}