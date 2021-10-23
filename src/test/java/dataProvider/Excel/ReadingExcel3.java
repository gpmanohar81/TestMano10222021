package dataProvider.Excel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadingExcel3 {
//now converting it as data provider function, pas the execl into 2 dimention array[][]
	
	public  String[][] xldatamthd() throws IOException {
	
		XSSFWorkbook wb= new XSSFWorkbook("./data/Book1.xlsx");
		XSSFSheet sh= wb.getSheet("Sheet1");
		
		int rowCount= sh.getLastRowNum();  // we got row count []
	
		int colCount = sh.getRow(0).getLastCellNum();  // we got col count []
		
		//String[][] data=new String[2][3];
		String[][] data=new String[rowCount][colCount];
	
		
		  // for rows
		for (int i=1; i<=rowCount; i++) {       
		XSSFRow rw=sh.getRow(i);
		   // for columns
		for (int j=0; j<colCount; j++) {      
		XSSFCell cel=rw.getCell(j);
		String val=cel.getStringCellValue();
	    System.out.println(val);
	    
	    data[i-1][j]=val ;
	    
	    
	    
		}
		}
		
		 return data;

	}

}
