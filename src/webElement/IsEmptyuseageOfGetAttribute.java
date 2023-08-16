package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEmptyuseageOfGetAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement userNameTextField = driver.findElement(By.id("username"));
		String usernameTextAttValue = userNameTextField.getAttribute("type");
		System.out.println("usernameTextAttValue : " + usernameTextAttValue);
		if(usernameTextAttValue.isEmpty()) {
			System.out.println("pass: username text field empty");
		}
		else {
			System.out.println("Fail : username text field is not empty");
		}
		driver.manage().window().minimize();
		driver.quit();
	}

}
