package testLayer;


import org.testng.Assert;
import org.testng.annotations.Test;

import baseLayer.baseClass;



@Test(groups={"HomePage"},dependsOnGroups ={"LoginPage"})
public class HomePage extends baseClass {
	
	@Test(priority=1)
	public void validHomePageTitle() {
		String urlInfo=driver.getTitle();
		System.out.println(urlInfo);
		boolean info =urlInfo.contains("Homepage");
		Assert.assertEquals(info, true);
	
	}
	
//	@Test(priority=2)
//	public void validateHomePageUrl() {
//		Assert.assertEquals(driver.getCurrentUrl().contains("master"),true);
//	}
	
	
}
