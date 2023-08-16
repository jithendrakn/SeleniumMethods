package handlingTags;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingIFrames {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://paytm.com/");
	
	driver.findElement(By.xpath("//span[text()='Sign In']")).click();
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//span[contains(text(),'Watch Video')]")).click();
	driver.switchTo().defaultContent();
	driver.findElement(By.cssSelector("img[alt='close Modal']")).click();
}
}
