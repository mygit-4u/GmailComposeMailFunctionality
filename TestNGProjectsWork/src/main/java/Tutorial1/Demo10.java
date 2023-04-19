package Tutorial1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Demo10 {

	public static void main(String[] args) throws IOException   {
		
		File f = new File("C:\\Users\\Acer\\Desktop\\workbook.xlsx");
			boolean xll = f.exists();
			System.out.println(xll);

			
		FileInputStream fis = new FileInputStream(f);

			
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0);
			String a= sheet.getRow(1).getCell(0).getStringCellValue();
				System.out.println(a);
				System.out.println(sheet.getLastRowNum());
				System.out.println(sheet.getRow(0).getLastCellNum());
			
		}
}
