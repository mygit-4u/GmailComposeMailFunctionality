package testLayer;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import baseLayer.baseClass;
import utilsLayer.ExelReader;

public class LoginPageFacebook extends baseClass {

		@Test(dataProvider="fblogin")
	public  void testDemo(String fname, String lname, String email) {
		
		baseClass.initialization();
		driver.findElement(By.id("u_0_b_77")).sendKeys(fname);
		driver.findElement(By.id("u_0_d_b+")).sendKeys(lname);
		driver.findElement(By.id("u_0_g_wa")).sendKeys(email);
	}
		
	@DataProvider(name="fblogin")	
	public  Object[][] data() throws IOException
	{
	Object[][] fbdata =ExelReader.captureData(System.getProperty("user.dir")+"\\ExelFileFolder\\practice.xlsx", 0);
		return fbdata;
	}
		
}
