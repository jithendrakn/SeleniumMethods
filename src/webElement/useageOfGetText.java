package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class useageOfGetText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String exceptedTagText = "Facebook helps you connect and share with the people in your life.";
		System.out.println("exceptedTagText : "+ exceptedTagText);
		WebElement headwerTextField = driver.findElement(By.className("_8eso"));
		String actualtagText = headwerTextField.getText();
		System.out.println("actualtagText : " + actualtagText);
		if(actualtagText.equals(exceptedTagText))
		{
			System.out.println("pass: expected and actual tagtext are same.");
		}
		else {
			System.out.println("fail: expected and actual are not same");
		}
		driver.manage().window().minimize();
		driver.quit();
	}

}
