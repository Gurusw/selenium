package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUps {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		JavascriptExecutor jse =(JavascriptExecutor) driver;
		
		jse.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.id("promptBox")).click();
		
		/* JavascriptExecutor jse =(JavascriptExecutor) driver;
			
			jse.executeScript("window.scrollBy(0,400)");
		Thread.sleep(3000);
		Alert pop = driver.switchTo().alert();
System.out.println(pop.getText());
Thread.sleep(3000);
pop.dismiss();*/

	Alert Simple =	driver.switchTo().alert();
	System.out.println(Simple.getText());
	Thread.sleep(3000);
	Simple.sendKeys("Guru");
	Simple.accept();
	//driver.quit();
	}

}
