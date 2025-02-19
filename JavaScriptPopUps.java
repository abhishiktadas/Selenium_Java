package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopUps 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/dasab/Documents/Automation%20Class/grotechminds.html");
		driver.switchTo().alert().accept();
		WebElement e1 = driver.findElement(By.id("1"));
		e1.sendKeys("Abhishikta");
		
	}

}
