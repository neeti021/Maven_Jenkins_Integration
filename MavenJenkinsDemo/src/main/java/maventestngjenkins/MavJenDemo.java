package maventestngjenkins;


//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;


public class MavJenDemo {
	

		WebDriver driver;
		@BeforeMethod
		
		public void setbrowser()
		
		{
			System.setProperty("webdriver.chrome.driver", "C:\\selenium_software\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.get("https://www.google.com/");
		    driver.manage().window().maximize();
		}
		
		
		@AfterMethod
		public void closebrowser()
		{
			driver.close();
			
		}
		

}
