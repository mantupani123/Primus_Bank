package May24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String Expected = "google";
		String actual = driver.getTitle();
		if (Expected.equalsIgnoreCase(actual)) {
			System.out.println("titele is matching::" + Expected+" " + actual);

		} else {
			System.out.println("Title is not matching::" + Expected +" "+ actual);
		}
		driver.close();
	}

}
