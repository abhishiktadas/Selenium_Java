package selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Class_2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();	//maximize the browser
//		//driver.findElement(By.name(""));
//		driver.findElement(By.name("q")).sendKeys("India"); //find the element by its name and then passing one value "INDIA"
//		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);//After find the element by name and passing the valus "INDIA" and then Press "ENTER"
//		
		driver.get("https://facebook.com");
		driver.findElement(By.name("email")).sendKeys("abhishikta.d2@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Mamoni&9709");
		driver.findElement(By.name("login")).click();
		
		

	}

}
