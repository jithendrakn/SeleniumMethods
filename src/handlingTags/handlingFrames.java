package handlingTags;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class handlingFrames {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("http://www.leafground.com/");
	driver.findElement(By.xpath("//img[@alt='Frame']")).click();
	WebElement frameElement = driver.findElement(By.xpath("//iframe[@src='default.html']"));
	driver.switchTo().frame(frameElement);
	//driver.findElement(By.id("Click")).click();
	driver.switchTo().frame("frame2");
	WebElement frameElement1 = driver.findElement(By.id("Click1"));
	frameElement1.click();
	driver.manage().window().minimize();
	driver.quit();
  }
}
