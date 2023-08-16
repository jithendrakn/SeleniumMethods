package selectClassPackage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class optionsMethodUsagge {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	
	driver.get("https://www.facebook.com/signup");
	
	Select selectday=new Select(driver.findElement(By.id("day")));
	Select selectmonth=new Select(driver.findElement(By.id("month")));
	Select selectyear=new Select(driver.findElement(By.id("year")));
	
	List<String> expectedMonth=new ArrayList<>();
	expectedMonth.add("Jan");
	expectedMonth.add("Feb");
	expectedMonth.add("Mar");
	expectedMonth.add("Apr");
	expectedMonth.add("May");
	expectedMonth.add("Jun");
	expectedMonth.add("Jul");
	expectedMonth.add("Aug");
	expectedMonth.add("Sep");
	expectedMonth.add("Oct");
	expectedMonth.add("Nov");
	expectedMonth.add("Dec");
	
	System.out.println("expectedMonth : " + expectedMonth);
	
	List<WebElement> totalMonths = selectmonth.getOptions();

	//System.out.println("totalMonths : " + totalMonths);
	
	for(WebElement month:totalMonths) {
		System.out.println(month.getText());
		if(month.equals(expectedMonth)) {
			System.out.println("PASS::");
		}
	}
	
	/*List<WebElement> totalDays = selectday.getOptions();
	
	for(WebElement day:totalDays) {
		System.out.println(day.getText());
	}*/
}
}
