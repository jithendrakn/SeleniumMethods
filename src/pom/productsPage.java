package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class productsPage extends BasePage{

	public productsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//ul[contains(@class,'clearfix menu-content')]")
	private List<WebElement> productsList;

	public List<WebElement> getProductsList() {
		return productsList;
	}
	
	public categoryDetailsPage productsAction() {
		for(WebElement ele:productsList) {
			System.out.println(ele.getText());
			if(ele.getText().equalsIgnoreCase("Dresses")) {
				ele.click();
				return new categoryDetailsPage(driver);
		}
		}
		return null;
		
	}
	
	
}
