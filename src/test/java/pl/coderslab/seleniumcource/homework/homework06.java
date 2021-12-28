package pl.coderslab.seleniumcource.homework;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.UUID;

public class homework06 {
    WebDriver driver;

    @Test
    public void searchFor(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //this.driver.manage().timeouts().implicitlyWait((Duration.ofSeconds(15)));
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        WebElement signInBtn = driver.findElement(By.id("_desktop_user_info"));
        signInBtn.click();
        WebElement noAccountBtn = driver.findElement(By.className("no-account"));
        noAccountBtn.click();
        WebElement socialTitleBtn = driver.findElement(By.xpath("//input[@name='id_gender']"));
        socialTitleBtn.click();
        WebElement firstNameInput = driver.findElement(By.xpath("//input[@name='firstname']"));
        String randomName = UUID.randomUUID().toString();
        firstNameInput.sendKeys(randomName);
        WebElement lastNameInput = driver.findElement(By.xpath("//input[@name='lastname']"));
        String randomLastName = UUID.randomUUID().toString();
        lastNameInput.sendKeys(randomLastName);
        WebElement emailInput = driver.findElement(By.xpath("//input[@name='email']"));
        String randomEmail = UUID.randomUUID() + "@mail.pl";
        emailInput.sendKeys(randomEmail);
        WebElement passwordInput = driver.findElement(By.xpath("//input[@name='password']"));
        String randomPassword = UUID.randomUUID().toString();
        passwordInput.sendKeys(randomPassword);
        WebElement showBtn = driver.findElement(By.xpath("//span[@class='input-group-btn']"));
        showBtn.click();
        WebElement birthDateInput = driver.findElement(By.xpath("//input[@name='birthday']"));

        //birthDateInput.sendKeys("13/12/1979");
    }
}
