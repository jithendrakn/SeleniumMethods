package takeScrenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;	

public class movingImagesPEU {
public static void main(String[] args) throws IOException {
	String timeStamp = LocalDateTime.now().toString().replace(':', '-');
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	TakesScreenshot td=(TakesScreenshot) driver;
	driver.get("https://www.pib.gov.in/indexd.aspx");
	File pibHomePage = td.getScreenshotAs(OutputType.FILE);
	File destFile = new File("./errorshorts/"+timeStamp+"elecCommision.png");
	FileUtils.copyFile(pibHomePage, destFile);
	/*List<WebElement> imagesLogo = driver.findElements(By.xpath("//div[@class='nbs-flexisel-inner']/ul/li"));
	int numberofImages = imagesLogo.size();
	System.out.println("numberofImages :" + numberofImages);
	for(WebElement img:imagesLogo) {
		//System.out.println(img.getTagName());
		WebElement makeInIndia = driver.findElement(By.xpath("(//img[@title='Election Commission of India '])[3]"));
		File tempFile = makeInIndia.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./errorshorts/"+timeStamp+"elecCommision.png");
		FileUtils.copyFile(tempFile, destFile);
		WebElement eGazette = driver.findElement(By.xpath("(//img[@title='Grievance Redress Mechanism in Government '])[3]"));
		File tempFile1 = eGazette.getScreenshotAs(OutputType.FILE);
		File destFile1 = new File("./errorshorts/"+timeStamp+"Grivanceimg.png");
		FileUtils.copyFile(tempFile1, destFile1);
	}*/
	driver.manage().window().minimize();
	driver.quit();
}
}
