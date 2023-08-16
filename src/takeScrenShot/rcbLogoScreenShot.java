package takeScrenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class rcbLogoScreenShot {
public static void main(String[] args) throws IOException {
	String timeStamp = LocalDateTime.now().toString().replace(':', '-');
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.get("https://www.royalchallengers.com/");
	WebElement RcbLogo = driver.findElement(By.xpath("//h3[text()='Download Our App']"));
	//System.out.println(RcbLogo.getTagName());
	File tempFile = RcbLogo.getScreenshotAs(OutputType.FILE);
	//System.out.println(tempFile.getAbsoluteFile());
	File destFile=new File("./errorshorts/"+timeStamp+"Rcblogo.png");
	FileUtils.copyFile(tempFile, destFile);
	driver.quit();
	
}
}
