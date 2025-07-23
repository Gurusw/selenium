package day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class methodClassForDatePicker 
{
	void mai()
	{
		WebDriver 

	driver=new ChromeDriver();
	driver.get("https://jqueryui.com/datepicker/");
	driver.manage().window().maximize();
	driver.switchTo().frame(0);
	}
}
