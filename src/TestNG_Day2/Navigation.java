package TestNG_Day2;

import org.testng.annotations.Test;

public class Navigation extends Navi  {
	@Test
	void testLoginNavi() throws Exception
	{
		driver.navigate().to("https://github.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.navigate().refresh();
	}

}
