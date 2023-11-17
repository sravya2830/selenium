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

public class WriteToExcelNewRow {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
      FileInputStream fis = new FileInputStream("./src/test/resources/testdata.xlsx");
      Workbook wb = WorkbookFactory.create(fis);
      Sheet sh =  wb.getSheet("Sheet1");
      Row r = sh.createRow(4);
      Cell c = r.createCell(0);
      c.setCellValue("user22");
      FileOutputStream fos = new FileOutputStream("./src/test/resources/testdata.xlsx");
      wb.write(fos);
      wb.close();
      
      
      
	}

}