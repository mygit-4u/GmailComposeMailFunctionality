package baseLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DDTBase {

	public static XSSFWorkbook workbook;
	
	public static String info(int sheetNum, int rowNum, int cellNum) {
		 XSSFSheet sheet = workbook.getSheetAt(sheetNum);
		 String a=sheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
		 return a;
	}
	
	public static void main(String[] args) throws Throwable  {
		
		File f = new File("C:\\Users\\Acer\\Desktop\\practice.xlsx");
		System.out.println(f.exists());
		 	
 		 FileInputStream fis = new FileInputStream(f);
		
		 workbook = new XSSFWorkbook(fis);
		 String fname =DDTBase.info(0, 0, 0);
		 String lname =DDTBase.info(0, 0, 1);
		 String address=DDTBase.info(0, 0, 2);
		 
		 
		 System.out.println(fname); 
		 System.out.println(lname);
		 System.out.println(address);
		 
		 WebDriverManager.chromedriver().setup();
		 
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.faceboog.com/reg");
		 
		}
	
}
