package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class useageOfPlaceHolder {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		WebElement usernameTextField = driver.findElement(By.xpath("//div[text()='Login']"));
		usernameTextField.click();
		WebElement eidUsername = driver.findElement(By.xpath("//label[text()='Email ID / Username']/..//input[@class='err-border' and @type='text']"));
		String placeholderValue = eidUsername.getAttribute("placeholder");
		System.out.println("placeholderValue : "+ placeholderValue);
		driver.manage().window().minimize();
		driver.quit();
	}

}
