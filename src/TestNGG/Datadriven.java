package TestNGG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datadriven {
	WebDriver driver;
	@BeforeClass
	void mainT()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		
	}
	@Test(dataProvider="pp")
	void sen(String email, String pwd) throws Exception
	{
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@value='1'][@id='loginbutton']")).click();
		String test=driver.findElement(By.xpath("//div[@class='_9ay7']")).getText();
		if(test.equals("The email address or mobile number you entered isn't connected to an account. Find your account and log in."))
		{
			System.out.println("Working fine");
		}
		else
		{
			System.out.println("Not working fine");
		}
		
	}
	@DataProvider (name="pp")
	Object [][] login()
	{
		Object data[][]= {{"guru","1233"},
				{"swamy","321"}
				
				
		};
		return data;
	}

}
