package May25;

import java.sql.Driver;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin2 {

	public static void main(String[] args) throws Throwable {
		Scanner sc=new Scanner(System.in);
		for(int i = 1;i<=5;i++) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://primusbank.qedgetech.com/");
			Thread.sleep(5000);
			System.out.println("Enter userName");
			String username=sc.nextLine();
			System.out.println("Enter password");
			String password=sc.nextLine();
			driver.findElement(By.name("txtuId")).sendKeys(username);
			driver.findElement(By.name("txtPword")).sendKeys(password);
			driver.findElement(By.name("login")).click();
			Thread.sleep(5000);
			String Alertmesseage=driver.switchTo().alert().getText();
			System.out.println(Alertmesseage);
			driver.switchTo().alert().accept();
			String Expected="adminflow.aspx";
			String Actual=driver.getCurrentUrl();
			if(Expected.equalsIgnoreCase(Actual)) {
				System.out.println("Url is matching::"+Expected+" " +Actual);
			}
			else {
				System.out.println("Url is not matching::"+Expected+" " +Actual);
			}
			Thread.sleep(5000);
			driver.close();
		}
	}

}
