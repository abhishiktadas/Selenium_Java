package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment96_Brokenlink {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int count = links.size();
		System.out.println(count);
		for(int i = 0; i<count; i++)
		{
			WebElement link0=links.get(i);
			String message = link0.getText();
			String link = link0.getAttribute("href");
			System.out.println(message);
			System.out.println(link);
		}

	}
	static void verifylink(String link)throws IOException
	{
		URL u1 = new URL(link);
		HttpURLConnection u2 = (HttpURLConnection) u1.openConnection();
		
			if( u2.getResponseCode()==200)
			{
				System.out.println("Valid");
				System.out.println("The Response message is : - " + u2.getResponseMessage());
			}
			else
			{
				System.out.println("InValid");
				System.out.println("The Response message is : - " + u2.getResponseMessage());
			}
	}

}
