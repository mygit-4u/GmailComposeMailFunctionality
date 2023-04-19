package Tutorial1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xslf.model.geom.Path;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo13 {

	public static XSSFWorkbook workbook;
	
	public Demo13(String path) throws IOException {
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		workbook = new XSSFWorkbook(fis);
	}

	public void getData(int sheetNum, int rowNum, int cellNum)	{
		XSSFSheet sheet = workbook.getSheetAt(sheetNum);
		String a= sheet.getRow(rowNum).getCell(cellNum).getStringCellValue();
		System.out.println(a);
	}
	
	public static void main(String [] arg) throws IOException {
	 
	 Demo13 obj = new Demo13  ("C:\\Users\\Acer\\Desktop\\practice.xlsx");	
	 		obj.getData(0, 0, 0);
	 		obj.getData(0, 0, 2);
	 		obj.getData(0, 1, 1);
	 
	}	
}
