package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginPage {

	
      //Declaration
		@FindBy(className="atLogoImg")
		private WebElement logo;
		
		@FindBy(id = "username")
		private WebElement usernameTF;
		
		@FindBy(name = "pwd")
		private WebElement passwordTF;
		
		@FindBy(id = "keepLoggedInCheckBox")
		private WebElement keepMeLoggedInCheckbox;
		
		@FindBy(id = "loginButton")
		private WebElement loginButton;
		
		@FindBy(id = "toPasswordRecoveryPageLink")
		private WebElement forgotPasswordLink ;
		
		//Initialization
		public ActitimeLoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
			
			
		}
		//Utilization
		public WebElement getLogo() {
			return logo;
		}
		
		public void setUsername(String username) {
			usernameTF.sendKeys(username);
			
		}
		public void setPassword(String password) {
			passwordTF.sendKeys(password);
			
		}
		public void clicKeepMeLoggedCheckbox() {
			keepMeLoggedInCheckbox.click();
		}
		public void clickLoginButton() {
			loginButton.click();
		}
		public void clickForgotPasswordLink() {
			forgotPasswordLink.click();
		}
		
		
}


