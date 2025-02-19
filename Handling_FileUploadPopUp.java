package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_FileUploadPopUp 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.get("https:grotechminds.com/");
//		driver.executeScript("window.scrollBy(0,4500)");
//		WebElement e1 = driver.findElement(By.linkText("Automate me"));
//		e1.click();
	//	driver.get("https://grotechminds.com/automate-me/");
		driver.get("https:grotechminds.com/registration/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.id("fname")).sendKeys("Abhishikta");
		driver.findElement(By.id("lname")).sendKeys("Das");
		driver.findElement(By.name("email")).sendKeys("abhishikta.d2@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Abhishikta");
		driver.findElement(By.name("Present-Address")).sendKeys("Bengaluru");
		driver.findElement(By.name("Permanent-Address")).sendKeys("Kolkata");
		driver.findElement(By.name("Pincode")).sendKeys("560037");
		WebElement e2 = driver.findElement(By.id("Skills"));
		Select s1= new Select(e2);
		s1.selectByIndex(1);
		
		WebElement e3 = driver.findElement(By.id("Country"));
		Select s2= new Select(e3);
		s2.selectByIndex(3);
		
		WebElement e4 = driver.findElement(By.id("Relegion"));
		Select s3= new Select(e4);
		s3.selectByIndex(4);
		
		WebElement fileupload = driver.findElement(By.name("file"));
		fileupload.sendKeys("C:\\Users\\dasab\\Documents\\Automation Class\\Java_Interview.pdf");

	}

}
