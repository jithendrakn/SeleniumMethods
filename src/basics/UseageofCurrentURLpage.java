package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class UseageofCurrentURLpage {
	public static void main(String[] args) throws Throwable {
		//set the driver executable path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//Instantiate the driver specific class
		ChromeDriver driver = new ChromeDriver();
		//pass the URL -main URL
		 driver.get("https://www.dassault-aviation.com/en/");
		 //maximize the web application window
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 Object expectedUrlwebaplication ="https://www.dassault-aviation.com/en/group/";
		System.out.println("expectedUrlwebaplication = "+ expectedUrlwebaplication);
		//get the Actual URL
		String actualUrlwebaplication = driver.getCurrentUrl();
	    System.out.println("actualUrlwebaplication = "+ actualUrlwebaplication);
	    if(actualUrlwebaplication.equals(expectedUrlwebaplication))
	    {
	    	System.out.println("pass : is corect url we expecting");
	    }
	    else {
	    	System.out.println("fail : is incorect url we are getting");
	    }
	    //post condition and terminate the session
	    driver.quit();
	}
}

