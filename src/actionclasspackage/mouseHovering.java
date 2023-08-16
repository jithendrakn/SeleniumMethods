package actionclasspackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mouseHovering {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	
	driver.get("https://www.naukri.com/");
	
	WebElement womenTab = driver.findElement(By.linkText("Jobs"));
	
	Actions actions=new Actions(driver);
	
	actions.moveToElement(womenTab).perform();
	
	driver.findElement(By.linkText("Jobs in Bangalore")).click();
	
	//driver.findElement(By.linkText("Sunglasses")).click();
	//driver.manage().window().minimize();
	//driver.quit();
}
}
