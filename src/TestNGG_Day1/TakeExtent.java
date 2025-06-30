package TestNGG_Day1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class TakeExtent extends TakeScreen  {
	@Test(priority=0)
	void name()
	{
		TakesScreenshot ss=(TakesScreenshot)driver;
		File sr=ss.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(sr, new File(""))
		File targetFile=new File(System.getProperty("user.dir")+"\\Screenshots\\front.png");
		sr.renameTo(targetFile);
	}
	
}
