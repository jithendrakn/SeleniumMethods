package webElement;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class useageofFunctionalityRadioButton {
public static void main(String[] args) throws MalformedURLException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	URL mainurl=new URL("https://www.facebook.com/");
	URL signuppage=new URL(mainurl, "/signup");
	driver.navigate().to(signuppage);
	WebElement femaleRadioButton = driver.findElement(By.xpath("//label[text()='Female']/..//input[@name='sex']"));
	femaleRadioButton.click();
	if(femaleRadioButton.isSelected()) {
		System.out.println("pass : female radio button is selected");
	}else {
		System.out.println("fail : female radio button not selected");
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
