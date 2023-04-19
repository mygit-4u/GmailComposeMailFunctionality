package Tutorial1;

import org.testng.annotations.Test;

public class Demo2 {
	
	@Test
	public void a1()
	{
		System.out.println("a1 method in demo2");
	}
	
	@Test (dependsOnMethods = {"a8"},priority=3)
	public void a2()
	{
		System.out.println("a2 method in demo2");
	}
	
	@Test (dependsOnMethods= {"a8"},priority = -1)
	public void a3()
	{
		System.out.println("a3 method in demo2");
	}
	@Test (priority=0)
	public void a4()
	{
		System.out.println("a4 method in demo2");
	}
	@Test (dependsOnMethods = {"a8"},priority=3)
	public void a5()
	{
		System.out.println("a5 method in demo2");
	}
	@Test
	public void a6()
	{
		System.out.println("a6 method in demo2");
	}
	@Test(dependsOnMethods={"a4"})
	public void a7()
	{
		System.out.println("a7 method in demo2");
	}
	@Test(priority=1)
	public void a8()
	{
		System.out.println("a8 method in demo2");
	}
	
}
