package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment97_HandleJavaScriptPopUp 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/javascript-popup/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[2]/div/div[2]/div/div/button")).click();
		

	}

}
