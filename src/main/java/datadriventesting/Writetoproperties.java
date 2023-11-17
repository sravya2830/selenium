package datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Writetoproperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
   //step1: convert physical file into java readable object
		FileInputStream fis = new FileInputStream("./seleniumA1/src/test/resources/data.properties"); 
		//step2: create an instance of properties class
		Properties property = new Properties();
		//step3:load all the key-value pairs into Properties object
		property.load(fis);
		//step4:write to Properties object
		property.put("user2", "trainee");
		property.put("pwd2", "trainee");
		//step5:save the file
		FileOutputStream fos = new FileOutputStream("./seleniumA1/src/test/resources/data.properties");
		property.store(fos, "updated sucessfully");
		
		
	}

}
