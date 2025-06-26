package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {
	WebDriver driver = new ChromeDriver();
	@Test
	public void SquareOne()
	{
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		System.out.println(driver.findElement(By.xpath("//h1[@class='post-title entry-title']")).getText());
		System.out.println(" It is First one ");
	}
	@Test
	public void SquareTwo()
	{
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		//driver.manage().window().maximize();
		WebElement we =  driver.findElement(By.id("course"));
		Select sa = new Select(we);
		sa.selectByIndex(2);
		System.out.println(" It is 2nd one ");
		}
	@BeforeTest
	public void SquareThree()
	{
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		System.out.println(" It is 3rd one ");
	}
	

}
