package handlingTags;

import java.io.File;
import java.io.IOException;
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

public class handlingDivTags {
public static void main(String[] args) throws IOException {
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://www.flipkart.com/");
	List<String> attributeVlue=new ArrayList<>();
	attributeVlue.add("Top Offers");
	attributeVlue.add("Grocery");
	attributeVlue.add("Mobiles");
	attributeVlue.add("Fashion");
	attributeVlue.add("Electronics");
	attributeVlue.add("Home");
	attributeVlue.add("Appliances");
	attributeVlue.add("Travel");
	attributeVlue.add("Beauty, Toys & More");
	//System.out.println("attributeVlue: " + attributeVlue);
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	WebElement parentDivTag = driver.findElement(By.xpath("//div[@class='InyRMC _3Il5oO']/div"));
	List<WebElement> allImagesInParentDivTag = parentDivTag.findElements(By.xpath("//img[@class='_396cs4  _3exPp9']"));
	int countImages = allImagesInParentDivTag.size();
	wait.until(ExpectedConditions.visibilityOfAllElements(allImagesInParentDivTag));
	System.out.println("countImages : " + countImages);
	for (WebElement image : allImagesInParentDivTag) {
		String actualValue = image.getAttribute("alt");
		for(String img:attributeVlue) {
			if(actualValue.equals(img)) {
				String timeStamp = LocalDateTime.now().toString().replace(':', '-');
				File tempFile = image.getScreenshotAs(OutputType.FILE);
				File destFile = new File("./errorshorts/"+img+timeStamp+".png");
				FileUtils.copyFile(tempFile, destFile);
			}
		}
		/*if(image.equals(attributeVlue))	{
			String timeStamp = LocalDateTime.now().toString().replace(':', '-');
			File tempFile = image.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./errorshorts/topaoaffers"+timeStamp+".png");
			FileUtils.copyFile(tempFile, destFile);
		}*/
	}
	driver.manage().window().minimize();
	driver.quit();
  }
}

