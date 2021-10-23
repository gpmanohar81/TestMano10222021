package dataProvider.Excel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel2 {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook wb= new XSSFWorkbook("./data/Book1.xlsx");
		XSSFSheet sh= wb.getSheet("Sheet1");
		
		sh.getLastRowNum();					   //total rows
		int rowCount= sh.getLastRowNum();
		sh.getRow(0).getLastCellNum();         //total columns(row 0 is just for refer..)
		int colCount = sh.getRow(0).getLastCellNum();
		
		  // for rows
		for (int i=1; i<=rowCount-1; i++) {       //row count not hard coded here
		XSSFRow rw=sh.getRow(i);
		   // for columns
		for (int j=0; j<=colCount-1; j++) {      //col count not hard coded here
		XSSFCell cel=rw.getCell(j);
		String val=cel.getStringCellValue();
	    System.out.println(val);
		}
		}

	}

}
