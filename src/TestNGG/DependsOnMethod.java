package TestNGG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test (priority=1)
	void Open()
	{
		System.out.println(" THis will open the app");
	}
	@Test (priority =4, dependsOnMethods= {"Open"})
	void Login()
	{
		System.out.println("Login into application");
		Assert.assertTrue(false);
	}
	@Test (priority =33, dependsOnMethods= {"Login", "Open"})
	void SignUp()
	{
		System.out.println("Tap on SignUp");
	}

}
