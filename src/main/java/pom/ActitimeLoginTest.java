package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		ActitimeLoginPage login = new ActitimeLoginPage(driver);
		
		if(login.getLogo().isDisplayed())
			System.out.println("Login page displayed");
		login.setUsername("admin");
		login.setPassword("manager");
		login.clicKeepMeLoggedCheckbox();
		login.clickLoginButton();
	

	}

}
