package testCaseExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class toFindTheColourOfLoginButton {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("kohli");
	driver.findElement(By.name("pwd")).sendKeys("kohli123");
	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(3000);
	WebElement errorMessageText = driver.findElement(By.xpath("//span[text()='Username or Password is invalid. Please try again.']"));
	String colorofInvalidTextPwdErrorMessage = errorMessageText.getCssValue("color");
	System.out.println(" colorInvalidTextPwdError is : " +  colorofInvalidTextPwdErrorMessage);
	String hexCode = Color.fromString(colorofInvalidTextPwdErrorMessage).asHex();
	System.out.println("hexCode : "+ hexCode);
	driver.manage().window().minimize();
	driver.quit();
	}
}
