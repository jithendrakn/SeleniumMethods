package Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class useageofClick {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kn-in.facebook.com/");
		Thread.sleep(5000);
		WebElement languageLink = driver.findElement(By.xpath("//a[.='English']"));
		Thread.sleep(5000);
		languageLink.click();
		driver.manage().window().minimize();
		driver.quit();
	}

}
