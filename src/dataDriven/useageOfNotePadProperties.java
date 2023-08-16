package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class useageOfNotePadProperties {
	static WebDriver driver;
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("./propertiesSourceFile/testData.properties");
	Properties pobj=new Properties();
	pobj.load(fis);
	String value = pobj.getProperty("browser");
	System.out.println("value : " + value);
	if(value.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pobj.getProperty("url"));
	}else if (value.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(pobj.getProperty("url"));
		driver.findElement(By.id("email")).sendKeys(pobj.getProperty("username"));
	}
	//driver.manage().window().minimize();
	//sdriver.quit();
}
}
