package popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScript2 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("file:///C:/Users/JITHENDRA/Desktop/confirmationPopup.html");
	Thread.sleep(5); 
	//driver.switchTo().alert().accept();
	driver.switchTo().alert().dismiss();
	Thread.sleep(5); 
	
	//driver.manage().window().minimize();
	
	
	//driver.quit();
}
}
