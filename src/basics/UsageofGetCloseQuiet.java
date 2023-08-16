package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageofGetCloseQuiet {
	public static void main(String[] args) throws Throwable {
		//set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the driver specific class
		ChromeDriver driver = new ChromeDriver();
		//get the URL- main URL 
		driver.get("https://www.drdo.gov.in/about-drdo");
		Thread.sleep(5000);
		//post condition 
		driver.close();
		//terminate the session
		driver.quit();
	}

}
