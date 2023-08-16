package timeOuts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class MyCustom implements ExpectedCondition<Boolean>{

	@Override
	public Boolean apply(WebDriver driver) {
		return driver.getTitle().equals("hello");
	}
   @Override
public String toString() {
	
	return "sorry, the tittle is wrong";
}
}
