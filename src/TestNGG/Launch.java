package TestNGG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch extends SendFilesandValidate {
	@Test
	void meth()
	{
		
		driver.findElement(By.id("filesToUpload")).sendKeys("C:\\Users\\GURU\\Desktop\\gsave\\Act].png");
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Act].png"))
{
System.out.println("Correct file");
}
		else
		{
			System.out.println("Not correct file");
		}
	}

}
