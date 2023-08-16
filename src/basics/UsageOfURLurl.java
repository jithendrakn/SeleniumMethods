package basics;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfURLurl {
	public static void main(String[] args) throws Throwable {
		//set the driver excutable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the driver specific class
		ChromeDriver driver = new ChromeDriver();
		//pass the URL- main url
		driver.get("https://www.myntra.com/");
		//maximize the web application size
		driver.manage().window().maximize();
		//main url
		URL mainurl = new URL("https://www.myntra.com/");
		//sub url men page
		URL menpage=new URL(mainurl,"men/");
		System.out.println("menpage = "+menpage);
		Thread.sleep(5000);
		//sub url women page
		URL womenpage=new URL(mainurl,"women/");
		System.out.println("womenpage = "+womenpage);
		Thread.sleep(5000);
		//pOst condition
		driver.quit();	}
}
