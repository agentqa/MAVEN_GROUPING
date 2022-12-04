package parallel_execution_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningParallelExecutionPartOne {
	 
	public static WebDriver driver;
	
	@Test
	public void workingWithChrome() {
//		System.out.println("To check the thread:- "+ Thread.currentThread().getName());
		System.out.println("To check the thread:- "+ Thread.currentThread().getId());
//		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		driver.quit();
		
	}
	
	@Test
	public void workingWithFirefox() {
//		System.out.println("To check the thread:- "+ Thread.currentThread().getName());
		System.out.println("To check the thread:- "+ Thread.currentThread().getId());
//		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
		driver.quit();
	}
	
	@Test
	public void workingWithEdge() {
//		System.out.println("To check the thread:- "+ Thread.currentThread().getName());
		System.out.println("To check the thread:- "+ Thread.currentThread().getId());
//		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://walmart.com");
		driver.quit();
	}

}
