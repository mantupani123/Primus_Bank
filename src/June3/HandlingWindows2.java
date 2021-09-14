package June3;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Help")).click();
		driver.findElement(By.partialLinkText("Priva")).click();
		driver.findElement(By.partialLinkText("Terms")).click();
		ArrayList<String> brw = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(brw);
		driver.switchTo().window(brw.get(3));
		Thread.sleep(5000);
		String expectedtitle = "Google Account help";
		String actualtitle = driver.getTitle();
		if (expectedtitle.equalsIgnoreCase(actualtitle)) {
			System.out.println("Title is matching::" + actualtitle + "   " + expectedtitle);
		} else {
			System.out.println("Title is not matching::" + actualtitle + "   " + expectedtitle);
		}
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(brw.get(1));
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[text()='Technologies'])[1]")).click();
		Thread.sleep(5000);
		driver.switchTo().window(brw.get(0));
		System.out.println(driver.getTitle());
		driver.findElement(By.name("identifier")).sendKeys("pk.panigrahy147");
		Thread.sleep(4000);
		driver.close();
		driver.switchTo().window(brw.get(2));
		Thread.sleep(4000);
		driver.close();

	}

}
