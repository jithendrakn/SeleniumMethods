package timeOuts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWait {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://demo.actitime.com/login.do");
	WebElement usernameTextField = driver.findElement(By.id("username"));
	usernameTextField.sendKeys("admin");
	WebElement passwordTextField = driver.findElement(By.cssSelector("input[placeholder=\"Password\"]"));
	passwordTextField.sendKeys("manager");
	WebElement loginButton = driver.findElement(By.linkText("Login"));
	loginButton.click();
	//Thread.sleep(5000);
	String actualTittleHomePage = driver.getTitle();
	System.out.println("actualTittleHomePage: " + actualTittleHomePage);
	String homePageURL = driver.getCurrentUrl();
	System.out.println("homePageURL: "+ homePageURL);
	if(wait.until(ExpectedConditions.urlContains("/submit_tt.do"))) {
	System.out.println("PASS:: ");
	}else {
		System.out.println("FAIL:: ");
	}
	
	//wait.until(ExpectedConditions.urlContains(""));
	//System.out.println();
	//driver.manage().window().minimize();
	//driver.quit();
}
}
