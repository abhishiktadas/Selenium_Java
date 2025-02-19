package selenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchQuit 
{
	@BeforeMethod
	public void launch()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
	}
	@AfterMethod
	public void quit()
	{
		Thread.sleep(3000);
		driver.quit();
	}
}
