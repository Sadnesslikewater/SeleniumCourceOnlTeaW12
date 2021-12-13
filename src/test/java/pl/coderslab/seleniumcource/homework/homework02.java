package pl.coderslab.seleniumcource.homework;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class homework02 {

    @Test
    public void newBrowser(){
        System.setProperty("webdriver.edge.driver", "src/test/resources/MicrosoftEdgeSetup.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.qwant.com/");
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys("runmageddon");
        searchInput.submit();
    }
}
