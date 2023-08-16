package pageObjectModelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends BasePage {
	
	public loginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="txtUsername")
	private WebElement usernameTextField;
	
	@FindBy(id="txtPassword")
	private WebElement passwordField;
	
	@FindBy(id="btnLogin")
	private WebElement loginButton;
	
	@FindBy(linkText = "Forgot your password?")
	private WebElement forgotPasswordLink;
	
	public WebElement getUsernameTextField() {
		return usernameTextField;
	}
	public WebElement getPasswordField() {
		return passwordField;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}
	
	public homePage loginPageAction(String username, String pswd) {
		usernameTextField.sendKeys(username);
		passwordField.sendKeys(pswd);
		loginButton.click();
		
		return new homePage(driver);
	}
	
}
