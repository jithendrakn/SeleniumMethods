package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class diabledTextfieldValues {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	
	driver.get("https://live.skillrary.com/testing-app/");
	
	WebElement subscriberTextField = driver.findElement(By.cssSelector("input[class=\"form-control\"]"));
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("arguments[0].value='yash';", subscriberTextField);
}
}
