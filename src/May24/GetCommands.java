package May24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		Thread.sleep(5000);
		String pagetitle=driver.getTitle();
		System.out.println("Title of the page::"+pagetitle);
		System.out.println("Title length::"+pagetitle.length());
		String strlurl=driver.getCurrentUrl();
		System.out.println("url is::"+strlurl);
		System.out.println("url length is::"+strlurl.length());
		Thread.sleep(5000);
		String pagesource=driver.getPageSource();
		System.out.println("page source is::"+pagesource);
		driver.close();
		

	}

}
