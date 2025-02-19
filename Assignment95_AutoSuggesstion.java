package selenium;
//import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;

public class Assignment95_AutoSuggesstion 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.apollo247.com/");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.xpath("//*[@id=\"fixedHeaderCT\"]/div/div[2]/div[1]/ul/li[1]/a"));
		e1.click();
		WebElement e2 = driver.findElement(By.xpath("//*[@id=\"mainContainerCT\"]/div[1]/div/div/div/div"));
		e2.click();
		WebElement e3 = driver.findElement(By.id("searchProduct"));
		e3.sendKeys("Paracetamol");
		e3.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[1]/div[1]/div/div/a/div/div[2]/div[1]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div[1]/div[1]/div/div/div/button")).click();
		
		
	}

}
