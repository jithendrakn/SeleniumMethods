package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class useageofSendkeys {

	public static void main(String[] args) throws Throwable {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.vtiger.com/vtigercrm/");
	  Thread.sleep(3000);
	  WebElement usernameTextField = driver.findElement(By.id("username"));
	  usernameTextField.clear();
	  Thread.sleep(3000);
	  usernameTextField.sendKeys(Keys.TAB);
	  Thread.sleep(3000);
	  usernameTextField.sendKeys("admin"); 
	  Thread.sleep(3000);
	  driver.manage().window().minimize();
	  driver.quit();
	  
	}

}
