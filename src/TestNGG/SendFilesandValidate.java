package TestNGG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SendFilesandValidate
{
	
	WebDriver driver;

	@BeforeClass
	void login()
	{
		driver=new ChromeDriver();	
	 driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
	 
	 ////input[@id='filesToUpload']
	}

}
