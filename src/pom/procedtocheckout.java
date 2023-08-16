package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class procedtocheckout {

	@FindBy(css="a[title=\"Proceed to checkout\"]")
	private WebElement proceedButton;

	public procedtocheckout(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public WebElement getProceedButton() {
		return proceedButton;
	}
	
	public void proceedAction() {
		proceedButton.click();
	}
	
}
