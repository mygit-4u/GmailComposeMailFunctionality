package Tutorial1;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Demo6 {
	

	@Test(groups = {"p1 gruoup"})
	public void p1() {
		System.out.println("P1 in demo6 class");
	}
	
	@BeforeMethod
	public void a1() {
		System.out.println("Demo6 before method");
	}
	@BeforeClass
	public void s2() {
		System.out.println("Demo6 before class");
	}
	@AfterClass
	public void a2() {
		System.out.println("Demo6 after class");
	}
	@AfterMethod
	public void s1() {
		System.out.println("Demo6 after method");
	}
}