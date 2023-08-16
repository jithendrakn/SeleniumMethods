package hiddenDivisionPopups;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class hiddenpopup3 {
public static void main(String[] args)  {
	LocalDate ltd = LocalDate.now().plusDays(2);
	
	int day = ltd.getDayOfMonth();
	String month = ltd.getMonth().name();
	int year = ltd.getYear();
	
	month=month.substring(0, 1).toUpperCase() + month.substring(1).toLowerCase();

	System.out.println("day : " + day);
	System.out.println("month  " + month);
	System.out.println("year : " + year);
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	
	driver.get("https://www.cleartrip.com/");
	
	//WebElement abc = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("svg[class=' c-pointer c-neutral-900']"))));
	driver.findElement(By.cssSelector("svg[class=' c-pointer c-neutral-900']")).click();
	//abc.click();
	driver.findElement(By.xpath("//h4[text()='Depart on']/../../..//div[contains(@class,'fs-2 c-inherit')]")).click();
	
	driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//div[text()='"+day+"']")).click();
    //System.out.println("presentDate : " + presentDate);
	
	driver.manage().window().minimize();
	driver.quit();
	
}
}
