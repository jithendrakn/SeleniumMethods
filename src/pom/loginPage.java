package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPage extends BasePage {

	public loginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="email")
	private WebElement emailTextField;
	
	@FindBy(id="passwd")
	private WebElement passwordField;
	
	@FindBy(id="SubmitLogin")
	private WebElement signupButton;
	
	@FindBy(linkText = "Forgot your password?")
	private WebElement forgotPasswordLink;
	
	public productsPage signupAction() {
		emailTextField.sendKeys("nameishemanth@gmail.com");
		passwordField.sendKeys("Testing@123");
		signupButton.click();
		
		return new productsPage(driver);
		
	}
	
	
}
