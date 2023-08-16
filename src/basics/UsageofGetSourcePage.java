package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageofGetSourcePage {
	public static void main(String[] args) {
		//set the driver excutable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the driver specific class
		ChromeDriver driver = new ChromeDriver();
		//pass the URL -main URL
		driver.get("https://www.facebook.com/");
		String expectedTittlePage = "facebook";
		System.out.println("expectedTittlePage = "+expectedTittlePage);
		//verify the identified page resource
		String ActualPageSource = driver.getPageSource();
		System.out.println(ActualPageSource);
		if(ActualPageSource.contains(expectedTittlePage))
		{
			System.out.println("pass : the page tittle is matching");
		}
		else
		{
			System.out.println("fail : the page tittle is not matching");
		}
		//post condition
		driver.quit();
	}

}
