package TestNGG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AsserClaas {
	@Test
	void Ass()
	{
		Assert.assertEquals("guru", "guru");
		String as="gurw", b="LTI";
		//Assert.assertEquals(as, b);
		//SoftAssert df = new SoftAssert();
		System.out.println("it is testNG1");
		Assert.assertFalse(false);		
		System.out.println("it is testNG2");
		Assert.assertTrue(false);
		System.out.println("it is testNG3");
		Assert.assertEquals(as, "LTI");
		Assert.assertEquals(b, "LTI");
		
	}

}
