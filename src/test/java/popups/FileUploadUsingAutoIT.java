package popups;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadUsingAutoIT {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
			Runtime.getRuntime().exec( "C:\\Users\\AVINASH\\Desktop\\AutoITfiles\\loadfile.exe");
			
			Thread.sleep(5000);
			driver.close();
			
			
	}
}