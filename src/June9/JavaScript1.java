package June9;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript1  {

	public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(5000);
JavascriptExecutor js = (JavascriptExecutor)driver;
driver.get("https://www.bharatmatrimony.com/");
Thread.sleep(5000);
String strtitle=js.executeScript("return document.title").toString();
System.out.println("Page title::"+strtitle);
System.out.println("Page title length::"+strtitle.length());
String strlurl=js.executeScript("return document.URL").toString();
System.out.println("url is::"+strlurl);
System.out.println("url lenght is::"+strlurl.length());
String domain=js.executeScript("return document.domain").toString();
System.out.println("domain name::"+domain);
System.out.println("domain length is::"+domain.length());
Thread.sleep(5000);
driver.close();
	}

}
