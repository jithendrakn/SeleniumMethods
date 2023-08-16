package practice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class useageofGetSize {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.leafground.com/pages/Window.html");
	driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
	Set<String> windowIDs = driver.getWindowHandles();
	for(String wid:windowIDs) {
		driver.switchTo().window(wid);
	//System.out.println(wid);
	String tittleofWindows = driver.getTitle();
	System.out.println("tittleofWindows : " + tittleofWindows);
		int heightWindow1 = driver.manage().window().getSize().getHeight();
		System.out.println("heightWindow1 : "+ heightWindow1);
		int windowWidth1 = driver.manage().window().getSize().getWidth();
		System.out.println("windowWidth1 : "+ windowWidth1);	
	}
	/*int heightWindow = driver.manage().window().getSize().getHeight();
	System.out.println("heightWindow : "+ heightWindow);
	int windowWidth = driver.manage().window().getSize().getWidth();
	System.out.println("windowWidth : "+ windowWidth);*/
	driver.manage().window().minimize();
	driver.quit();
}
}

