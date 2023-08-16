package basics;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationMethods {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.get("http://www.leafground.com/");
	/*driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	driver.navigate().to("http://www.leafground.com/");
	Thread.sleep(2000);
	URL mainUrl=new URL("http://www.leafground.com/");
	Thread.sleep(2000);
	URL subUrl=new URL(mainUrl ,"pages/Window.html");
	driver.navigate().to(subUrl);
	Thread.sleep(2000);*/
	//driver.manage().window().fullscreen();
	//Thread.sleep(2000);
	//driver.manage().window().minimize();
	//driver.quit();
}
}
