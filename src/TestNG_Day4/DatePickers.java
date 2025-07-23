package TestNG_Day4;

import java.util.List;

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
	
	String DesiMonth="January";
	String DesiYear="2026";
	String DesiDate="11";
	while(true)
	{
		String	Month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String Year= driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		if(Month.equals(DesiMonth)&& Year.equals(DesiYear))
		{
			break;
		}
		/*WebElement NextButton= */driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//This is the X-path for next button
	}
	 List<WebElement>    eachDate= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td[@data-handler='selectDay']"));
	for(WebElement dt:eachDate)
	{
		if(
		dt.getText().equals(DesiDate))
		{
			dt.click();
			break;
		}
	}
	 
	}
	

}
