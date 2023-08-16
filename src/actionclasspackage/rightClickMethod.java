package actionclasspackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class rightClickMethod {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	driver.get("https://trello.com/en/login");
	
	WebElement userNameField = driver.findElement(By.id("user"));
	userNameField.sendKeys("peoplefortiptur@gmail.com");
	 WebElement loginButton = driver.findElement(By.id("login"));
	 loginButton.click();
	
	wait.until(ExpectedConditions.invisibilityOf(loginButton));
	
	driver.findElement(By.name("password")).sendKeys("9886947924");
	
	driver.findElement(By.id("login-submit")).click();
	
	driver.findElement(By.xpath("//h3[text()='Starred boards']/../..//div[text()='ActionsClass']")).click();
	
	WebElement ganeshText = driver.findElement(By.xpath("//span[text()='Ganesh']"));
	Actions actions=new Actions(driver);
	actions.contextClick(ganeshText).perform();
	
	if(wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='Edit labels']")))).isDisplayed()) {
		System.out.println("PASS:: Edit Lables is displayed");
	}else {
		System.out.println("FAIL:: Edit Lables is NOT displayed");
	}
	
	driver.manage().window().minimize();
	driver.quit();
}
}
