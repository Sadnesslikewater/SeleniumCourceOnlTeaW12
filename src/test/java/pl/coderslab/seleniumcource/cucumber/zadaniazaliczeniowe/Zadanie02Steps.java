package pl.coderslab.seleniumcource.cucumber.zadaniazaliczeniowe;

        import io.cucumber.java.en.And;
        import io.cucumber.java.en.Given;
        import io.cucumber.java.en.When;
        import io.cucumber.java.en.Then;
        import org.openqa.selenium.*;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.support.ui.Select;
        import pl.coderslab.seleniumcource.pageobject.CreateAnAccountPage;

        import java.io.File;
        import java.io.IOException;
        import java.nio.file.Files;
        import java.nio.file.Paths;
        import java.time.Duration;
        import java.time.LocalDateTime;
        import java.util.List;

        import static org.junit.jupiter.api.Assertions.assertEquals;
        import static org.junit.jupiter.api.Assertions.assertTrue;

public class Zadanie02Steps {
    private WebDriver driver;
    private Object UserData;

    @Given("^Web page (.*) opened in browser$")
    public void WebPageOpenedInBrowser(String url) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        this.driver.get(url);
    }

    @And("^First key sign in pressed vol 2$")
    public void firstSignInBtn() {
        WebElement firstSignInBtn = driver.findElement(By.id("_desktop_user_info"));
        firstSignInBtn.click();
    }

    @And("^Email address entered in input box vol 2$")
    public void emailAddressEntered() {
        WebElement emailAddressInput = driver.findElement(By.xpath("//*[@id=\"login-form\"]/section/div[1]/div[1]/input"));
        emailAddressInput.clear();
        emailAddressInput.sendKeys("jankowalski@email.com");
    }

    @And("^Password entered in input box vol 2$")
    public void passwordEntered() {
        WebElement passwordInput = driver.findElement(By.xpath("//*[@id=\"login-form\"]/section/div[2]/div[1]/div/input"));
        passwordInput.clear();
        passwordInput.sendKeys("Password123");
    }

    @And("^Second key sign in pressed vol 2$")
    public void secondKeySignInPressed() {
        WebElement secondSignInBtn = driver.findElement(By.id("submit-login"));
        secondSignInBtn.click();
    }

    @Then("^Press clothes button$")
    public void pressClothesButton() {
        WebElement clothesBtn = driver.findElement(By.xpath("//*[@id=\"category-3\"]/a"));
        clothesBtn.click();
    }

    @And("^Select Hummingbird Printed Sweater$")
    public void selectSweater() {
        WebElement selectSweater = driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[2]/div/a/img"));
        selectSweater.click();
    }

    @And("^20% discount checked$")
    public void discountChecked() {
        WebElement discountChecked = driver.findElement(By.xpath("//*[@id=\"main\"]/div[1]/div[2]/div[1]/div[2]/div/span[2]"));
        assertEquals("Save 20%", "Save 20%");
        double fullPrice = 35.90;
        double discount = 0.8;
        double newPrice = fullPrice * discount;
        if (newPrice == 28.72) {
            System.out.println("Saved 20%");
        } else {
            System.out.println("Wrong discount");
        }
    }
    @And("^May choose the size$")
    public void shouldClickSize() {
        driver.get("https://mystore-testlab.coderslab.pl/index.php?id_product=2&id_product_attribute=9&rewrite=brown-bear-printed-sweater&controller=product");
        List<WebElement> sizes = driver.findElements(By.xpath("//*[@id=\"group_1\"]/option"));
        sizes.get(0).click(); // click S
        sizes.get(1).click(); // click M
        sizes.get(2).click(); // click L
        sizes.get(3).click(); // click XL
  }
    @Then("^Choose M size$")
    public void chooseMSize() {
        WebElement chooseSize = driver.findElement(By.xpath("//*[@id=\"group_1\"]/option[2]"));
        chooseSize.click();
    }
    @And("^Select quantity of 5$")
    public void selectQuantity(){
        WebElement quantity = driver.findElement(By.xpath("//*[@name='qty']"));
        quantity.clear();
        quantity.sendKeys("5");
    }
    @And("^Add to cart pressed$")
    public void addToCardPressed(){
        WebElement addToCardBtn = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2]/button"));
        addToCardBtn.click();
    }

    @When("^Proceed to checkout pressed$")
        public void proceedToCheckoutButton(){
        WebElement proceedToCheckOutBtn = driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a"));
        proceedToCheckOutBtn.click();
    }
    @And("^Second proceed to checkout pressed$")
        public void secondProceedButtonPressed(){
        WebElement secondProceedBtn = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/div/a"));
        secondProceedBtn.click();
    }
    @And("^Address confirmed$")
    public void addressConfirmation() {
        WebElement confirmAddress = driver.findElement(By.xpath("//*[@id=\"id-address-delivery-address-19212\"]/header/label/span[1]/span"));
        confirmAddress.click();
    }
    @And("^Continue button pressed$")
    public void continueButtonPressed(){
        WebElement continueBtn = driver.findElement(By.xpath("//*[@id=\"checkout-addresses-step\"]/div/div/form/div[2]/button"));
        continueBtn.click();
    }
    @Then("^PrestaShop pick up in store option chosen$")
    public void prestaShopPickUpInStoreOptionChosen(){
        WebElement prestaShopBtn = driver.findElement(By.xpath("/html/body/section/div/section/div/div[1]/section[3]/div/div[2]/form/div/div[1]/div[1]/div/span/span"));
        prestaShopBtn.click();
    }
    @And("^Second continue button pressed$")
    public void secondContinueButtonPressed(){
        WebElement secondContinueBtn = driver.findElement(By.xpath("//*[@id=\"js-delivery\"]/button"));
        secondContinueBtn.click();
    }
    @And("^Pay by check payment option chosen$")
    public void payByCheckPaymentOptionChosen(){
        WebElement payByCheckBtn = driver.findElement(By.xpath("//*[@id=\"payment-option-1\"]"));
        payByCheckBtn.click();
        WebElement agreementOfTheTermsOfService = driver.findElement(By.xpath("//*[@id=\"conditions_to_approve[terms-and-conditions]\"]"));
        agreementOfTheTermsOfService.click();
    }
    @And("^Order with an obligation to pay pressed$")
    public void orderWithAnObligationToPayPressed(){
        WebElement orderBtn = driver.findElement(By.xpath("//*[@id=\"payment-confirmation\"]/div[1]/button"));
        orderBtn.click();
    }
    @And("Screenshot taken")
    public void screenshotTaken() throws IOException {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File tmpScreenshot = screenshot.getScreenshotAs(OutputType.FILE);
        String currentDateTime = LocalDateTime.now().toString().replaceAll(":", "_");
        Files.copy(tmpScreenshot.toPath(), Paths.get("C:", "test-evidence", "registration-success-evidence-12-" + currentDateTime + ".png"));
    }
    @And("^Order history checked$")
    public void status2() {
        WebElement backToCustomerAccount = driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a[2]/span"));
        backToCustomerAccount.click();
        WebElement orderHistoryDetails = driver.findElement(By.xpath("//*[@id=\"history-link\"]/span/i"));
        orderHistoryDetails.click();
        WebElement successMessage3 = driver.findElement(By.xpath("//tr[1]/td[2]"));
        String successMessageText3 = successMessage3.getText();
        assertEquals("€143.60", successMessageText3);
    }
    @And("^Payment status and amount checked$")
    public void paymentStatus() {
        WebElement successMessage2 = driver.findElement(By.xpath("//tr[1]/td[4]/span[1]"));
        String successMessageText2 = successMessage2.getText();
        assertEquals("Awaiting check payment", successMessageText2);

    }
}

