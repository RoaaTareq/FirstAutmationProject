package firstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;  // Importing TestNG annotations
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class MyTestCases {
  
    WebDriver driver = new ChromeDriver();
    @BeforeTest
    public void mySetup() {
        // Setup WebDriver here
        
        driver.get("https://google.com");
        driver.manage().window().maximize();
    }

    @Test
    public void myFirstTest() {
        // Add test logic for the first test
    	driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("Roaa Abu-shaqrah"+Keys.ENTER);

    }

    @Test
    public void mySecondTest() {
       
    }

    @AfterTest
    public void Final() {
        // Clean up, close the browser after tests
     
    }
}
