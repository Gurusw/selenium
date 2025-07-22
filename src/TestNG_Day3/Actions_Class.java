package TestNG_Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Actions_Class 
{
WebDriver driver;
@BeforeClass
void act()
{
	driver=new ChromeDriver();
	driver.get("https://demo.opencart.com/");
	driver.manage().window().maximize();
	WebElement desk=driver.findElement(By.xpath("//a[text()='Desktops']"));
	WebElement selectDesk= driver.findElement(By.xpath("//a[text()='PC (0)']"));
	WebElement SelectMC=driver.findElement(By.linkText("https://demo.opencart.com/en-gb/catalog/desktops/mac"));
	
	Actions acts=new Actions(driver);
	acts.moveToElement(desk).moveToElement(SelectMC).click();
	//Thread.sleep(2000);
	acts.moveToElement(desk).moveToElement(selectDesk).click();
	driver.quit();
	
}
 @Test(priority=1)
void login()
{
	System.out.println("nothig");
}


@AfterClass
void close()
{
	driver.close();
}
}
