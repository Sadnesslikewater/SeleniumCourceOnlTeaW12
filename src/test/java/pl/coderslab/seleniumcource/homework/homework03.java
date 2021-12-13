package pl.coderslab.seleniumcource.homework;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homework03 {
    WebDriver driver;

    @Test
    public void myForm(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
        WebElement firstNameInput = driver.findElement(By.id("first-name"));
        firstNameInput.sendKeys("Karol");
        WebElement lastNameInput = driver.findElement(By.id("last-name"));
        lastNameInput.sendKeys("Kowalski");
        WebElement genderBtn = driver.findElement(By.className("radio-inline"));
        genderBtn.click();
        WebElement dateOfBirth = driver.findElement(By.id("dob"));
        dateOfBirth.sendKeys("05/22/2010");
        WebElement addressInput = driver.findElement(By.id("address"));
        addressInput.sendKeys("Prosta 51");
        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("karol.kowalski@mailinator.com");
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("Pass123");
        WebElement companyInput = driver.findElement(By.id("company"));
        companyInput.sendKeys("Coders Lab");
        WebElement commentInput = driver.findElement(By.id("comment"));
        commentInput.sendKeys("To jest mój pierwszy automat testowy");
        WebElement submitBtn = driver.findElement(By.id("submit"));
        submitBtn.click();
    }
}
