package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class useageOfID {
	public static void main(String[] args) throws Throwable {
		//set the driver excutable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the driver specific class
		WebDriver driver=new ChromeDriver();
		//maximize the browser window
		driver.manage().window().maximize();
		//pass the main URL
		driver.get("https://demo.actitime.com/login.do");
		//Find the user name text field
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.sendKeys("admin");
		Thread.sleep(5000);
		//find the login button field
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.click();
		Thread.sleep(5000);
		//post condition 
		driver.quit();
	}
}
