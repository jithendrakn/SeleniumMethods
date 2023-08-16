package findElements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class irctcTable {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	driver.get("https://irctc.com/contact.html");
	WebElement irctcDropDown = driver.findElement(By.xpath("//a[@aria-controls=\"collapse-9\"]/i"));
	//irctcDropDown.sendKeys(Keys.PAGE_DOWN);
	irctcDropDown.click();
	WebElement table = driver.findElement(By.xpath("//div[@id='collapse-9']//table[@class='responsive-table']"));
	List<WebElement> tableElements = table.findElements(By.xpath("//tbody/tr"));
	for(WebElement tr:tableElements) {
		//System.out.println(tr.getText());
	}
}
}
