package TestNGG;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TakeSS 
{
	WebDriver driver;
	@Test
	void Take()
	{
		driver = new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com/java-interview-questions/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		TakesScreenshot be= (TakesScreenshot) driver;
		File Source = be.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"\\Screenshots\\fullpage1.jpg");
		Source.renameTo(target);
		driver.quit();
	}
	@Test (priority=2)
	void scroll()
	{
		driver = new EdgeDriver();
		driver.get("https://www.bing.com/search?q=youtube&gs_lcrp=EgRlZGdlKgcIABBFGMIDMgcIABBFGMIDMgcIARBFGMIDMgcIAhBFGMIDMgcIAxBFGMIDMgcIBBBFGMIDMgcIBRBFGMIDMgcIBhBFGMIDMgcIBxBFGMIDMgsICBDpBxj2Bxj6VdIBDDQ3NjQ2OTkzajBqMagCCLACAQ&FORM=ANSAB1&PC=U531&ntref=1");
		driver.manage().window().minimize();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,3000)", " ");
	}
	

}
