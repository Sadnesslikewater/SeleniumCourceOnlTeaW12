package pl.coderslab.seleniumcource.homework;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.UUID;

public class homework04 {
    WebDriver driver;

    @Test
    public void searchFor(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(" https://mystore-testlab.coderslab.pl/index.php?controller=authentication&create_account=1 ");
        WebElement socialTitleBtn = driver.findElement(By.xpath("//input[@name='id_gender']"));
        socialTitleBtn.click();
        WebElement firstNameInput = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstNameInput.sendKeys("Wodnik");
        WebElement lastNameInput = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastNameInput.sendKeys("Szuwarek");
        WebElement emailInput = driver.findElement(By.xpath("//input[@name='email']"));
        String randomEmail = UUID.randomUUID() + "@mail.pl";
        emailInput.sendKeys(randomEmail);
        WebElement passwordInput = driver.findElement(By.xpath("//input[@name='password']"));
        String randomPassword = UUID.randomUUID().toString();
        passwordInput.sendKeys(randomPassword);
        WebElement showBtn = driver.findElement(By.xpath("//span[@class='input-group-btn']"));
        showBtn.click();
        WebElement birthDateInput = driver.findElement(By.xpath("//input[@name='birthday']"));
        birthDateInput.sendKeys("13/12/1979");
    }
}
//("//input[@id='email']"));