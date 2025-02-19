package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment83_LinkText {

	public static void main(String[] args) {

		EdgeDriver driver = new EdgeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?tag=msndeskstdin-21&ref=pd_sl_8ipd9izczt_e&adgrpid=1328211703591630&hvadid=83013495293827&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=155300&hvtargid=kwd-83014163717471:loc-90&hydadcr=5621_2377279");
		
		WebElement e2 = driver.findElement(By.id("nav-hamburger-menu"));
		e2.click();
		
//		WebElement e1 = driver.findElement(By.linkText("Customer Service"));
//		e1.click();
		
		WebElement e3 = driver.findElement(By.partialLinkText("Customer"));
		e3.click();
		

	}

}
