package  selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Scrollupanddown 
{
public static void main(String[] args) throws InterruptedException {
	EdgeDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
driver.get("https://www.amazon.in");
WebElement e1=	driver.findElement(By.linkText("About Amazon"));
	Point xy=		e1.getLocation();
	int x=		xy.getX();
	int y=		xy.getY();
	int y1=y-160;
JavascriptExecutor js=			driver;
js.executeScript("window.scrollBy(0,"+y1+")");
Thread.sleep(3000);
js.executeScript("window.scrollBy(0,-500)");
	
}
}
