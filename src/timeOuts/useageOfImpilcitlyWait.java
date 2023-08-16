package timeOuts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class useageOfImpilcitlyWait {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.linkText("actiTIME Inc.")).click();
	//driver.findElement(By.id("user")).sendKeys("peoplefortiptur@gmail.com");
	//driver.findElement(By.linkText("Log in with SSO"));
}
}
