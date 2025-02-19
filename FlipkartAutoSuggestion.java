package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class FlipkartAutoSuggestion {
    public static void main(String[] args) {

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            // Open Flipkart website
            driver.get("https://www.flipkart.com");

            // Close the login popup if it appears
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            
            // Locate the search bar and enter "shoe"
            WebElement searchBar = driver.findElement(By.name("q"));
            searchBar.sendKeys("shoe");

            // Wait for auto-suggestions to appear
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul._1va75j")));

            // Get all auto-suggestion elements
            List<WebElement> suggestions = driver.findElements(By.cssSelector("ul._1va75j li"));

            // Select the last suggestion
            if (!suggestions.isEmpty()) {
                suggestions.get(suggestions.size() - 1).click();
            } else {
                System.out.println("No suggestions found.");
            }

        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
