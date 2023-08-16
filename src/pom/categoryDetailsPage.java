package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class categoryDetailsPage extends BasePage{

	public categoryDetailsPage(WebDriver driver) {
		super(driver);
	}


	@FindBy(xpath = "//ul[@class='product_list grid row']/li")
	private List<WebElement> dressList;

	public List<WebElement> getDressList() {
		return dressList;
	}
	
	public productdetails dressListselect() {
		for(WebElement ele:dressList) {
			if(ele.getAttribute("href").contains("id_product=7")) {
				ele.click();
				return new productdetails(driver);
			}
		}
		return null;
	}

}
