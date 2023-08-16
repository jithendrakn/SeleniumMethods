package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class googleDoodleScrollBy {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	driver.get("https://www.google.com/doodles");
	
	for(;;) {
	try {
		driver.findElement(By.linkText("Mother's Day 2022 (May 30)")).click();
		break;
	} catch (NoSuchElementException e) {
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("scrollBy(0,500);");
	}
	}
}
}
