package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class useageofisSelected {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement checkBox = driver.findElement(By.id("keepLoggedInCheckBox"));
		if(checkBox.isSelected()) {
			System.out.println("Fail : checkbox is selected brofere clicking on checkbox.");
		}
		else {
			System.out.println("Pass : checkbox is not selected befeore clicking on checkbox.");
		}
		WebElement checkboxselected = driver.findElement(By.id("keepLoggedInCheckBox"));
		checkboxselected.click();
		if(checkboxselected.isSelected()) {
			System.out.println("Pass: checkbox is selected after click on checkbox");
		}else {
			System.out.println("Fail: checkbox is not selected after selecting on checkbox");
		}
		driver.manage().window().maximize();
		driver.quit();

	}

}
