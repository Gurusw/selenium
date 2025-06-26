package TestNGG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftAssert {

	@Test (priority=1)
	void test()
	{
	System.out.println("print this statement...");
	System.out.println("Checking for Assert validation...");
	Assert.assertEquals(1, 2);
	System.out.println("this will not print this statement ");
	
	}
	@Test (priority=3)
	void test2()
	{
		System.out.println("print that========= statement...");
		System.out.println("Checking for Assert ========validation...");
		SoftAssert fd= new SoftAssert();
        
	}
}
