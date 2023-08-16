package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class useageOfCSSselector {
public static void main(String[] args) throws Throwable {
	//set the driver excutable paths
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	//Instantiate the browser specific class
	WebDriver driver=new ChromeDriver();
	//maximize the browser window
	driver.manage().window().maximize();
	//pass the main URL
	driver.get("https://www.goldenchariot.org/");
	Thread.sleep(3000);
	//find the login button
	WebElement loginbutton = driver.findElement(By.cssSelector("//span[text()='Login']"));
	loginbutton.click();
	Thread.sleep(3000);
	//post condition
	driver.manage().window().minimize();
	driver.quit();
}
}
