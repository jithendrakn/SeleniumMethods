package actionclasspackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class keyDownAndKeyUpMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	driver.get("https://www.qspiders.com/");
	
	WebElement aboutModule = driver.findElement(By.xpath("//span[text()='About Us']"));
	Actions actions=new Actions(driver);
	actions.keyDown(Keys.CONTROL).click(aboutModule).keyUp(Keys.CONTROL).perform();
	
	driver.manage().window().minimize();
	driver.quit();
}
}
