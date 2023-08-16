package basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class useageofWebhandles {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String parentwindow = driver.getWindowHandle();
		
		System.out.println("parentwindow : "+ parentwindow);
		
		WebElement openMultipleWindow = driver.findElement(By.id("newWindowBtn"));
		openMultipleWindow.click();
		
		Set<String> multiplewindowhandles = driver.getWindowHandles();
		
		
		for(String o:multiplewindowhandles)
		{
		//System.out.println(o);
		if(!multiplewindowhandles.equals(parentwindow)) {
			
			String childWindowtittle = driver.switchTo().window(o).getTitle();
			
			Thread.sleep(5000);
			
			System.out.println(childWindowtittle);
			//driver.findElement(By.id("firstName")).sendKeys("ramu");
			
			driver.close();
			
		}
		/*driver.switchTo().window(parentwindow);
		WebElement newtabwindow = driver.findElement(By.xpath("//h1[@itemprop='name']"));
		System.out.println(newtabwindow);
		//String newtabtittle = driver.getTitle();
      //  System.out.println("newtabtittle : "+ newtabtittle);*/
		
	}
		driver.quit();

}
}
