package webElement;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class useageOfisEnabledForEnable {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.cowin.gov.in/");
	driver.findElement(By.xpath("//a[text()=' Partners ']")).click();
	Set<String> windowIds = driver.getWindowHandles();
	for(String wid:windowIds) {
		//System.out.println("window ids: " + wid);
		String urlofwindows = driver.switchTo().window(wid).getCurrentUrl();
		System.out.println("urlofwindows : "+ urlofwindows);
		if(urlofwindows.equals("https://www.cowin.gov.in/our-partner")) {
			String tittlePages = driver.switchTo().window(wid).getTitle();
			WebElement registerButton = driver.findElement(By.xpath("//a[text()='Register Now']"));
			registerButton.click();
			Set<String> windowsidall = driver.getWindowHandles();
			for(String wids:windowsidall) {
				String allWindowTittles = driver.switchTo().window(wids).getCurrentUrl();
				System.out.println("allWindowTittles :" + allWindowTittles);
				if(allWindowTittles.equals("Sandbox- Request form")) {
					String getTittleChild = driver.switchTo().window(wids).getTitle();
					System.out.println("getTittleChild : " + getTittleChild);
					Thread.sleep(5000);
					WebElement accepttermsofServicesButton = driver.findElement(By.xpath("//button[text()='Accept Terms of Service']"));
					accepttermsofServicesButton.click();
					driver.findElement(By.id("confbtn")).click();
					if(driver.findElement(By.xpath("//button[text()='Submit']")).isEnabled()) {
						System.out.println("pass: check box is selected after clicking.");
					}else {
						System.out.println("Fail: check box is not selected afetr clicking.");
					}
				}
			}
		}
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
