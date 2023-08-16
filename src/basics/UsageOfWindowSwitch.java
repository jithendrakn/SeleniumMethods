package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfWindowSwitch {

	public static void main(String[] args) {
	   //set the driver excutable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	   //Instantiate the browser specific class
		ChromeDriver driver = new ChromeDriver();
	   //pass the main URL
		driver.get("http://www.leafground.com/pages/Window.html");
		//maximize
		driver.manage().window().maximize();
		//set xpath of the element
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		//get multiple url window
		Set<String> allWindowsID=driver.getWindowHandles();
		//print windowid iteratively one at a time
		for(String wid:allWindowsID)
		{
			String url=driver.switchTo().window(wid).getCurrentUrl();
			//System.out.println(url);
			if(url.equals("http://www.leafground.com/pages/Window.html"))
			{
				String windowurl = driver.getTitle();
				System.out.println("windowurl = "+windowurl);
			}
			if(url.equals("http://www.leafground.com/pages/Link.html"))
			{
				String linkurl = driver.getTitle();
				System.out.println("linkurl = "+linkurl);  	
			}
			if(url.equals("http://www.leafground.com/pages/Button.html"))
			{
				String buttonurl = driver.getTitle();
				System.out.println("buttonurl = "+buttonurl);	
			}
		}
	driver.manage().window().minimize();
	driver.quit();

	}

}
