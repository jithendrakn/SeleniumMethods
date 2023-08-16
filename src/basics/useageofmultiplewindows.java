package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class useageofmultiplewindows {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Windows.html");
		//String parentWindow = driver.getWindowHandle();
		//System.out.println("parentWindow : "+ parentWindow);
		//String parenttittleWindow = driver.getTitle();
		//System.out.println("parenttittleWindow : " + parenttittleWindow);
		WebElement clickButton = driver.findElement(By.xpath("//button[text()='    click   ']"));
		clickButton.click();
		Thread.sleep(5000);
		Set<String> multipleWindows = driver.getWindowHandles();
		for(String str:multipleWindows)
		{
			driver.switchTo().window(str);
			String multipletabURL = driver.getCurrentUrl();
			System.out.println(multipletabURL);
			if(multipletabURL.equals("//www.selenium.dev/")) {
			//System.out.println(str)
			WebElement searchField = driver.findElement(By.xpath("//span[text()='Search']"));
			Thread.sleep(5000);
			searchField.sendKeys("selenium");
			Thread.sleep(5000);
			driver.close();
			}	
		}
		driver.quit();
	}
}
