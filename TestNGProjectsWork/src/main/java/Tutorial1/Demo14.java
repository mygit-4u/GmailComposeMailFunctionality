package Tutorial1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo14 {
	@Test(dataProvider = "fbdata")
	public void fblogin(String uname, String pass) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

		driver.findElement(By.name("email")).sendKeys(uname);
		driver.findElement(By.name("pass")).sendKeys(pass);
		Thread.sleep(7000);
		driver.close();
	}

	@DataProvider(name = "fbdata")
	public Object[][] testData() {

		Object[][] data = new Object[3][2];

		data[0][0] = "Username1";
		data[0][1] = "Password1";

		data[1][0] = "Username2";
		data[1][1] = "Password2";
		
		data[2][0] = "Username3";
		data[2][1] = "Password3";

		return data;

	}

}

