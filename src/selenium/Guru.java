package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.udemy.com/home/my-courses/learning/");
		driver.close();
	}

}
