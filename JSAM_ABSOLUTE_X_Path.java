package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAM_ABSOLUTE_X_Path {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/dasab/Documents/Automation%20Class/grotechminds.html");
		WebElement e1 = driver.findElement(By.xpath("(/html/body/input)[1]"));
		e1.sendKeys("abhi123");
		WebElement e2 = driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]"));
		e2.click();
		
	}

}
