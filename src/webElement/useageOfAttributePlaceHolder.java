package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class useageOfAttributePlaceHolder {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement usernameTextField = driver.findElement(By.id("email"));
		System.out.println("usernameTextField : " + usernameTextField);
		String usernamePlaceHolder = usernameTextField.getAttribute("placeholder");
		System.out.println("usernamePlaceHolder : " + usernamePlaceHolder);
		driver.manage().window().minimize();
		driver.quit();	
	}

}
