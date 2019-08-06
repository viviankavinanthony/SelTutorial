package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;

public class GoogleSearchTest {
	
	private static WebDriver driver = null;
			
	public static void main(String[] args) {
		googleSearch();
	}
	
	private static void googleSearch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\viviankavin.anthony\\eclipse-workspace\\SeleniumFramework\\Drivers\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		
		//driver.findElement(By.xpath("//*[@id=\'tsf\']/div[2]/div/div[1]/div/div[1]/input")).sendKeys("hello");
		GoogleSearchPage.textbox_search(driver).sendKeys("hello");
		
		
		//driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")).click();
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();

	}

}
