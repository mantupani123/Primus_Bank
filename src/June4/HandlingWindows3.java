package June4;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows3 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		driver.findElement(By.xpath("(//label[text()='FLIGHTS'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='HOTELS'])[2]")).click();
		driver.findElement(By.xpath("//label[text()='RAIL DRISHTI']")).click();
		ArrayList<String> brw =new ArrayList<String>(driver.getWindowHandles());
		System.out.println(brw);
		Iterator<String> str=brw.iterator();
		while(str.hasNext()) {
			String child=str.next();
			if(!parent.equals(child)) {
				String pagetitle=driver.switchTo().window(child).getTitle();
				Thread.sleep(5000);
				driver.close();
			}
		}
driver.switchTo().window(parent);
System.out.println(driver.getTitle());
Thread.sleep(5000);
driver.close();
	}

}
