package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDowns {

	public static void main(String[] args) throws InterruptedException {
//		WebDriverManager.chromedriver().setUp();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement drop = driver.findElement(By.id("course"));
		Select sele = new Select(drop);
		sele.selectByIndex(1);
		
	System.out.println(driver.getTitle());
		//driver.get("");
		
	}

}
