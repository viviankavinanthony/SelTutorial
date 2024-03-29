package makeMyTrip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MMTHomePage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\viviankavin.anthony\\eclipse-workspace\\SeleniumFramework\\Drivers\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.goindigo.in/");
		
		//Passenger increment and decrement
		driver.findElement(By.xpath("//*[@id=\'bookFlightTab\']/form/div[5]/div[1]/div[1]")).click();
		Thread.sleep(2000);
		for(int i=1; i<5;i++)
		{
			driver.findElement(By.xpath("//*[@id='bookFlightTab']/form/div[5]/div[1]/div[2]/ul/li[1]/div/button[2]")).click();
			Thread.sleep(1000);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='bookFlightTab']/form/div[5]/div[1]/div[2]/div/button")).click();
		
		//From dropdown
		driver.findElement(By.className("form-control or-src-city parsley-success")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(text(),'Chhatrapati Shivaji')])[1]")).click();
		Thread.sleep(1000);
		
		//To Dropdown
		driver.findElement(By.className("form-control or-dest-city parsley-success")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[contains(text(),'Indira Gandhi')])[3]")).click();
		Thread.sleep(1000);
		
		driver.quit();

	}

}
