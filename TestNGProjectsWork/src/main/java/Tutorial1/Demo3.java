package Tutorial1;
import org.testng.annotations.Test;
public class Demo3 {
	@Test
	public void xyz()
	{
		System.out.println("xyz method");
	}
	@Test(dependsOnMethods={"a"})
	public void pqr()
	{
		System.out.println("pqr method");
	}
	@Test(dependsOnMethods={"xyz"})
	public void a()
	{
		System.out.println("a method");
	}
}
