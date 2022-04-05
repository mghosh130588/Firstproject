package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookRegistercss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","//Users//mousumighosh//Selenium//Driver//geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Test");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("One");
		driver.findElement(By.cssSelector("input[name*='reg']")).sendKeys("test@gmail.com");
		driver.findElement(By.cssSelector("[name*='confirmation']")).sendKeys("test@gmail.com");
		driver.findElement(By.cssSelector("#password_step_input")).sendKeys("999999");
		//driver.findElement(By.cssSelector("input[value='2']")).click();
		List <WebElement> radiolist = driver.findElements(By.xpath("//input[@name='sex']"));
		List <WebElement> labellist = driver.findElements(By.xpath("//input[@name='sex']//following-sibling::label"));
		for (int i=0;i<labellist.size();i++)
		{
			
			System.out.println(labellist.get(i).getText());
			if(labellist.get(i).getText().equalsIgnoreCase("Male"))
			radiolist.get(i).click();
		}
		driver.findElement(By.cssSelector("[name='websubmit']")).click();
		driver.findElement(By.cssSelector("[name='websubmit']")).click();
		//driver.close();
		

	}

}
