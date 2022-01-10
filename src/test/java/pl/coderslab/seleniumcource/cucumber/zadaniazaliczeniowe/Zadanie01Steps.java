package pl.coderslab.seleniumcource.cucumber.zadaniazaliczeniowe;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.coderslab.seleniumcource.pageobject.CreateAnAccountPage;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Zadanie01Steps {
    private WebDriver driver;
    private Object UserData;

    @Given("^Web page (.*) opened$")
    public void WebPageOpenedInBrowser(String url) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.get(url);
    }

    @And("^First key sign in pressed$")
    public void firstSignInBtn() {
        WebElement firstSignInBtn = driver.findElement(By.id("_desktop_user_info"));
        firstSignInBtn.click();
    }

    @And("^Email address entered in input box$")
    public void emailAddressEntered() {
        WebElement emailAddressInput = driver.findElement(By.xpath("//*[@id=\"login-form\"]/section/div[1]/div[1]/input"));
        emailAddressInput.clear();
        emailAddressInput.sendKeys("jankowalski@email.com");
    }

    @And("^Password entered in input box$")
    public void passwordEntered() {
        WebElement passwordInput = driver.findElement(By.xpath("//*[@id=\"login-form\"]/section/div[2]/div[1]/div/input"));
        passwordInput.clear();
        passwordInput.sendKeys("Password123");
    }

    @And("^Second key sign in pressed$")
    public void secondKeySignInPressed() {
        WebElement secondSignInBtn = driver.findElement(By.id("submit-login"));
        secondSignInBtn.click();
    }

    @When("^Addresses button pressed$")
    public void addressesButtonPressed() {
        WebElement addressesBtn = driver.findElement(By.xpath("//*[@id=\"addresses-link\"]/span/i"));
        addressesBtn.click();
    }

    @And("^Create new address button pressed$")
    public void createNewAddressButtonPressed() {
        WebElement createNewAddressBtn = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/a/span"));
        createNewAddressBtn.click();
    }

    @Then("^Form filled with data: (.*), (.*), (.*), (.*), (.*), (.*) and data checked$")
    public void formFilledWithData(String alias, String address, String city, String zipCode, String country, int phone) {
        UserData userData = new UserData()
                .setAlias(alias)
                .setAddress(address)
                .setZipCode(zipCode)
                .setCity(city)
                .setCountry(country)
                .setPhone(phone);

        AddressData addressData = new AddressData(driver);
        assertEquals(alias, userData.getAlias());
        assertEquals(address, userData.getAddress());
        assertEquals(zipCode, userData.getZipCode());
        assertEquals(city, userData.getCity());
        assertEquals(country, userData.getCountry());
        assertEquals(phone, userData.getPhone());
        addressData.formFilledWithData(userData);
    }
    @And("^Save button pressed$")
    public void saveButtonPressed() {
        WebElement saveBtn = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/footer/button"));
        saveBtn.click();
    }

    @And("^New account deleted$")
    public void deleteNewAccount() {
        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=addresses");
        WebElement deleteAccountBtn = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div[2]/article/div[2]/a[2]/span"));
        deleteAccountBtn.click();
    }

    @And("^Account deletion message displayed$")
    public void deleteAccountMsg() {
        WebElement successMessage = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/aside/div/article/ul/li"));
        String successMessageText = successMessage.getText();
        assertEquals("Address successfully deleted!", successMessageText);
    }
}


