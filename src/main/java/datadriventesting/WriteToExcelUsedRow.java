package datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteToExcelUsedRow {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		 FileInputStream fis = new FileInputStream("./src/test/resources/testdata.xlsx");
	      Workbook wb = WorkbookFactory.create(fis);
	      Sheet sh =  wb.getSheet("Sheet1");
	      Row r = sh.getRow(4);
	      Cell c = r.createCell(1);
	      c.setCellValue("trainee");
	      FileOutputStream fos = new FileOutputStream("./src/test/resources/testdata.xlsx");
	      wb.write(fos);
	      wb.close();
	      
	}

}
