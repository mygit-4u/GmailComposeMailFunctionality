package Tutorial1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo5 {
	
	@Test
	public void s1() {
		System.out.println("S1  in  demo5 class");
	}

	@AfterClass
	public void b2() {
		System.out.println("Demo5 After Class");
	}

	

	@BeforeClass
	public void b1() {
		System.out.println("Demo5 Before class");
	}
	

	@AfterTest
	public void a2() {
		System.out.println("Demo5 After Test");
	}
	

	@BeforeMethod
	public void c1() {
		System.out.println("Demo5 Before Method ");
	}

	@AfterMethod
	public void c2() {
		System.out.println("Demo5 After Method");
	}
	
} 