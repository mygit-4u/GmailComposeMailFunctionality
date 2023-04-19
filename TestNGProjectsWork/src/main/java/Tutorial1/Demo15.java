package Tutorial1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo15 {

	

	@Test(dataProvider ="swayam")
	public void fblogin(String username, String pass) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
				
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.get("https://swayam.gov.in/");
				
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
//		Alert alt=driver.switchTo().alert();
//		alt.dismiss();
		
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("//input[@id='logonIdentifier']")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(pass);
		
	}
	
	@DataProvider(name="swayam")
	public Object[][] testData()
	{
		Object[][] data= new Object[1][2];
		
		data[0][0]="nikhil";
		data[0][1]="bondarde";
		
		return data;
	}
}

