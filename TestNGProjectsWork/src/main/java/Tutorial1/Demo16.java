package Tutorial1;

import java.io.IOException;

import utilsLayer.ExelReader;

public class Demo16 {

	public static void main(String[] args) throws IOException {

ExelReader exel =new ExelReader(System.getProperty("user.dir")+"\\ExelFileFolder\\practice.xlsx");

int row = exel.lastRow(0);
int col = exel.lastCol(0);

Object [][] dataProvider = new Object[row][col];

//	dataProvider[0][0] = ExelReader.sheetData(0, 0, 0);
//	dataProvider[0][1] = ExelReader.sheetData(0, 0, 1);
//	dataProvider[0][2] = ExelReader.sheetData(0, 0, 2);
//	
//	dataProvider[1][0] = ExelReader.sheetData(0, 1, 0);
//	dataProvider[1][1] = ExelReader.sheetData(0, 1, 1);
//	dataProvider[1][2] = ExelReader.sheetData(0, 1, 1);
//	
//	System.out.println(dataProvider[1][1]);
	
	for (int i=0; i<row; i++) {
		
		for (int j=0; j< col; j++) {
		dataProvider[i][j] = ExelReader.sheetData(0, i, j);
		System.out.println(dataProvider[i][j]);
	}
	
	}
	}
	}
