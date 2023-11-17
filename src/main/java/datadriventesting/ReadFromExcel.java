package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//step1: convert physical file into java readable object
		FileInputStream fis = new FileInputStream("./src/test/resources/New Microsoft Excel Worksheet (2).xlsx");
		
		//step2: open workbook
		//workbookfactory.create(fis)--->throws encryptDocumentException
		Workbook wb = WorkbookFactory.create(fis);
		
		//step3: get control over sheet
		Sheet sh =  wb.getSheet("Sheet1");
		
		//step4: get control over roe
		Row r = sh.getRow(3);
		Row r1 = sh.getRow(1);
		
		//step5: get control over cell
		Cell c = r.getCell(1);
		Cell c1 = r1.getCell(1);
		
		//step6: read data
		System.out.println(c.getStringCellValue());
		System.out.println(c1.getNumericCellValue());
		
		//step7: closeworkbook
		
		wb.close();
		
		
		
		

	}

}
