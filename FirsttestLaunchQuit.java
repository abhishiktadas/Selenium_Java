package selenium;//type India and press enter

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FirsttestLaunchQuit extends LaunchQuit
{

	@Test
	public void testcase1()
	{
		driver.findElement(By.name("q").sendKeys("India"+Keys.ENTER));
	}
}
