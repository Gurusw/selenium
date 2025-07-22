package TestNG_Day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SelectClass 
{
	WebDriver driver;
	//1. Select the drop down element first
	//2. Select the specific element
	//3. To get the get Text from the dropDowns use the Options
	@BeforeClass
	void beforeClass()
	{
		driver = new ChromeDriver();
		driver.get("");
		
	}
	@Test(priority=0, dependsOnMethods= {"beforeClass"})
	void pen()
	{
	WebElement	SelectOption = driver.findElement(By.xpath(null));
	Select dropElement = new Select(SelectOption);
	dropElement.selectByIndex(1);
	List <WebElement> Opp=dropElement.getOptions();
	
		for( WebElement oii: Opp)
		{
			System.out.println(oii.getText());
		}
	}

}
