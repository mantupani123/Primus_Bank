package May25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.navigate().to("http://google.com");
        Thread.sleep(5000);
        driver.findElement(By.partialLinkText("Gmail")).click();
        System.out.println("pageTitle[1]::"+driver.getTitle());
        Thread.sleep(5000);
        driver.navigate().back();
        System.out.println("pageTitle[2]::"+driver.getTitle());
        Thread.sleep(5000);
        driver.navigate().forward();
        System.out.println("pageTitle[3]::"+driver.getTitle());
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);
        driver.close();
	}

}
