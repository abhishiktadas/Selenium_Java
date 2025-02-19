package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled_and_isDisplayed 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/dasab/Documents/Automation%20Class/grotechminds.html");
		WebElement e1 = driver.findElement(By.name("fname"));
		boolean b1 = e1.isEnabled();
		if(b1==true)
		{
			System.out.println("Enabled");
			
		}
		else
		{
			System.out.println("Disabled");
		}
		
		WebElement e2 = driver.findElement(By.name("lname"));
		boolean b2 = e2.isEnabled();
		if(b2==true)
		{
			System.out.println("Enabled");
			
		}
		else
		{
			System.out.println("Disabled");
		}
		
		
		
		
//		ChromeDriver driver = new ChromeDriver();
//		driver.get("file:///C:/Users/dasab/Documents/Automation%20Class/grotechminds.html");
//		driver.manage().window().maximize();
//		
//		
//		WebElement e1 = driver.findElement(By.name("fname"));
//		boolean b1 = e1.isEnabled();
//		boolean b11 = e1.isDisplayed();
//		
//		if(b1 == true && b11 == true)
//		{
//			System.out.println("Element is enabled");
//		}
//		else
//		{
//			System.out.println("Element is not enabled");
//		}
//		
//		
//		WebElement e2 = driver.findElement(By.name("lname"));
//		boolean b2 = e2.isEnabled();
//		boolean b12 = e2.isDisplayed();
//		
//		if(b2 == true && b12 == true)
//		{
//			System.out.println("Element is enabled");
//		}
//		else
//		{
//			System.out.println("Element is not enabled");
//		}
	}
}
