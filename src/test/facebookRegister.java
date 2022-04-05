package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","//Users//mousumighosh//Selenium//Driver//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("`one");
		driver.findElement(By.xpath("//input[contains(@name,'reg')]")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name,'confirmation')]")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name,'passwd')]")).sendKeys("99999");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();
		
	}

}
