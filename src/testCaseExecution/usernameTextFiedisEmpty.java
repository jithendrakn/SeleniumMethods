package testCaseExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class usernameTextFiedisEmpty {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	WebElement userNameTextField = driver.findElement(By.id("username"));
	String userNameTextFieldisEmptyorNot = userNameTextField.getAttribute("value");
	System.out.println("userNameTextFieldisEmptyorNot: "+ userNameTextFieldisEmptyorNot);
	if(userNameTextFieldisEmptyorNot.isEmpty()) {
		System.out.println("The UserNameText Field is Empty.");
	}else {
		System.out.println("The UserNameText Field is not Empty.");
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
