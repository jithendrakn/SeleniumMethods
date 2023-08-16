package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfToStringURL {
	public static void main(String[] args) throws Throwable {
		//set the driver excutable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Intantiate the driver specific class
	    ChromeDriver driver = new ChromeDriver();
	    //pass the URL -main URL
	    driver.get("https://www.myntra.com/");
	    //Maximise the web window
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    //pass the sub URL
	    driver.navigate().to("https://www.myntra.com/shop/women");
	    Thread.sleep(5000);
	    //post condition and terminate the session
	    driver.quit();
	}

}
