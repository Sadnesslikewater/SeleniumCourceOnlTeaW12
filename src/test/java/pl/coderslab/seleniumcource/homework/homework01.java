package pl.coderslab.seleniumcource.homework;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homework01 {
    WebDriver driver;
    @Test
    public void shouldSignIn(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.get("https://mystore-testlab.coderslab.pl/index.php ");
        WebElement signInBtn = driver.findElement(By.id("_desktop_user_info"));
        signInBtn.click();
        WebElement noAccountBtn = driver.findElement(By.className("no-account"));
        noAccountBtn.click();
        driver.navigate().back();
        driver.navigate().back();
    }


}
