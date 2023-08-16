package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getSizes {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//driver.manage().window().maximize();
	driver.get("http://www.leafground.com/pages/Window.html");
/*	int windowHeight = driver.manage().window().getSize().getHeight();
	System.out.println("windowHeight : " + windowHeight);
	int windowWidth = driver.manage().window().getSize().getWidth();
	System.out.println("windowWidth : " + windowWidth);*/
	driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
	Set<String> windowIds = driver.getWindowHandles();
	for (String wid : windowIds) {
		driver.switchTo().window(wid);
		System.out.println(driver.getTitle());
		Point xAxis = driver.manage().window().getPosition();
		int startX = xAxis.getX();
		System.out.println("startX : " + startX);
		Point yAxis = driver.manage().window().getPosition();
		int startY = yAxis.getY();
		System.out.println("startY : " + startY);
	}
	
}
}
