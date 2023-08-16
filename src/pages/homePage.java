package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage {
	
	 @FindBy(id="container_users")
	 private WebElement userModule;
	 
	 @FindBy(id="logoutLink")
	 private WebElement logoutLink;

	public WebElement getUserModule() {
		return userModule;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}
	 
	 
}
