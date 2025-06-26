package TestNGG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AsserClaas {
	@Test
	void Ass()
	{
		Assert.assertEquals("guru", "guru");
		String as="gurw", b="LTI";
		Assert.assertEquals(as, b);
		SoftAssert df = new SoftAssert();
		
		
	}

}
