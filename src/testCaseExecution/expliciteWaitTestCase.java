package testCaseExecution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class expliciteWaitTestCase {
	static WebDriver driver;
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
	driver.get("https://trello.com/");
	String actualTrelloHomeTittlePage = driver.getTitle();
	String expectedTrelloHomeTittlePage="Manage Your Team’s Projects From Anywhere | Trello";
	WebElement loginOption = driver.findElement(By.linkText("Log in"));
	
	if(wait.until(ExpectedConditions.titleIs(expectedTrelloHomeTittlePage))){
		wait.until(ExpectedConditions.visibilityOf(loginOption));	
		System.out.println("Pass: tittle and login button is displayed.");
	}else {
		System.out.println("Fail: tittle and login button is not displayed.");
	}
	//step: 02 click on login button
	driver.findElement(By.linkText("Log in")).click();
	String loginPageURL = driver.getCurrentUrl();
	System.out.println("loginPageURL : " + loginPageURL);
	String actualLoginPageTittle = driver.getTitle();
	System.out.println("actualLoginPageTittle : " + actualLoginPageTittle);
	String ecpectedLoginPageTittle="Log in to Trello";
	if(wait.until(ExpectedConditions.urlContains("login"))) {
		if(wait.until(ExpectedConditions.titleIs(ecpectedLoginPageTittle))) {
			System.out.println("Pass: login page Tittle and url is displayed and verified.");
		}
	}else {
		System.out.println("Fail: login page Tittle and url is not displayed verified.");
	}
	//step: 03 check invisibility of password and login button
	//post condition 
	WebElement emailTextFieldLoginPage = driver.findElement(By.id("user"));
	WebElement passwordTextFieldLoginPage = driver.findElement(By.id("password"));
	WebElement loginButtonHomePage = driver.findElement(By.cssSelector("input[value='Log in']"));
	if(emailTextFieldLoginPage.isDisplayed() && passwordTextFieldLoginPage.isDisplayed() && loginButtonHomePage.isDisplayed() ) {
		System.out.println("Pass: email password login buttons are displayed and verified");
	}else {
		System.out.println("Fail: email password login buttons are not displayed and verified");
	}
	emailTextFieldLoginPage.sendKeys("peoplefortiptur@gmail.com");
	WebElement loginWithAtlisainButton = driver.findElement(By.cssSelector("input[value='Log in with Atlassian']"));
	if(wait.until(ExpectedConditions.invisibilityOf(passwordTextFieldLoginPage))) {
		if(wait.until(ExpectedConditions.visibilityOf(loginWithAtlisainButton)) != null) {
			System.out.println("Pass: password text field and login button are invisible and login with Atlisian button is visible");
		}
	}else {
		System.out.println("Fail: password text field and login button are visible");
	}
	//step 04 click on login with atlisian button
	loginWithAtlisainButton.submit();
	WebElement loginContinuePage = driver.findElement(By.xpath("//span[text()='Log in']"));
	String actualLoginToContinuePageTittle = driver.getTitle();
	String expectedLoginToContinuePageTittle="Log in to continue - Log in with Atlassian account";
	WebElement passwordTextFieldContinePage = driver.findElement(By.id("password"));
	if(wait.until(ExpectedConditions.visibilityOf(passwordTextFieldContinePage)) != null) {
		if(wait.until(ExpectedConditions.titleIs(expectedLoginToContinuePageTittle))) {
			if(wait.until(ExpectedConditions.visibilityOf(loginContinuePage)) != null) {
				System.out.println("Pass: login Continue page Is Displayed and verified.");
			}
		}
	}else {
		System.out.println("Fail: login Continue page Is not Displayed and verified.");
	}
	//step 06 : enter vaild password
	passwordTextFieldContinePage.sendKeys("9886947924");
	//step 07 click on login button
	loginContinuePage.submit();
	String actualTrelloBoardPage = driver.getTitle();
	String expectedTrelloBoardPage="Boards | Trello";
	String trelloBoardURL = driver.getCurrentUrl();
	
	
	if(wait.until(ExpectedConditions.titleIs(expectedTrelloBoardPage))) {
		if(wait.until(ExpectedConditions.urlContains("boards"))) {
			System.out.println("Pass: Trello Boards home page is displayed.");
		}
	}else {
		System.out.println("Fail: Trello Boards home page is not displayed.");
	}
	driver.manage().window().minimize();
	driver.quit();
}
}
