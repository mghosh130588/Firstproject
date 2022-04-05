package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","//Users//mousumighosh//Selenium//Driver//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("email");
		driver.findElement(By.name("pass")).sendKeys("pass");
		List <WebElement> radio = driver.findElements(By.xpath("//input[@name = 'sex']"));
		System.out.println(radio.size());
		
		for(int i =0;i<radio.size();i++)
		{
			String value= radio.get(i).getAttribute("value");
			if(value.equalsIgnoreCase("2"))
				radio.get(i).click();
					
		}
	//driver.close();
	}

}
