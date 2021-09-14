package May25;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin {

	public static void main(String[] args) throws Throwable {
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=5;i++){
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://orangehrm.qedgetech.com/");
			Thread.sleep(5000);
			System.out.println("Enter your username");
			
			String user = sc.nextLine();
			System.out.println("Enter your password");
			String pass=sc.nextLine();
			WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
			username.clear();
			Thread.sleep(5000);
			username.sendKeys(user);
			WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
			password.clear();
			Thread.sleep(5000);
			password.sendKeys(pass);
			driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
			Thread.sleep(5000);
			String Expected="dashboard";
			String Actual=driver.getCurrentUrl();
			if(Actual.contains(Expected)) {
				System.out.println("Login Success::"+ Expected+"  " +Actual);
				
			}else {
				String message=driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
				System.out.println(message + "  "+Expected+"  "+Actual);
			}
			Thread.sleep(5000);
			driver.close();
			
			
			
		}

	}

}
