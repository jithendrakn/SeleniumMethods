package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class dashBoardPage extends BasePage {

	public dashBoardPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText = "Sign in")
	private WebElement signupPage;

	public WebElement getSignupPage() {
		return signupPage;
	}
	
	public loginPage signupLink() {
		signupPage.click();
		
		return new loginPage(driver);
	}
}
