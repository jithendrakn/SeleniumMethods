package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage {
	 
	 @FindBy(id="username")
	 private WebElement usernameTextField;
	 
	 @FindBy(name="pwd")
	 private WebElement passwordField;
	 
	 @FindBy(id="keepLoggedInCheckBox")
	 private WebElement keepMeLoggedIn;
	 
	 @FindBy(id="loginButton")
	 private WebElement loginButton;
	  
	 @FindBy(id="toPasswordRecoveryPageLink")
	 private WebElement forgotPasswordField;
	 
	public WebElement getUsernameTextField() {
		return usernameTextField;
	}
	public WebElement getPasswordField() {
		return passwordField;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public WebElement getKeepMeLoggedIn() {
		return keepMeLoggedIn;
	}
	public WebElement getForgotPasswordField() {
		return forgotPasswordField;
	}
	 
	 
}
