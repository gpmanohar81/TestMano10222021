package dataProvider.Excel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExecl1 {

	public static void main(String[] args) throws IOException {
	
		XSSFWorkbook wb= new XSSFWorkbook("./data/Book1.xlsx");
		XSSFSheet sh= wb.getSheet("Sheet1");
		
		  // for rows
		for (int i=1; i<=3; i++) {      // iterating to read all 4 rows
		XSSFRow rw=sh.getRow(i);
		   // for columns
		for (int j=0; j<=2; j++) {     // iterating to read all 3 columns of 4 rows
		XSSFCell cel=rw.getCell(j);
		String val=cel.getStringCellValue();  //reads all cel values
	    System.out.println(val);
		}
		}

}
}
