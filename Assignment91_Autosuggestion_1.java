package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment91_Autosuggestion_1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.name("q"));
		e1.sendKeys("Bangalore Weather");
		Thread.sleep(3000);
		List<WebElement> e2 = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		e2.get(e2.size() -10).click();
	}
}
