package testCaseExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class getcolourFrontSize {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	//create New Account Button xpath
	WebElement createnewAccountButton = driver.findElement(By.cssSelector("a[data-testid=open-registration-form-button]"));
	//create new account get button get color
	String colorOfCreatenewaccountButton = createnewAccountButton.getCssValue("color");
	System.out.println("colorOfCreatenewaccountButton : " + colorOfCreatenewaccountButton);
	//coverting rgba into hexacode formate
	String hexaCode = Color.fromString(colorOfCreatenewaccountButton).asHex();
	System.out.println("hexaCode: " + hexaCode);
	//create new button text get font_weight 
	String boldofCreatenewaccountButton = createnewAccountButton.getCssValue("font-weight");
	System.out.println("boldofCreatenewaccountButton : "+ boldofCreatenewaccountButton);
	//check the create new account text is SemiBold or Not
	if(createnewAccountButton.getCssValue("font-weight").equals(600)) {
		System.out.println("The Create New Account Text Is SemiBold.");
	}else {
		System.out.println("The Create New Account Text Is not SemiBold.");
	}
	//forgotpassword text get color
	WebElement forgotPasswordLinkText = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
	String colorofForgotPassworText = forgotPasswordLinkText.getCssValue("color");
	System.out.println("colorofForgotPassworText : " + colorofForgotPassworText);
	//coverting rgba into hexacode format
	String hexacodeofForgotPassword = Color.fromString(colorofForgotPassworText).asHex();
	System.out.println("hexacodeofForgotPassword: " + hexacodeofForgotPassword);
	//to check the Facebook helps you connect and share with the people in your life. size is 400 or not.
	WebElement faceebokHeadText = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
	String sizeOfHeadText = faceebokHeadText.getCssValue("font-weight");
	//System.out.println("sizeOfHeadText : " + sizeOfHeadText);
	if(faceebokHeadText.getCssValue("font-weight").equals(sizeOfHeadText)) {
		System.out.println(" Facebook helps you connect and share with the people in your life size is 400");
	}else {
		System.out.println(" Facebook helps you connect and share with the people in your life size is not 400");
	}
	driver.manage().window().minimize();
	driver.quit();
	}
}
