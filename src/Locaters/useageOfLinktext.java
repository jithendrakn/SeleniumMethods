package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class useageOfLinktext {
		public static void main(String[] args) throws Throwable {
			//set the driver excutable path
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			//Instantiate the browser specific class
			WebDriver driver=new ChromeDriver();
			//maximize the browser window
			driver.manage().window().maximize();
			//pass the main URL
			driver.get("https://www.facebook.com/");
			Thread.sleep(3000);
			//findelement the loginbutton
			driver.findElement(By.linkText("Forgotten password?")).click();
			Thread.sleep(3000);
			//post condition
			driver.manage().window().minimize();
			driver.quit();
			
		}
}
