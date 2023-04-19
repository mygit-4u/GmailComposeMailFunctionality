package utilsLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelReader {
	
	public static XSSFWorkbook workbook;
	
	public ExelReader(String path) throws IOException {
		
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		workbook = new XSSFWorkbook(fis);
	}
	
	public static String sheetData(int index, int rownum, int cellnum) {
		
		XSSFSheet sheet = workbook.getSheetAt(index);
		String cellvalue = sheet.getRow(rownum).getCell(cellnum).getStringCellValue();
		return cellvalue;
	}
	
	public static int lastRow(int index) {
		XSSFSheet sheet = workbook.getSheetAt(index);
		int lastrow =sheet.getLastRowNum();
		return lastrow;
	}
	
	public static int lastCol(int index) {
		XSSFSheet sheet = workbook.getSheetAt(index);
		int lastcol =sheet.getRow(0).getLastCellNum();
		return lastcol;
	}
	
	public static  Object [][] captureData(String exelPath,int sheetIndex) throws IOException{
		
		ExelReader exel =new ExelReader(exelPath);

		int row = exel.lastRow(sheetIndex);
		int col = exel.lastCol(sheetIndex);

		Object [][] dataProvider = new Object[row][col];

			for (int i=0; i<row; i++) {
				for (int j=0; j< col; j++) {
				dataProvider[i][j] = ExelReader.sheetData(sheetIndex, i, j);
					}
			}
		return dataProvider;
	}
	
}
