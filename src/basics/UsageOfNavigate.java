package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfNavigate {
		public static void main(String[] args) throws Throwable {
			// set the driver excutable path
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			//Instantiation of browser specific class
			ChromeDriver driver = new ChromeDriver();
			//pass the main url
			driver.get("https://www.myntra.com/");
			//maximize the browser window
		  	driver.manage().window().maximize();
			Thread.sleep(5000);
			//backward previous page 
			String mainURL = driver.getCurrentUrl();
			System.out.println("mainURL= "+mainURL);
			driver.navigate().back();
			Thread.sleep(5000);
			//refresh method 
			driver.navigate().refresh();
			Thread.sleep(5000);
			//forward method
			driver.navigate().forward();
			Thread.sleep(5000);
			//post condition 
			driver.quit();
		}
}
