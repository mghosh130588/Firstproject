package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class Firsttest {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver","//Users//mousumighosh//Selenium//Driver//chromedriver");
		//WebDriver driver = new ChromeDriver();
		//WebDriver driver = new SafariDriver();
		System.setProperty("webdriver.gecko.driver","//Users//mousumighosh//Selenium//Driver//geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement test = driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/input"));
		test.sendKeys("india");
		Thread.sleep(1000);
		//System.out.println(test.getText());
		List <WebElement> box = driver.findElements(By.xpath("//div[@class='aajZCb']/ul/li/div/div[@class='sbtc']"));
		System.out.println(box.size());
		int len = box.size();
		/*Thread.sleep(1000);
		int i=0;
		while(i<11)
		{
			driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			String value =  driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/input")).getText();
			System.out.println(value);
			/*if (value.equalsIgnoreCase("bangkok"))
			{
				driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys(Keys.ENTER);
				break;
			}
			else 
			*/
				//i++;
		
		for (int i=0;i<len;i++)
			
		{
			
			String z= box.get(i).getText();
			System.out.println(z);
			//Thread.sleep(1000);
			if(z.equalsIgnoreCase("india map"))
			{
				Actions action= new Actions(driver);
				action.moveToElement(box.get(i)).click().build().perform();
				break;
			}
				
				
		}
			System.out.println("Not Found");	
			driver.close();
		}
	
		
	}


