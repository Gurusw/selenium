package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenSS {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=Ld9qJ4psQmI&list=PLacgMXFs7kl91Af0WfnlUSJZqyq9mWbrc&index=22");
		driver.manage().window().maximize();
		TakesScreenshot ss= (TakesScreenshot) driver;
		File files = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(files , new File ("./Screenshot/image2") );
	}

}
