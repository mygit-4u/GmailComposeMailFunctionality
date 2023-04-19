package Tutorial1;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Demo4 {
	
	
	@BeforeSuite
	public void setup() {
		System.out.println("Demo4 Before Suite ");
	}

	@AfterSuite
	public void tearDown() {
		System.out.println("Demo4 After Suite ");
	}

	

	@BeforeClass
	public void b1() {
		System.out.println("Demo4 Before class");
	}
	

	@AfterTest
	public void a2() {
		System.out.println("Demo4 After Test");
	}
	@AfterClass
	public void b2() {
		System.out.println("Demo4 After Class");
	}

	@BeforeMethod
	public void c1() {
		System.out.println("Demo4 Before Method ");
	}

	@AfterMethod
	public void c2() {
		System.out.println("Demo4 After Method");
	}
	@BeforeTest
	public void a1() {
		System.out.println("Demo4 Before Test");
	}
	@Test
	public void d1() {
		System.out.println("D1 method in  Demo4 class");
	}

}


