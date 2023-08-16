package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class useageofContains {

	public static void main(String[] args) {
		//set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the browser specific classes
		ChromeDriver driver = new ChromeDriver();
		//Pass the main URL of the application
		driver.get("https://www.drdo.gov.in/");
		//control - u is used to get tittle page
		String expectedwebtittle="DRDO";
		System.out.println("expectedwebtittle = "+ expectedwebtittle);
		//get the tittle page of the web application
		String actualwebtittle = driver.getTitle();
		System.out.println("actualwebtittle : "+actualwebtittle);
		//verified the actual home page tittle contains DRDO or Not
		if(actualwebtittle.contains(expectedwebtittle))
		{
			System.out.println("pass : web page contains DRDO ");
		}else
		{
			System.out.println("fail : web page contains DRDO not contains ");
		}
		//post condition
		//terminate session
		driver.quit();
	}
}
