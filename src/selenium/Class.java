package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Class {

	@Test
	public void demo()
	{
		System.out.println("guru");
	}
	@Test
	public void swamy()
	{
		System.out.println("swamy");
	}
	@Test
	public void dropDown() throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement drop =  driver.findElement(By.id("course"));
		Select sele = new Select(drop);
		sele.selectByIndex(2);
		Thread.sleep(3000);
		//driver.close();
		
		
	}
}

