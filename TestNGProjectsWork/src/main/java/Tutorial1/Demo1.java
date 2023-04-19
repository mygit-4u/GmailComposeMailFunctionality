package Tutorial1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {
	
	@Test
	public void m1()
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\STesting\\Automation\\selenium\\chrome extension\\chromedriver.exe");
		
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com");

		driver.close();

	}

}
