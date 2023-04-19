package Tutorial1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo17 {

	public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	
	WebDriverWait wait= new WebDriverWait(driver, 20);
	String eTitle = "Demo Guru99 Page";
	String aTitle = "" ;
	// launch Chrome and redirect it to the Base URL
	driver.get("http://demo.guru99.com/test/guru99home/" );
	
	aTitle = driver.getTitle();
	//compare the actual title with the expected title
	if (aTitle.contentEquals(eTitle))
	{
	System.out.println( "Test Passed") ;
	}
	else {
	System.out.println( "Test Failed" );
	}
	WebElement guru99seleniumlink;
	guru99seleniumlink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i")));
	guru99seleniumlink.click();


	
SimpleDateFormat dt = new SimpleDateFormat("_ddMMyyyy_HHmmss");
String date =dt.format(new Date());
	
	TakesScreenshot ts = (TakesScreenshot)driver ;
	File f =ts.getScreenshotAs(OutputType.FILE);
	File path = new File(System.getProperty("user.dir")+"\\TestNGProjectsWork\\ScreenShots"+date+"png");
	FileUtils.copyFile(f, path);
	
	
	
	
	
	}
	
}