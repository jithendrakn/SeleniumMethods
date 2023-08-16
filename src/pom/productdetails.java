package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class productdetails extends BasePage{

	public productdetails(WebDriver driver) {
		super(driver);
	}

	@FindBy(css="i[class='icon-plus']")
	private WebElement plusIcon;
	
	@FindBy(css="i[class='icon-minus']")
	private WebElement minusIcon;
	
	@FindBy(id="group_1")
	private WebElement size;
	
	@FindBy(xpath="//fieldset[@class='attribute_fieldset']/label")
	private List<WebElement> color;
	
	@FindBy(name="Submit")
	private WebElement addToKartButton;

	public WebElement getPlusIcon() {
		return plusIcon;
	}

	public WebElement getMinusIcon() {
		return minusIcon;
	}

	public WebElement getSize() {
		return size;
	}

	public List<WebElement> getColor() {
		return color;
	}

	public WebElement getAddToKartButton() {
		return addToKartButton;
	}
	
	public void add(int count) {
		for(int i=1;i<=count;i++) {
			plusIcon.click();
		}
	}
	
	public void minus(int count) {
		for(int i=1;i<=count;i++) {
			minusIcon.click();
		}
	}
	
	public void sizeList(String name) {
		Select select = new Select(size);
		select.selectByValue(name);
	}
	
	public void selectColor(String colorName) {
		for(WebElement ele:color) {
			if(ele.getAttribute("name").equalsIgnoreCase(colorName)) {
				ele.click();
				break;
			}
		}
	}
	public procedtocheckout clickonAddToKart() {
		addToKartButton.click();
		return new procedtocheckout(driver);
	}
	
}
