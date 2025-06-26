package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Timeouts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver.setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://katalon.com/");
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
