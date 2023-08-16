package handlingTags;

import java.io.File;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class divtagsUpdated {
public static void main(String[] args) throws Throwable {
	//String timeStamp = LocalDateTime.now().toString().replace(':', '-');
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(500));
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(5000);
	
	WebElement parentDiv = driver.findElement(By.xpath("//div[@class='_331-kn _2tvxW']//div[@class='_37M3Pb']"));
	List<WebElement> allImages = parentDiv.findElements(By.xpath("//img[@class='_396cs4  _3exPp9']"));
	System.out.println(allImages.size());
	wait.until(ExpectedConditions.visibilityOfAllElements(allImages));
//	int i=0;
	for (WebElement image : allImages) {
	String actualAltText=image.getAttribute("class");
			if (actualAltText.equals("_396cs4  _3exPp9")) {
				String timeStamp = LocalDateTime.now().toString().replace(':', '-');
				//System.out.println(timeStamp);
				File tempFile = image.getScreenshotAs(OutputType.FILE);
				//System.out.println(i);
				File destFile=new File("./errorshorts/divMenuImages"+timeStamp+".png");
				FileUtils.copyFile(tempFile, destFile);	
				//i++;
			}
				
			
		}
	}
}