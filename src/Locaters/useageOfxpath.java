package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class useageOfxpath {
public static void main(String[] args) throws Throwable {
	//set the driver excutable path
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	//Instantiation of driver specific class
	WebDriver driver=new ChromeDriver();
	//maximize the browser window
	driver.manage().window().maximize();
	//pass the main URL
	driver.get("https://shop-global.malaicha.com/");
	Thread.sleep(3000);
	//find the login/register button
	driver.findElement(By.cssSelector("span[class='loginRegister']")).click();
	Thread.sleep(3000);
	//post condition and teminte session
	driver.manage().window().minimize();
	driver.quit();
}
}
