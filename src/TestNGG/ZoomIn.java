package TestNGG;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ZoomIn {
	WebDriver driver;
	@Test(priority=1)
	void login()
	{
		driver=new ChromeDriver();
		driver.get("https://chatgpt.com/");
		driver.manage().window().maximize();
	}
	@Test(priority=2, dependsOnMethods= {"login"})
	void Zoom() throws Exception
	{
		JavascriptExecutor jf=(JavascriptExecutor)driver;
		jf.executeScript("document.body.style.zoom='50%'");
		Thread.sleep(3000);
		jf.executeScript("document.body.style.zoom='100%'");
		Thread.sleep(2000);
		driver.quit();
	}
	

}
