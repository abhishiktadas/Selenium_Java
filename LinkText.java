package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		
		//LinkText
		WebElement e1 = driver.findElement(By.linkText("Mobiles"));
		e1.click();

	}

}
