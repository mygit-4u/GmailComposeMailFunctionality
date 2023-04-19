package Tutorial1;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Demo7 {

	@Test
	public void setUp() {
		Assert.assertEquals("setup", "setup");	
		}
	
	@Test (dependsOnMethods= {"setUp"})
	public void loginFunctionality() {
		Assert.assertEquals("Login","Login");
	}
	
	@Test(dependsOnMethods= {"loginFunctionality"})
	public void validateHomePage() {

		boolean actualLogo= true;
		Assert.assertEquals(actualLogo, true);
	}
	
	@Test (dependsOnMethods= {"validateHomePage"})
	public void validateUserOnPIMPage() {
		String urlID ="https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
		Assert.assertEquals(urlID.contains("pim"),true);
	}
}
