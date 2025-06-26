package selenium;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=Ld9qJ4psQmI&list=PLacgMXFs7kl91Af0WfnlUSJZqyq9mWbrc&index=22");
		//driver.manage().window().maximize();
		TakesScreenshot ss = (TakesScreenshot)driver;
		File file = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("./Screenshots/image1"));
		Thread.sleep(3000);
		driver.quit();
		

	}

}
