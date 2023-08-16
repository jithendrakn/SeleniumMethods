package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class useageofpartiallinkText {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.sit.ac.in/html/home.html");
		Thread.sleep(5000);
		WebElement loginButton = driver.findElement(By.partialLinkText("Education Background"));
		loginButton.click();
		Thread.sleep(5000);
		driver.quit();

	}

}
