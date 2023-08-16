package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class useageofClear {

	public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.vtiger.com/vtigercrm/");
	WebElement usernameTextfield = driver.findElement(By.id("username"));
	Thread.sleep(3000);
	usernameTextfield.clear();
	Thread.sleep(3000);
	driver.manage().window().maximize();
	driver.quit();
	}

}
