package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class basicWebdriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.setProperty("webdriver.gecko.driver","//Users//mousumighosh//Selenium//Driver//geckodriver");
				WebDriver driver = new FirefoxDriver();
				driver.get("https://www.google.com");
				driver.manage().window().maximize();
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				driver.get("https://www.yahoo.com");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.navigate().back();
				System.out.println(driver.getTitle());
				driver.navigate().forward();
				System.out.println(driver.getTitle());
				driver.close();
				
	}

}
