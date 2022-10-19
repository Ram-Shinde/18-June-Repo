package Parametarization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file =	new FileInputStream("D:\\Ram Shinde\\Selenium\\Selenium.xlsx");
	
	
	//Sheet sh=(Sheet) WorkbookFactory.create(file).getSheet("Sheet1");
	
//	
	double data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getNumericCellValue();
	
	System.out.println(data);
	
}
}
