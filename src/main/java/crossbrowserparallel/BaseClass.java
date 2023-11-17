package crossbrowserparallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	WebDriver driver;
	@Parameters("Browser")
		@BeforeClass
		public void classConfig(String browser) {
			
			switch (browser)
			{
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
				driver = new ChromeDriver();
				break;
			
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;
			default:
				System.out.println("Invalid browser info");
			}
			driver.manage().window().maximize();
			
	}

			@AfterClass
			public void classTearDown() {
				driver.close();
			}
			
		}
		


