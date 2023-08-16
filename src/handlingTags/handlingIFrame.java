package handlingTags;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class handlingIFrame {
public static void main(String[] args) throws MalformedURLException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("http://www.leafground.com/");
//	driver.navigate().to("pages/frame");
	driver.findElement(By.cssSelector("img[alt='Frame']")).click();
	List<WebElement> totalIframeElements = driver.findElements(By.tagName("iframe"));
	List<String> allFrames=new ArrayList<>();
	//System.out.println("totalIframeElements : " + totalIframeElements.size());
	int count=0;
	for(WebElement element:totalIframeElements) {
		String frameElementValue = element.getAttribute("src");
		allFrames.add(frameElementValue);
		//System.out.println("frameElementValue : " + frameElementValue);
		count++;
		if(count>1) {
			driver.switchTo().frame(element);
			WebElement totalFrames = driver.findElement(By.tagName("iframe"));
			String nestedFrame = totalFrames.getAttribute("src");
			allFrames.add(nestedFrame);
			//System.out.println("nestedFrame : " + nestedFrame);
			driver.switchTo().defaultContent();
		}
	}
	System.out.println("allFrames : " + allFrames);
	System.out.println(allFrames.size());
	driver.manage().window().minimize();
	driver.quit();
}
}
