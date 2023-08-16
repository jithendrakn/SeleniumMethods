package timeOuts;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pollingTime {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.pollingEvery(Duration.ofSeconds(1));
	wait.ignoring(NoSuchSessionException.class,StaleElementReferenceException.class);
	driver.get("https://demo.actitime.com/login.do");
	
	WebElement usernameTextField = driver.findElement(By.id("username"));
	usernameTextField.sendKeys("admin");
	WebElement passwordTextField = driver.findElement(By.cssSelector("input[placeholder=\"Password\"]"));
	passwordTextField.sendKeys("manager");
	WebElement loginButton = driver.findElement(By.linkText("Login"));
	loginButton.click();
	
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	
	wait.until(ExpectedConditions.visibilityOf(loginButton));
	driver.manage().window().minimize();
	driver.quit();
	
	
}
}
