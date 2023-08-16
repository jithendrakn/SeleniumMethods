package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class useageofClass {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop-global.malaicha.com/");
		Thread.sleep(5000);
		WebElement loginButton = driver.findElement(By.className("loginRegister"));
		loginButton.click();
		System.out.println("loginButton :" + loginButton);
		Thread.sleep(5000);
		driver.quit();

	}

}
