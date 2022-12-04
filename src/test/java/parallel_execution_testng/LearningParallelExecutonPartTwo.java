package parallel_execution_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningParallelExecutonPartTwo {
	
	 
		public static WebDriver driver;
		
		@Test(threadPoolSize=2, invocationCount = 2)
		public void workingWithChromeTwo() {

			System.out.println("To check the thread:- "+ Thread.currentThread().getId());
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get("https://costco.com");
			System.out.println("This is the page of " + driver.getTitle());
			driver.quit();
			
		}
		
		@Test
		public void workingWithFirefoxTwo() {

			System.out.println("To check the thread:- "+ Thread.currentThread().getId());
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get("https://target.com");
			System.out.println("This is the page of " + driver.getTitle());
			driver.quit();
		}
		
		@Test
		public void workingWithEdgeTwo() {

			System.out.println("To check the thread:- "+ Thread.currentThread().getId());
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.get("https://bbc.com");
			System.out.println("This is the page of " + driver.getTitle());
			driver.quit();
		}

}
