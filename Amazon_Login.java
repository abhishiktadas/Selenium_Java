package selenium;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Amazon_Login {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		WebElement username = driver.findElement(By.name("ap_email"));
		username.sendKeys("dasabhi9429@gmail.com");
		WebElement ct = driver.findElement(By.name("continue"));
		ct.click();
		WebElement password = driver.findElement(By.name("ap_password"));
		username.sendKeys("Prith&Abhi96");
		WebElement signin = driver.findElement(By.name(""));
		username.sendKeys("dasabhi9429@gmail.com");
//		WebElement ct1 = driver.findElement(By.name("Continue Shopping"));
//		ct1.click();
		

	}

}
