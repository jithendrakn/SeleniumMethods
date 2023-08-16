package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandle {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.leafground.com/pages/Window.html");
	driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
	Set<String> signUpPage = driver.getWindowHandles();
	for (String wid : signUpPage) {
		System.out.println("window ids : " + wid);
	}
	
	driver.manage().window().minimize();
	driver.quit();
}
}
