package TestNG_Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DatePickers
{
	WebDriver driver;
	@BeforeClass
	void first()
	{
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
	}
	/*@Test
	void Second() throws Throwable
	{
		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("11/12/204");
		Thread.sleep(3000);
	}
	@AfterClass
	void Last()
	{
		//driver.quit();
		 * 
		 //1. 
	}*/
	@Test
	void second()
	{
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
	
	String DesiMonth="December";
	String DesiYear="2026";
	String DesiDate="13";
	while(true)
	{
		String	Month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String Year= driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		if(Month.equals(DesiMonth)&& Year.equals(DesiYear))
		{
			break;
		}
		/*WebElement NextButton= */driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	}
	
	}
	

}
