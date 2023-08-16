package testCaseExecution;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bharathProgram {
		 static WebDriver driver;
		public static void main(String[] args) throws Throwable {
			//step 01: open the browser
			String browsername = "chrome";
			if (browsername.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
				}
			driver.manage().window().maximize();
			//Step 02: Pass the main URL
			driver.get("https://trello.com/");
			String actulHomePageTitle = driver.getTitle();
			System.out.println("actulHomePageTitle :" + actulHomePageTitle);
			String expectedHomepageTitle = "Manage Your Team’s Projects From Anywhere | Trello";
			System.out.println("expectedHomepageTitle : " + expectedHomepageTitle);
			 WebElement LoginOption = driver.findElement(By.linkText("Log in"));
			 if(actulHomePageTitle.equals(expectedHomepageTitle)&& LoginOption.isDisplayed()) {
				 System.out.println("Pass: trello Homepage is displayed and verified upon it's title and visibity of Login option");
			 }else {
				 System.out.println("Fail: Trello Homepage is not displayed and veified upon it's title and visibility of Login option");
			 }
			//Step 03: click on Login option
			 LoginOption.click();
			 String actualLoginTitle = driver.getTitle();
			 System.out.println("actualLoginTitle: " + actualLoginTitle);
			 String expectedLogintitle = "Log in to Trello";
			 System.out.println("expectedLogintitle : " + expectedLogintitle);
			 String actualloginpagecurrenturl = driver.getCurrentUrl(); 
			if(actualLoginTitle.equals(expectedLogintitle)&& actualloginpagecurrenturl.contains("login")) {
				System.out.println("Pass: Trello Login page is displayed and upon the verifivcation of title and URL");
			}else {
				System.out.println("Fail: Trello Login page is not displayed and the verification of title and URL");
			}
			//Step 04: Enter the Valid Email Address
			//pre condition = Check for visibility: Email Address Text Field, PassWord textField, Login Button
			WebElement Emailadresstextfield = driver.findElement(By.id("user"));
			WebElement Passwordtextfield = driver.findElement(By.id("password"));
			WebElement Loginbutton = driver.findElement(By.id("login"));
			if (Emailadresstextfield.isDisplayed() && Passwordtextfield.isDisplayed() && Loginbutton.isDisplayed())
			{
				System.out.println("pass: In Trello LOgin page Email address textfield , password textfield , login Button is dispalyed");
			}else {
				System.out.println("Fail: In Trello LOgin page Email address textfield , password textfield , login Button is not dispalyed");
			}
			Emailadresstextfield.sendKeys("peoplefortiptur@gmail.com");
			Thread.sleep(5000);
			if(Passwordtextfield.isDisplayed() && Loginbutton.isDisplayed()){
				System.out.println("Fail: In trello Login page after entering email address in email address textfield the password textfield is visible and login button should be display");
			}else {
				System.out.println("pass: In trello Login page after entering email address in email address textfield the password textfield should be invisible and login button should not be display");
						 
			}
			WebElement LoginwithAtlassian = driver.findElement(By.id("login"));
			if(LoginwithAtlassian.isDisplayed())
			{
				System.out.println("Pass: Log in with Atlassian button is displayed");
			}else {
				System.out.println("Fail: LOg in with Atlassian button is not displayed");
			}
			//Step 05: Click on Login with Atlassian Button
			WebElement LoginwithAtlassian1 = driver.findElement(By.id("login"));
			Thread.sleep(5000);
			LoginwithAtlassian1.click();
			String actualAtlassianLoginpageTitle = driver.getTitle();
			System.out.println("actualAtlassianLoginpageTitle:  " + actualAtlassianLoginpageTitle );
			String expectedAtlassianLoginpageTitle = "Log in to continue - Log in with Atlassian account";
			System.out.println("expectedAtlassianLoginpageTitle:  " + expectedAtlassianLoginpageTitle );
			if(actualAtlassianLoginpageTitle.equals(expectedAtlassianLoginpageTitle) ) {
			System.out.println("pass");
			}else {
				System.out.println("Fail:");
			}
				WebElement trellopasswordtextfield = driver.findElement(By.id("password"));
				WebElement trellologinbutton = driver.findElement(By.id("login-submit"));
			 if(trellopasswordtextfield.isEnabled() && trellologinbutton.isDisplayed()) {
				 System.out.println("pass: password textfield enabled and login button displayed");
		}else {
			System.out.println("Fail:password textfield enabled and login button displayed");
		}
			//Step: 06 Enter the Valid Password
			 trellopasswordtextfield.sendKeys("9886947924");
			 //Step: 07 Click on Login Button
			 Thread.sleep(5000);
			 trellologinbutton.submit();
			 Thread.sleep(5000);
			 String actualtrelloLoginTitle = driver.getTitle();
			 System.out.println("actualLoginTitle: " + actualtrelloLoginTitle);
			 String expectedtrelloLogintitle = "Boards | Trello";
			 System.out.println("expectedLogintitle : " + expectedtrelloLogintitle);
			 Thread.sleep(5000);
			 String actualtrellologinpagecurrenturl = driver.getCurrentUrl();
			 System.out.println("actualtrellologinpagecurrenturl : " + actualtrellologinpagecurrenturl);
			 Thread.sleep(5000);
			if(actualtrelloLoginTitle.equals(expectedtrelloLogintitle) && actualtrellologinpagecurrenturl.contains("boards")) {
				System.out.println("Pass: Trello Login page is displayed and upon the verifivcation of title and URL contains");
			}else {
				System.out.println("Fail: Trello Login page is not displayed and the verification of title and URL contains");
			}
		driver.manage().window().minimize();
		driver.quit();		
		}
	}

