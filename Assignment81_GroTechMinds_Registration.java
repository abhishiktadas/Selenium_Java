package selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;


public class Assignment81_GroTechMinds_Registration 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/");
//		driver.executeScript("window.scrollBy(0,4500)");
//		WebElement e1 = driver.findElement(By.linkText("Automate me"));
//		e1.click();
		driver.get("https://grotechminds.com/automate-me/");
		driver.get("https://grotechminds.com/registration/");
		driver.findElement(By.id("fname")).sendKeys("Abhishikta");
		driver.findElement(By.id("lname")).sendKeys("Das");
		driver.findElement(By.name("email")).sendKeys("abhishikta.d2@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Abhishikta");
		driver.findElement(By.name("Present-Address")).sendKeys("Bengaluru");
		driver.findElement(By.name("Permanent-Address")).sendKeys("Kolkata");
		driver.findElement(By.name("Pincode")).sendKeys("560037");
		WebElement e1 = driver.findElement(By.id("Skills"));
		Select s1= new Select(e1);
		s1.selectByIndex(1);
		
		WebElement e2 = driver.findElement(By.id("Country"));
		Select s2= new Select(e2);
		s2.selectByIndex(3);
		
		WebElement e3 = driver.findElement(By.id("Religion"));
		Select s3= new Select(e3);
		s3.selectByIndex(4);
		
		
		

	}

}
