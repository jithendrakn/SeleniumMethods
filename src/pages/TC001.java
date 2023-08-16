package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class TC001 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/");
		
		loginPage lp=new loginPage();
		PageFactory.initElements(driver, lp);
		lp.getUsernameTextField().sendKeys("admin");
		lp.getPasswordField().sendKeys("manager");
		lp.getLoginButton().click();
		
		homePage hp=new homePage();
		PageFactory.initElements(driver, hp);
		hp.getUserModule().click();
		hp.getLogoutLink().click();
		

	}

}
