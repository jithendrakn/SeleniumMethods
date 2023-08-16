package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseageofName {
		public static void main(String[] args) throws Throwable {
			//set the driver excutable path
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			//Instatitae the browser specific class
			WebDriver driver=new ChromeDriver();
			//maximize the browser window
			driver.manage().window().maximize();
			//pass the main URL
			driver.get("https://www.facebook.com/");
			Thread.sleep(5000);
			//find the password text field
			WebElement passwordTextField = driver.findElement(By.name("pass"));
			passwordTextField.sendKeys("123456");
			Thread.sleep(5000);
			//find element login button 
			WebElement loginButton = driver.findElement(By.name("login"));
			loginButton.click();
			Thread.sleep(5000);
			//post condition
			driver.manage().window().minimize();
			driver.quit();
		}
}
