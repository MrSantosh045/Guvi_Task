package TASK13;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Q4_WritingExcelDemo {

	public static void main(String[] args) throws IOException {
		//Creation of new Blank workbook 
		XSSFWorkbook wb=new XSSFWorkbook();
		//Creating new Blank worksheet
		XSSFSheet sh=wb.createSheet("Mysheet");
		// Creating an empty arraylist of Object][] 
		
		ArrayList<Object[]> empdata=new ArrayList<Object[]>();
		
		// Writing data to Object[] 
        // using add() method 		
		empdata.add(new Object[] {"Name","Age","Email"});
		empdata.add(new Object[] {"Santoah S","20","Santosh@test.com"});
		empdata.add(new Object[] {"Raj Joshi","25","raj@test.com"});
		empdata.add(new Object[] {"Suraj g","23","Suraj@example.com"});
		empdata.add(new Object[] {"Swara N","24","swara@example.com"});
		
		int rownum=0;
		
		for(Object[] emp:empdata) {
			// Creating a new row in the sheet
			XSSFRow row=sh.createRow(rownum++);
			int cellnum=0;
		for(Object value:emp) {
			// This line creates a cell in the next 
            //  column of that row 
		XSSFCell cell=row.createCell(cellnum++);
		if(value instanceof String)
			cell.setCellValue((String) value);
		if(value instanceof Integer)
			cell.setCellValue((Integer) value);
		//if(value instanceof Boolean);
			//cell.setCellValue((Boolean) value);
		}
		}
		// Write the workbook in file system
		String filepath="C:\\Users\\Mrsan\\FreshEmployeeData.xlsx";
		FileOutputStream fos=new FileOutputStream(filepath);
		wb.write(fos);
		// Closing file output connections 
		fos.close();
		System.out.println("EmployeeData.xlsx Written Successfully!");

	}
}

/* Output
 EmployeeData.xlsx Written Successfully!
 */

/* EmployeeData.xlsx will be created.
 * Its been attached in git repository */