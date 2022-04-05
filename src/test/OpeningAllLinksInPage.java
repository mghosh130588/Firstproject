package test;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningAllLinksInPage {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","//Users//mousumighosh//Selenium//Driver//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.guru99.com/");
		/* Thread.sleep(2000);
		List <WebElement> linktabs = driver.findElements(By.xpath("//section[@id='g-showcase']//descendant::li//child::a"));
		System.out.println(linktabs.size());
		String parentwindow= driver.getWindowHandle();
		for(int i =0;i<5;i++)
		{
			System.out.println(linktabs.get(i).getText());
			Thread.sleep(200);
			linktabs.get(i).sendKeys(Keys.chord(Keys.COMMAND,Keys.ENTER));
			
		}
		Thread.sleep(5000);
		Set<String> allwindow = driver.getWindowHandles();
		for(String handle : allwindow)
		{
			driver.switchTo().window(handle);
			System.out.println(driver.getTitle());
			driver.close();
		}
		driver.switchTo().window(parentwindow);
		
		driver.quit(); */
		
		List<WebElement> toolssign = driver.findElements(By.xpath("//h2[text()='Popular Tools']//ancestor::div[@class='g-grid']//following-sibling::div[@class='g-grid allrotatenativeads1']//descendant::h4"));
		for(int i=0;i<toolssign.size();i++)
		{
			
			System.out.println(toolssign.get(i).getText());
		}
	
	List<WebElement> footerelement = driver.findElements(By.xpath("//footer[@id='g-footer']//descendant::h4"));
	for (int i=0;i<footerelement.size();i++)
	{
		
		System.out.println(footerelement.get(i).getText());
	}		
		
	}

}
