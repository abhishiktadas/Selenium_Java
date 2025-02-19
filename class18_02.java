package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class18_02 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int count = links.size();
		System.out.println(count);
		for(int i = 0; i<count; i++)
		{
			WebElement link0=links.get(i);
			String message = link0.getText();
			String message1 = link0.getAttribute("href");
			System.out.println(message);
			System.out.println(message1);
		}

	}

}
