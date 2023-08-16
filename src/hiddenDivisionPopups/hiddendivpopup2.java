package hiddenDivisionPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// program to select specific Date
public class hiddendivpopup2 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://www.cleartrip.com/");
	
	driver.findElement(By.cssSelector("svg[class=' c-pointer c-neutral-900']")).click();
	driver.findElement(By.xpath("//h4[text()='Depart on']/../../..//div[contains(@class,'fs-2 c-inherit')]")).click();
	driver.findElement(By.xpath("//div[text()='August 2022']/../..//div[text()='15']")).click();

}
}
