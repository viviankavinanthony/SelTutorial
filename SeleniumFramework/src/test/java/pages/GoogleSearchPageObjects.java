package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {
	
	WebDriver driver = null;
	
	public GoogleSearchPageObjects(WebDriver driver)
	{
		
		this.driver = driver;
	}
	
	public void setTextInSearchBox(String text)
	{
		driver.findElement(By.xpath("//*[@id=\'tsf\']/div[2]/div/div[1]/div/div[1]/input")).sendKeys(text);
	}
	
	public void clickEnter()
	{
		driver.findElement(By.xpath("//*[@id=\'tsf\']/div[2]/div/div[3]/center/input[1]")).click();
	}

}
