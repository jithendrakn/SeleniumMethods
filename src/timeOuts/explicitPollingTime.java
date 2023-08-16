package timeOuts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitPollingTime {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Wait wait=new WebDriverWait(driver, Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(1));
	
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	
	wait.until(ExpectedConditions.titleIs("actiTIME -   Time-Track"));
	/*String acutualHomePagetittle = driver.getTitle();
	System.out.println("acutualHomePagetittle : " + acutualHomePagetittle);
	String actualUrl = driver.getCurrentUrl();
	System.out.println("actualUrl : " + actualUrl);*/
}
}
