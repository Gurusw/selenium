package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleWindowshandling {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html#google_vignette");
		
 JavascriptExecutor jse =(JavascriptExecutor) driver;
	
	jse.executeScript("window.scrollBy(0,400)");
	driver.findElement(By.className("whButtons")).click();
	Set<String> handles =driver.getWindowHandles();
	{
		System.out.println(handles);
	}
		Thread.sleep(3000);
		//driver.quit();
	}

}
