package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/dasab/Documents/Automation%20Class/grotechminds.html");
		WebElement e1 = driver.findElement(By.id("123"));
		boolean b1 = e1.isSelected();
		if(b1==true)
		{
			System.out.println("Selected");
			
		}
		else
		{
			System.out.println("Not Selected");
			System.out.println("Not Selected, Lets Select it and then verify it");
			e1.click();
			
			boolean b2 = e1.isSelected();
			System.out.println(b2);
			
		}
	}

}
