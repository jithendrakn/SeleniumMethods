package testCaseExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class toFindTextBold {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	WebElement admistatorText = driver.findElement(By.xpath("//td[text()='Administrator:']"));
	Integer expectedFontSize = 700;
	String adminstatorFontSize = admistatorText.getCssValue("font-weight");
	Thread.sleep(3000);
	System.out.println("adminstatorFontSize : " + adminstatorFontSize);
	Thread.sleep(3000);
	if(adminstatorFontSize.equals(expectedFontSize)) {
		System.out.println("The Text is bold");
	}else {
		System.out.println("the text is not Bold");
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
