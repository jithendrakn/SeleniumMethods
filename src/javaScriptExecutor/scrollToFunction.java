package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class scrollToFunction {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	
	driver.get("https://www.naukri.com/");
	
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	Thread.sleep(2000);
	jse.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	Thread.sleep(2000);
	jse.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
}
}
