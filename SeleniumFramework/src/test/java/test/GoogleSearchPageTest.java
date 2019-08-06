package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GoogleSearchTest();
		
	}
	
	public static void GoogleSearchTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\viviankavin.anthony\\eclipse-workspace\\SeleniumFramework\\Drivers\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		GoogleSearchPageObjects searchObj = new GoogleSearchPageObjects(driver);
		
		driver.get("https://www.google.com/");
		
		searchObj.setTextInSearchBox("Hello");
		searchObj.clickEnter();
		
		driver.close();
		
	}

}
