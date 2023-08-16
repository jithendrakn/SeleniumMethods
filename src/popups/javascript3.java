package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class javascript3 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("file:///C:/Users/JITHENDRA/Desktop/prompPopUp.html");
	
	driver.switchTo().alert().sendKeys("50");

	//driver.switchTo().alert().accept();
	//driver.switchTo().alert().dismiss();
	Thread.sleep(5); 
}
}
