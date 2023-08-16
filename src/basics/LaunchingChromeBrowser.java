package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingChromeBrowser {
  public static void main(String[] args)
  {
	//Set the driver executable path
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	//Instantiate the browser specific class
	ChromeDriver driver = new ChromeDriver();
	//pass the main url - fully quaified url
	driver.get("https://www.facebook.com/");
	//This is used to close the current window which is under control
	driver.close();
	//post condition
	//terminate the session
	//close the Chromedriver -mini server
	//close all the windows opened in the same session
	driver.quit();
  }
}
