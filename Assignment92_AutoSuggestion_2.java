package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class Assignment92_AutoSuggestion_2 
{
		public static void main(String[] args) throws InterruptedException 
		{
			EdgeDriver driver = new EdgeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			WebElement e1 = driver.findElement(By.id("twotabsearchtextbox"));
			e1.sendKeys("purse");
			Thread.sleep(3000);
			List<WebElement> e2 = driver.findElements(By.xpath("//div[@class= 'left-pane-results-container']/div"));
			e2.get(2).click();
		}
}
