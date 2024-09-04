package TASK13;

import java.io.FileOutputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class q2_createsheet
{
	public static void main(String[] args) throws Exception {
		
		//Creation of new Blank workbook 
		XSSFWorkbook wbsheet=new XSSFWorkbook();
		
		//Creating new Blank worksheet
				XSSFSheet sh=wbsheet.createSheet("Mysheet1");
		
		//creates an excel file at the specified location  
		String filepath="C:\\Users\\Mrsan\\MYEmployeeData.xlsx";
		
	
		// Write the workbook in file system
		FileOutputStream fos=new FileOutputStream(filepath);
		wbsheet.write(fos);
		
		// Closing file output connections 
		fos.close();
		// Print the name of the loaded sheet
				System.out.println(sh.getSheetName());
		System.out.println("Sheet1 created Successfully!");
}

}

