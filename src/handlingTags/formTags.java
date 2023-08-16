package handlingTags;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class formTags {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://irctc.com/contact.html");
	WebElement IRCTC = driver.findElement(By.cssSelector("a[aria-controls='collapse-9']"));
	IRCTC.click();
	//parentTable.findElements(By.tagName(null))
	WebElement parentTable = driver.findElement(By.cssSelector("table[class='responsive-table']"));
	List<WebElement> totalTRtags = parentTable.findElements(By.tagName("tr"));
	System.out.println("totalTRtags : " + totalTRtags.size());
	List<WebElement> totalTHtags = parentTable.findElements(By.tagName("th"));
	System.out.println("totalTHtags : " + totalTHtags.size());
	List<WebElement> totalTDtags = parentTable.findElements(By.tagName("td"));
	System.out.println("totalTDtags : " + totalTDtags.size());
	WebElement buddhistTrainPhoneNumber = parentTable.findElement(By.xpath("//td[text()='+91 9717648718']"));
	
	String expectedBuddhistTrainPhoneNumber="+91 9717648718";
	String actualBuddhistTrainPhoneNumber = buddhistTrainPhoneNumber.getText();
	System.out.println("expectedBuddhistTrainPhoneNumber : " + expectedBuddhistTrainPhoneNumber);
	System.out.println("actualBuddhistTrainPhoneNumber : " + actualBuddhistTrainPhoneNumber);
	
	try {
	wait.until(ExpectedConditions.visibilityOf(buddhistTrainPhoneNumber));
	System.out.println("PASS:: CORRECT");
	}
	catch(TimeoutException e) {
		System.out.println("FAIL:: INCORRECT");
	}
	
}
}
