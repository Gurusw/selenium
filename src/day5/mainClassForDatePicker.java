package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainClassForDatePicker {
	
	static void FutureDatePicker(WebDriver driver, String Year, String Month, String eachDate)
	{
		//WebDriver driver=new ChromeDriver();
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
	
	while(true)
	{
		String	Month1 = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String Year1= driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		if(Month1.equals(Month)&& Year1.equals(Year))
		{
			break;
		}
		/*WebElement NextButton= */driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//This is the X-path for next button
	}
	 List<WebElement>    eachDate1= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td[@data-handler='selectDay']"));
	for(WebElement dt:eachDate1)
	{
		if(
		dt.getText().equals(eachDate))
		{
			dt.click();
			break;
			
		}
	}
	 
		
	}

	public static void main(String[] args) 
	{
		/*String DesiMonth="January";
		String DesiYear="2026";
		String DesiDate="11";*/
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
FutureDatePicker(driver, "2029", "June", "12");
	}

}
