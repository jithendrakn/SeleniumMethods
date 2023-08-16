package webElement;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class useageofisEnabledMethod {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cowin.gov.in/");
		driver.findElement(By.xpath("//a[text()=' Partners ']")).click();
		Set<String> windowids = driver.getWindowHandles();
		for(String wid:windowids) {
			String windowsurl = driver.switchTo().window(wid).getCurrentUrl();
			System.out.println("windowsurl : "+ windowsurl);
			if(windowsurl.equals("https://www.cowin.gov.in/our-partner")) {
				String tittleofPartnerPage = driver.switchTo().window(wid).getTitle();
				//System.out.println("tittleofPartnerPage : " + tittleofPartnerPage);
				WebElement registerButton = driver.findElement(By.xpath("//a[text()='Register Now']"));
				registerButton.click();
				Set<String> windowsIDS2 = driver.getWindowHandles();
				for(String wids:windowsIDS2) {
					String getTittles = driver.switchTo().window(wids).getTitle();
					//System.out.println("getTittles : "+ getTittles);
					if(getTittles.equals("Sandbox- Request form")) {
						driver.switchTo().window(wids);
						if(driver.findElement(By.xpath("//button[text()='Submit']")).isEnabled()) {
							System.out.println("Fail: submit button is enabled");
						}
						else {
							System.out.println("pass: submit button is not enabled");
						}
					}
				}
		  }
	  }
		driver.manage().window().minimize();
		driver.quit();
	}

}

