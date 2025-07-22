package TestNG_Day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Alertss {
	WebDriver driver;
	@Test
	void testauto() throws Exception
	{
		driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		// To find single element in the checkBox
	    WebElement WebData = driver.findElement(By.xpath("//input[@value='sunday']"));
		WebData.click();
		Thread.sleep(2000);
		WebData.click();
		System.out.println(WebData.getText());
		
	}
	@Test(priority=2)
	void second()
	{
		//For Selecting multiple elements
		 List <WebElement> ele=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@value,'day')]"));
		 for(int i=0; i<ele.size();i++)
		 {
			 ele.get(i).click();
		 System.out.println(ele.get(2).getText());
		 }
		 //driver.close();
	}

}
