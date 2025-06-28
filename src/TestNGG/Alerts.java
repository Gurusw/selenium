package TestNGG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alerts 
{
	WebDriver driver;
	
	@Test (priority=1)
	void Login()
	{
		driver = new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.manage().window().maximize();
	}
	@Test (priority=2, dependsOnMethods= {"Login"}, groups= {"Sanity"})
	void Alertee()
	{
		  driver.findElement(By.xpath("//input[@id='alertexamples']")).click();
		 org.openqa.selenium.Alert wee = driver.switchTo().alert();
		
		//System.out.println (getText());
		
		System.out.println(wee.getText());
		 wee.accept();
	}
	@Test (priority=3, dependsOnMethods= {"Login"}, groups= {"Regression"} )
	void Confirm() throws InterruptedException
	{
		driver.findElement(By.id("confirmexample")).click();
		Thread.sleep(2000);
		Alert con=driver.switchTo().alert();
		System.out.println(con.getText());
		con.accept();
	}
	@Test (priority=4, dependsOnMethods= {"Login"}, groups= {"Sanity", "Regression"})
	void input() throws InterruptedException
	{
		driver.findElement(By.id("promptexample")).click();
		Thread.sleep(3000);
		Alert sen=driver.switchTo().alert();
		sen.sendKeys("guru");
		sen.accept();
	}
	

}
