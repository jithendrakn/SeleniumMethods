package pageObjectModelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage extends BasePage{
	
	public homePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="welcome")
	private WebElement welcomDropdown;
	
	@FindBy(linkText ="Logout")
	private WebElement logoutLink;
	
	@FindBy(id="menu_buzz_viewBuzz")
	private WebElement buzzTab;
	
	public WebElement getWelcomDropdown() {
		return welcomDropdown;
	}
	public WebElement getLogoutLink() {
		return logoutLink;
	}
	public WebElement getBuzzTab() {
		return buzzTab;
	}
	
	public void logoutAction() {
		
		buzzTab.click();
		welcomDropdown.click();
		logoutLink.click();
		
	}
	
}
