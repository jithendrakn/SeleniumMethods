package selectClassPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class usageOfSelectClassMethods {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	
	driver.get("https://www.facebook.com/signup");
	
	Select selectday=new Select(driver.findElement(By.id("day")));
	Select selectmonth=new Select(driver.findElement(By.id("month")));
	Select selectyear=new Select(driver.findElement(By.id("year")));
	
	String day="17";
	String month="May";
	String year="1998";
	
	selectday.selectByIndex(16);
	selectmonth.selectByVisibleText(month);
	selectyear.selectByValue(year);
	
	String actualday = selectday.getFirstSelectedOption().getText();
	System.out.println("actualday : " + actualday);
	System.out.println("expectedday : " + day);
	if(actualday.equals(day)) {
		System.out.println("PASS:: selected day is correct");
	}else {
		System.out.println("FAIL:: selected day is incorrect");
	}
	
	
	
	
	
}
}
