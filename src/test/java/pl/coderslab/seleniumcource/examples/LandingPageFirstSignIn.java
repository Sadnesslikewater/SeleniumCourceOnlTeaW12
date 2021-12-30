package pl.coderslab.seleniumcource.cucumber.zadaniazaliczeniowe;

import io.cucumber.java.ro.Si;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPageFirstSignIn {
     private WebDriver driver;

     public LandingPageFirstSignIn(WebDriver driver) {
          this.driver = driver;
     }
     public void clickSighIn(){
          WebElement signInBtn1 = driver.findElement(By.id("_desktop_user_info"));
          signInBtn1.click();

     }
}
