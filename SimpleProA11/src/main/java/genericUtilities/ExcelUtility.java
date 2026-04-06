package genericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public String toReadDataFromExcel(String sheetName,int rowNum,int cellNum) throws Throwable {
		FileInputStream fis = new FileInputStream("./\\src\\test\\resources\\ThalapathyTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String Value = wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		return Value;
	}
	
}
