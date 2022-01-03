package pl.coderslab.seleniumcource.cucumber.zadaniazaliczeniowe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressData {
    //alias, address, city, zipCode, country, phone)
    @FindBy(name = "alias")
    private WebElement aliasInput;

    @FindBy(name = "address")
    private WebElement addressInput;

    @FindBy(name = "city")
    private WebElement cityInput;

    @FindBy(name = "zipCode")
    private WebElement zipCodeInput;

    @FindBy(name = "country")
    private WebElement countryInput;

    @FindBy(name = "phone")
    private WebElement phoneInput;

    private UserData userData;

    public AddressData(WebDriver driver) {PageFactory.initElements(driver, this);}

    //public void formFilledWithData(Object userData){
    public void formFilledWithData(AddressData addressData){

        aliasInput.sendKeys(this.userData.getAlias());
        addressInput.sendKeys(this.userData.getAddress());
        cityInput.sendKeys(this.userData.getCity());
        zipCodeInput.sendKeys(String.valueOf(this.userData.getZipCode()));
        countryInput.sendKeys(this.userData.getCountry());
        phoneInput.sendKeys(String.valueOf(this.userData.getPhone()));

    }
}



