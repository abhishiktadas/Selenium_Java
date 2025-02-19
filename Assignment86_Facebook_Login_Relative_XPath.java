package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment86_Facebook_Login_Relative_XPath {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		//user name and password
		WebElement e1 = driver.findElement(By.xpath("(//input)[3]"));
		e1.sendKeys("abhigdcvbcvb@gmail.com");
		WebElement e2 = driver.findElement(By.xpath("(//input)[4]"));
		e2.sendKeys("hghghjfhjvvh897878");
		
		WebElement e3 = driver.findElement(By.xpath("(//button)"));
		e3.click();
		

	}

}
