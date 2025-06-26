package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class one {

	public static void main(String[] args) throws Exception  {
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.google.com/");
		driver.findElement(By.className("gLFyf")).sendKeys("HYR tutorials");
		driver.findElement(By.className("gNO89b")).submit();
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.findElement(By.className("gLFyf")).sendKeys("facebook");
		driver.findElement(By.className("gNO89b")).submit();
		driver.findElement(By.className("LC20lbMBeuODKV0Md")).click();

	}

}
