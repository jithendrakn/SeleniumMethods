package actionclasspackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClickMethod {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://live.skillrary.com/testing-app/product.php?product=selenium-training");
	
	WebElement addCartButton = driver.findElement(By.id("add"));
	Actions actions=new Actions(driver);
	actions.doubleClick(addCartButton).perform();
	
	driver.manage().window().minimize();
	driver.quit();
}
}
