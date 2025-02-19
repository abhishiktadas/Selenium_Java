package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment85_Absolute_XPath {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/dasab/Documents/Automation%20Class/grotechminds.html");
		
		//text_box
		WebElement e1 = driver.findElement(By.xpath("(/html/body/input)[1]"));
		e1.sendKeys("abhi123");
		WebElement e2 = driver.findElement(By.xpath("(/html/body/input)[2]"));
		e2.sendKeys("abhi");
		WebElement e3 = driver.findElement(By.xpath("(/html/body/input)[3]"));
		e3.sendKeys("Avggj@123");
		WebElement e4 = driver.findElement(By.xpath("((/html/body/form)[1]/input)[1]"));
		e4.sendKeys("Abhishikta");
		//check_box
		WebElement e5 = driver.findElement(By.xpath("((/html/body/form)[2]/input)[1]"));
		e5.click();
		WebElement e6 = driver.findElement(By.xpath("((/html/body/form)[2]/input)[2]"));
		e6.click();
		WebElement e7 = driver.findElement(By.xpath("((/html/body/form)[2]/input)[3]"));
		e7.click();
		
		
		//radio_button
		WebElement e8 = driver.findElement(By.xpath("(/html/body/input)[4]"));
		e8.click();
		WebElement e9 = driver.findElement(By.xpath("(/html/body/input)[5]"));
		e9.click();
		
		//check_box
		WebElement e10 = driver.findElement(By.xpath("(/html/body/input)[6]"));
		e10.click();
		
		//drop_down
		WebElement e11 = driver.findElement(By.xpath("(/html/body/select/option)[3]"));
		e11.click();
		
		
		
	}

}
