package pl.coderslab.seleniumcource.cucumber.zadaniazaliczeniowe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressData {
    @FindBy(name = "alias")
    private WebElement aliasInput;

    @FindBy(name = "address1")
    private WebElement addressInput;

    @FindBy(name = "city")
    private WebElement cityInput;

    @FindBy(name = "postcode")
    private WebElement zipCodeInput;

    @FindBy(name = "id_country")
    private WebElement countryInput;

    @FindBy(name = "phone")
    private WebElement phoneInput;


    public AddressData(WebDriver driver)
    {PageFactory.initElements(driver, this);}

    public void formFilledWithData(UserData userData){

        aliasInput.sendKeys(userData.getAlias());
        addressInput.sendKeys(userData.getAddress());
        cityInput.sendKeys(userData.getCity());
        zipCodeInput.sendKeys(userData.getZipCode());
        countryInput.sendKeys(userData.getCountry());
        phoneInput.sendKeys(String.valueOf(userData.getPhone()));

    }
}



