package testLayer;

import org.openqa.selenium.By;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseLayer.baseClass;


@Test(groups = {"LoginPage"})
public class LoginPage extends baseClass {
	
	
	@BeforeMethod
	public void setup() {
		baseClass.initialization();
	}
	@Test
	public void loginPageInfo() {
	//	driver.findElement(By.className("q")).click();
		driver.findElement(By.name("q")).sendKeys("mastercard");
		driver.findElement(By.xpath("(//div[@class='wM6W7d'])[2]")).click();
		driver.findElement(By.xpath("//a[@href='https://www.mastercard.co.in/en-in.html']")).click();
	
	
	
	}
	@AfterSuite
	public void tearDown() throws InterruptedException	{
		driver.close();
	}
	
}
