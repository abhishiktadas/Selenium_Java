package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment94_AutoSuggestion 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		
		WebElement searchBar = driver.findElement(By.name("search_query"));
        searchBar.sendKeys("India");
		
		Thread.sleep(3000);
		List<WebElement> e2 = driver.findElements(By.xpath("//*[@id=\"i0\"]"));
		e2.get(0).click();

	}

}
