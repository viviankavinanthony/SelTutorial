package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class TestNG_Demo {

	WebDriver driver = null;

	@BeforeTest
	public void setUpTest()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\viviankavin.anthony\\eclipse-workspace\\SeleniumFramework\\Drivers\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test	
	public void googleSearch() {

		driver.get("https://google.com/");
		driver.findElement(By.xpath("//*[@id=\'tsf\']/div[2]/div/div[1]/div/div[1]/input")).sendKeys("hello");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@AfterTest
	public void tearDownTest()
	{
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");
	}

}
