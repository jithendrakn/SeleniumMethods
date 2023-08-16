package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class useageofGetPosition {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
		Set<String> windsowIDs = driver.getWindowHandles();		
		//System.out.println("windsowIDs : "+ windsowIDs);
		for(String wid:windsowIDs) {
			//System.out.println(wid);
			driver.switchTo().window(wid);
			int startX = driver.manage().window().getPosition().getX();
			System.out.println("startX  : "+ startX );
			int startY = driver.manage().window().getPosition().getY();
			System.out.println("startY : "+ startY);
		}
		driver.quit();
	}

}
