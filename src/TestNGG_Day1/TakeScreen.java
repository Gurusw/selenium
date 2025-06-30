package TestNGG_Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class TakeScreen 
{
	WebDriver driver;
	@BeforeClass
	void login()
	{
		driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.manage().window().maximize();
		
		
	}

}
