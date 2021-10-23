package dataProvider.Excel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel0 {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook wb= new XSSFWorkbook("./data/Book1.xlsx");
		XSSFSheet sh= wb.getSheet("Sheet1");
	
		XSSFRow rw=sh.getRow(3);  //goes to 4th row of sheet
	
		XSSFCell cel=rw.getCell(2);    //goes to 3 column of 4th rows
		String val=cel.getStringCellValue(); // reads the value in cel
	    System.out.println(val);
		
		

	}

}
