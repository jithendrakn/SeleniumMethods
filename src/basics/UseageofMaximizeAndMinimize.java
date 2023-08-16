package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class UseageofMaximizeAndMinimize {
	public static void main(String[] args) throws Throwable {
		//set the driver excutable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the driver super class
		ChromeDriver driver = new ChromeDriver();
		//set the main URL
		driver.get("https://www.drdo.gov.in/about-drdo");
		//maximize the web browser
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//get the tittle of web application
		String actualwebtittle = driver.getTitle();
		System.out.println("actualwebtittle = "+ actualwebtittle);
		//minimize the web browser
		driver.manage().window().minimize();
		//post condition 
		driver.close();
		//terminate the session
		driver.quit();
	}

}
