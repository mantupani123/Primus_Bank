package June9;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollMouse {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
       js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    // Actions ac=new Actions(driver);
    // ac.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Account & Lists']")));
      Thread.sleep(5000);
      
       WebElement signbtn=driver.findElement(By.xpath("(//span[text()='Sign in'])[3]"));
       js.executeScript("document.scrollIntoView", signbtn);
       Thread.sleep(5000);
       signbtn.click();
       Thread.sleep(5000);
       driver.close();
       driver.quit();
       
	}

}
