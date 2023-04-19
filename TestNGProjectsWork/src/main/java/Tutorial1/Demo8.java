package Tutorial1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo8 {

	@BeforeClass
	public void openBrowser() {
		System.out.println("before class");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("after class");
	}
	
	@BeforeMethod
	public void setup() {
		System.out.println("Before Method");//1  4 7
	}

	@Test
	public void login() {
		System.out.println("login test case");//
	}
	
	@Test(priority=1)
	public void homepage() {
		System.out.println("Home page test case");//
	}

	@Test(priority=2)
	public void contactpage() {
		System.out.println("contact page test case");//
	}
	
	
	@Test(groups= {"extraPage"},priority=3)
	public void informationPage() {
		System.out.println("information page test case");//
	}

	@Test(groups= {"extraPage"},priority=4)
	public void logoutPage() {
		System.out.println("logout page test case");//
	}
	
	
	@AfterMethod
	public void tearDown() {
		System.out.println("After Method");//3  6 9
		System.out.println("-------------------------------");
	}
}