package takeScrenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class rcbPageScreenshot {
public static void main(String[] args) throws IOException {
	String timeStamp = LocalDateTime.now().toString().replace(':', '-');
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://www.royalchallengers.com/");
	TakesScreenshot td=(TakesScreenshot) driver;
	File tempFile = td.getScreenshotAs(OutputType.FILE);
	File destFile = new File("./errorshorts/"+timeStamp+"rcbhomePage.png");
	FileUtils.copyFile(tempFile, destFile);
	driver.quit();
}
}
