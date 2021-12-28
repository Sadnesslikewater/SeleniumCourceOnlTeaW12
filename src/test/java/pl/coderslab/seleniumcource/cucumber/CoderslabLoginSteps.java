package pl.coderslab.seleniumcource.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CoderslabLoginSteps {
    private WebDriver driver;

    //@Given("^Web page (.*) opened in browser$")
    //public void openBrowser(String url) {
    @Given("^Web page https://lms.coderslab.pl/ opened in browser$")
    public void WebPageOpenedInBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.get("https:lms.coderslab.pl/");
    }

    @When("^email address entered in input box$")
    public void emailAddressEntered() {
        WebElement emailAddressInput = driver.findElement(By.id("username"));
        emailAddressInput.clear();
        emailAddressInput.sendKeys("...");
    }

    @And("^password entered in input box$")
    public void passwordEntered() {
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.clear();
        passwordInput.sendKeys("...");
    }
    @And("^key zaloguj pressed$")
    public void keyZalogujPressed(){
        WebElement keyZalogujBtn = driver.findElement(By.cssSelector(".btn-login"));
        keyZalogujBtn.click();
    }
    @Then("you are logged into \"Coders Lab\" educational portal, name of logged in person appears at the corner")
    public void youAreLogged(){

    }
}




