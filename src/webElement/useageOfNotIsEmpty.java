package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class useageOfNotIsEmpty {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		WebElement userNameTextField = driver.findElement(By.id("username"));
		String usernametextfieldvalue = userNameTextField.getAttribute("value");
		System.out.println("usernametextfieldvalue : "+ usernametextfieldvalue);
		if(usernametextfieldvalue.isEmpty()) {
			System.out.println("pass : user text field is empty");
		}else {
			System.out.println("fail : user name text field has value");
		}
		driver.manage().window().minimize();
		driver.quit();
	}
}
