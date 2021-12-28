package pl.coderslab.seleniumcource.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
    private WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSignIn() {
        WebElement signInBtn = driver.findElement(By.className("hide_xs"));
        signInBtn.click();
    }

    public void selectHotelByName(){
        WebElement selectHotelDropDown = driver.findElement(By.id("hotel_cat_name"));
        selectHotelDropDown.click();
    }
}

