package testCaseExecution;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class trelloWebApplication {
	static WebDriver driver;
public static void main(String[] args) throws Throwable {
	String BrowserName = "chrome";
	//step 01: open the chrome browser
	if(BrowserName.equals("chrome")) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver=new ChromeDriver();
	}
	//step 02: pass the main URL
	//Pre condition maximize the condition
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://trello.com/");
	String expectedTittleOfMainUrl="Manage Your Team’s Projects From Anywhere | Trello";
	String actualTittleOfMainUrl = driver.getTitle();
	System.out.println("actualTittleOfMainUrl : " + actualTittleOfMainUrl);
	WebElement homeloginOption = driver.findElement(By.linkText("Log in"));
	if(actualTittleOfMainUrl.equals(expectedTittleOfMainUrl) && homeloginOption.isDisplayed()) {
		System.out.println("Pass: Trello Home page is displayed verified upon tittle and LoginOption.");
	}else {
		System.out.println("Fail: Trello Home page is not displayed upon verification tittle and LoginOption.");
	}
	//step 03: Trello LoginOption page
	homeloginOption.click();
	String actualLoginOptionURL = driver.getCurrentUrl();
	String actualTittleOfLoginOption = driver.getTitle();
	String expectedTittleOfLoginOption="Log in to Trello";
	if(actualLoginOptionURL.contains("login") && actualTittleOfLoginOption.equals(expectedTittleOfLoginOption)) {
		System.out.println("Pass: Trello LoginPage is displayed and verified upon Tittle and URL");
	}else {
		System.out.println("Fail: Trello LoginPage is not displayed and verification upon Tittle and URL");
	}
	//step 04: Enter valid email address
	//precondition checking visibility of user name password text and login button
	WebElement loginpageUserNameTextField = driver.findElement(By.id("user"));
	WebElement loginpagePasswordTextField = driver.findElement(By.id("password"));
	WebElement loginpageLoginButton = driver.findElement(By.id("login"));
	if(loginpageUserNameTextField.isDisplayed() && loginpagePasswordTextField.isDisplayed() && loginpageLoginButton.isDisplayed()) {
		System.out.println("Pass: user name password text and login button");
	}else {
		System.out.println("Fail: user name password text and login button is not displayed");
	}
	loginpageUserNameTextField.sendKeys("peoplefortiptur@gmail.com");
	if(loginpagePasswordTextField.isDisplayed() && loginpageLoginButton.isDisplayed()) {
		System.out.println("Fail: name password text and login button is displayed.");
	}else {
		System.out.println("Pass: user name password text and login button is not displayed");
	}
	WebElement loginWithAtlasinButton = driver.findElement(By.id("login"));
	if(loginWithAtlasinButton.isDisplayed()) {
		System.out.println("Pass: login with Atlasian Button is displayed.");
	}else {
		System.out.println("Fail: login with Atlasian Button is not displayed.");
	}
	loginWithAtlasinButton.click();
	String actualTittleOfCountinuePage = driver.getTitle();
	String expectedTittleOfCountinuePage="Log in to continue - Log in with Atlassian account";
	WebElement passwordTextFieldContinuePageLoginButton = driver.findElement(By.id("password"));
	WebElement loginButtonContinuePage = driver.findElement(By.id("login-submit"));
	if(actualTittleOfCountinuePage.equals(expectedTittleOfCountinuePage) && passwordTextFieldContinuePageLoginButton.isDisplayed() && loginButtonContinuePage.isDisplayed()) {
		System.out.println("Pass: Tittle PasswordText and Login button is displayed and verified visibility.");
	}else {
		System.out.println("Fail: Tittle PasswordText and Login button is not displayed and verified No visibility.");
	}
	//step 05: Pass the Valid Password
	driver.findElement(By.id("password")).sendKeys("9886947924");
	//step 06: click on the login button
	loginButtonContinuePage.click();
	//verifying the visibility of trelo homepage
	String actualTittleOfHomePage = driver.getTitle();
	System.out.println("actualTittleOfHomePage : " + actualTittleOfHomePage);
	String expectedTittleOfHomePage="Boards | Trello";
	String actualURLofHomePage = driver.getCurrentUrl();
	if(actualTittleOfHomePage.equals(expectedTittleOfHomePage) ) {
		if(actualURLofHomePage.contains("boards")) {
		System.out.println("Pass: Trello home page is displayed and upon the verification of Tittle and URL.");
		}
	}else {
		System.out.println("Fail: Trello home page is not displayed and upon the verification of Tittle and URL.");	
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
