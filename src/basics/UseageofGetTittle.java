package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseageofGetTittle {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.xpath("//button[text()='    click   ']")).click();
		
		Set<String> webpagetittles = driver.getWindowHandles();
		for(String wid:webpagetittles) 
		{
		//System.out.println(webpagetittle);
		
		driver.switchTo().window(wid);
		String tittleone = driver.getTitle();
		if(tittleone.equals("Selenium"))
		{
			driver.findElement(By.xpath("//span[text()='Search']"));
			System.out.println(tittleone);
			Thread.sleep(5000);
		}
		String tittletwo = driver.switchTo().window(wid).getTitle();
		if(tittletwo.equals("Frames & windows"))
		{
		driver.findElement(By.xpath("//a[text()='WebTable']")).click();	
		System.out.println(tittletwo);
		Thread.sleep(5000);
		}
		}
		driver.quit();
		}
			
		}
		
	


