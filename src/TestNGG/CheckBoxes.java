package TestNGG;

import java.time.Duration;
import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxes {
	WebDriver driver;
	@Test (priority=1)
	void CheckBoxLogin()
	{
		driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println("It should login to link");
		
	}
	@Test (priority=2, dependsOnMethods= {"CheckBoxLogin"})
	void checkBoxes()
	{
	   List <WebElement> checkbxes=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));// For selecting multiple checkBoxes
	   //checkbxes.click();
	  for(WebElement val : checkbxes)
	   {
		   val.click();
	   }
	   System.out.println("It should select the all boxes in week day");
	}
	@Test (priority=3, dependsOnMethods= {"checkBoxes"})
	void checkLink()
	{
		@Nullable String link = driver.getCurrentUrl();
		Assert.assertEquals("https://testautomationpractice.blogspot.com/", link);
		System.out.println(link);
	}
	@Test (priority=4, dependsOnMethods= {"checkBoxes"})
	void checkOnly()
	{
		 List <WebElement> checkbxes=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		for(int o=3; o<checkbxes.size(); o++)
		{
			checkbxes.get(o).click();
		}
		System.out.println("3 Check boxes unclicked using this method");
	}

}
