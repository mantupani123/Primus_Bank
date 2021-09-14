package June9;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchText {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium driver\\New folder/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		Set<Cookie> cookies = driver.manage().getCookies();// capture all the cookie from browser
		System.out.println("No of cookies are::" + cookies.size());
		for (Cookie cookie : cookies) {
			System.out.println(cookie.getName() + ":" + cookie.getValue());
		}
		// Create new cookie to the browser
		Cookie cobj = new Cookie("mycookie ", "123456789");
		driver.manage().addCookie(cobj);
		cookies = driver.manage().getCookies();// capture all the cookie from browser
		System.out.println("No of cookies are::" + cookies.size());

		for (Cookie cookie : cookies) {
			System.out.println(cookie.getName() + ":" + cookie.getValue());
		}
		driver.manage().deleteCookie(cobj);
		cookies = driver.manage().getCookies();// capture all the cookie from browser
		System.out.println("No of cookies are::" + cookies.size());
		for (Cookie cookie : cookies) {
			System.out.println(cookie.getName() + ":" + cookie.getValue());
		}

	}

}
