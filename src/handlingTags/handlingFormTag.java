package handlingTags;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class handlingFormTag {
public static void main(String[] args) throws MalformedURLException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://www.facebook.com/");
	URL mainUrl=new URL("https://www.facebook.com/");
	URL subURL=new URL(mainUrl, "signup");
	driver.navigate().to(subURL);
	WebElement parentFormTag = driver.findElement(By.cssSelector("form[id='reg']"));
	parentFormTag.findElement(By.name("firstname")).sendKeys("kohli");
	parentFormTag.findElement(By.name("lastname")).sendKeys("virat");
	parentFormTag.findElement(By.name("reg_email__")).sendKeys("0123456789");
	parentFormTag.findElement(By.xpath("//label[text()='Male']")).click();
	driver.manage().window().minimize();
	driver.quit();
	
}
}
