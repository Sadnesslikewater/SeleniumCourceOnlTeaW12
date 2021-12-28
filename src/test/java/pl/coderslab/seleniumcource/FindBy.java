package pl.coderslab.seleniumcource;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.UUID;

// Wyszukaj elementy za pomocą lokalizatora by.id
//Na stronie https://hotel-testlab.coderslab.pl/en/ zidentyfikuj następująca pola/przyciski za pomocą lokalizatora by.id:
//
//
//(pole tekstowe) Hotel Location
//(przycisk) Search Now
//(pole tekstowe) Enter your e-mail (pole na dole stron)
//Po zidentyfikowaniu elementów wpisz następujące wartości w pola tekstowe:
//
//Hotel Location - Warsaw
//Enter your e-mail - test@test.com

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.UUID;

// Wyszukaj elementy za pomocą lokalizatora by.id
//Na stronie https://hotel-testlab.coderslab.pl/en/ zidentyfikuj następująca pola/przyciski za pomocą lokalizatora by.id:
//
//
//(pole tekstowe) Hotel Location
//(przycisk) Search Now
//(pole tekstowe) Enter your e-mail (pole na dole stron)
//Po zidentyfikowaniu elementów wpisz następujące wartości w pola tekstowe:
//
//Hotel Location - Warsaw
//Enter your e-mail - test@test.com

public class FindBy {
    WebDriver driver;

    @Test
    public void shouldFindById() {
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement hotelLocationInput = driver.findElement(By.id("hotel_location"));
        WebElement searchNowBtn = driver.findElement(By.id("search_room_submit"));
        // todo finish
    }

    @Test
    public void shouldFindByName() {
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement hotelLocationInput = driver.findElement(By.name("hotel_location"));
        // todo finish
    }

    @Test
    public void shouldFindByClassName() {
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement signInBtn = driver.findElement(By.className("hide_xs"));
        signInBtn.click();
        WebElement emailInput = driver.findElement(By.id("email_create"));
        String randomEmail = UUID.randomUUID() + "@mail.pl";
        emailInput.clear();
        emailInput.sendKeys(randomEmail);
        WebElement createAccountBtn = driver.findElement(By.id("SubmitCreate"));
        createAccountBtn.click();
        WebElement radioMr = driver.findElement(By.cssSelector("input#id_gender1"));
        radioMr.click();
        WebElement firstNameInput = driver.findElement(By.id("customer_firstname"));
        if(!firstNameInput.isDisplayed() || !firstNameInput.isEnabled()) {
            Assertions.fail("element not interactable!");
        }
        firstNameInput.sendKeys("ala");
        WebElement lastNameInput = driver.findElement(By.id("customer_lastname"));
        if(!lastNameInput.isDisplayed() || !lastNameInput.isEnabled()) {
            Assertions.fail("element not interactable!");
        }
        lastNameInput.sendKeys("alowska");
        WebElement passwordInput = driver.findElement(By.id("passwd"));
        if(!passwordInput.isDisplayed() || !passwordInput.isEnabled()) {
            Assertions.fail("element not interactable!");
        }
        passwordInput.sendKeys("password");
        WebElement days = driver.findElement(By.id("days"));
        days.sendKeys("9");
        WebElement months = driver.findElement(By.id("months"));
        months.sendKeys("January");
        WebElement years = driver.findElement(By.id("years"));
        years.sendKeys("2000");
        WebElement newsletter = driver.findElement(By.id("newsletter"));
        newsletter.click();
        WebElement submit = driver.findElement(By.id("submitAccount"));
        submit.click();
    }

    @BeforeEach
    public void beforeEach() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
    }

//    @AfterEach
//    public void afterEach() {
//        this.driver.quit();
//    }
}


/*
public class FindBy {
    WebDriver driver;

    @Test
    public void shouldFindById() {
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement hotelLocationInput = driver.findElement(By.id("hotel_location"));
        WebElement searchNowBtn = driver.findElement(By.id("search_room_submit"));
        WebElement enterYourEmailInput = driver.findElement(By.id("newsletter-input"));
        hotelLocationInput.sendKeys("Warsaw");
        enterYourEmailInput.sendKeys("test@test.com");

    }

    //Na stronie https://hotel-testlab.coderslab.pl/en/ zidentyfikuj następująca pola/przyciski
// za pomocą lokalizatora by.name:
//(pole tekstowe) Hotel Location
//(przycisk) Search Now
//(pole tekstowe) Enter your e-mail (pole na dole strony)
//(przycisk) Subscribe
//Po zidentyfikowaniu elementów wpisz następujące wartości w pola tekstowe:
//
//Hotel Location - Warsaw
//Enter your e-mail - test@test.com
//Dodatkowo kliknij przycisk Serach Now, używając metody Submit np.
//
//findElement(By.name("q")).submit();
    @Test
    public void shouldFindByName() {
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement hotelLocationInput = driver.findElement(By.name("hotel_location"));
        WebElement searchNowBtn = driver.findElement(By.name("search_room_submit"));
        WebElement enterYourEmailInput = driver.findElement(By.name("email"));
        WebElement subscribeBtn = driver.findElement(By.name("submitNewsletter"));
        hotelLocationInput.sendKeys("Warsaw");
        enterYourEmailInput.sendKeys("test@test.com");
        searchNowBtn.click();
        //WebElement searchNow = driver.findElement(By.name("search_room_submit")).submit();
    }
//Na stronie https://hotel-testlab.coderslab.pl//en/ zidentyfikuj następująca pola/przyciski za
// pomocą lokalizatora by.className:
//(przycisk) Sign In
//(pole tekstowe) Email address
//Po zidentyfikowaniu elementów kliknij przycisk Sign In i wpisz dowolny adres e-mail w
// pole Email address.
//Rozpocznij tworzenie nowego użytkownika za pomocą kliknięcia przycisku
// Create an account (nie musi być z wykorzystaniem lokalizatora by.className)

    @Test
    public void shouldFindByClassName() {
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement signInBtn = driver.findElement(By.className("hide_xs"));
        signInBtn.click();
        WebElement emailInput = driver.findElement(By.id("email_create"));
        String randomEmail = UUID.randomUUID() + "@mail.pl";
        emailInput.sendKeys(randomEmail);
        WebElement createAccountBtn = driver.findElement(By.id("SubmitCreate"));
        createAccountBtn.click();
        WebElement radioMr = driver.findElement(By.cssSelector("input#id_gender1"));
        radioMr.click();
    }

    //Będąc na stronie rejestracji nowego użytkownika (patrz zadanie 3),
// wyszukaj za pomocą lokalizatorów xpath wszystkie wymagane pola tekstowe
// oraz wypełnij je dowolnymi danymi:
//
//First Name
//Last Name
//Email
//Password
//Kliknij przycisk Register, który również wyszukaj przy pomocy lokalizatora by.xpath.
    @Test
    public void shouldFindByXpath() {
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        WebElement signInBtn = driver.findElement(By.className("hide_xs"));
        signInBtn.click();
        WebElement emailInput = driver.findElement(By.id("email_create"));
        emailInput.sendKeys("ozzy.kowalski@gmail.com");
        //String randomEmail = UUID.randomUUID() + "@mail.pl";
        //emailInput.sendKeys(randomEmail);
        WebElement createAccountBtn = driver.findElement(By.id("SubmitCreate"));
        createAccountBtn.click();
        WebElement radioMr = driver.findElement(By.cssSelector("input#id_gender1"));
        radioMr.click();
        WebElement firstNameInput = driver.findElement(By.xpath("//input[@id='customer_firstname']"));
        firstNameInput.sendKeys("Ozzy");
        //String randomFirstName = UUID.randomUUID().toString();
        //firstNameInput.sendKeys(randomFirstName);
        WebElement lastNameInput = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
        lastNameInput.sendKeys("Kowalski");
        //String randomLastName = UUID.randomUUID().toString();
        //lastNameInput.sendKeys(randomLastName);
        WebElement email2Input = driver.findElement(By.xpath("//input[@id='email']"));
        email2Input.sendKeys("");
        //email2Input.sendKeys();
        //String randomEmail2 = UUID.randomUUID() + "@mail.pl";
        //email2Input.sendKeys();
        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='passwd']"));
        //String randomPassword = UUID.randomUUID().toString();
        passwordInput.sendKeys("Password123");
        WebElement RegisterBtn = driver.findElement(By.xpath("//input[@id='submitAccount']"));
        RegisterBtn.click();
    }

    @Test
    public void shouldFindByCssSelector() {
        WebElement myAddressesBtn = driver.findElement(By.cssSelector("input.icon-building"));
        //myAddressesBtn.click();
        WebElement myPersonalInformationBtn = driver.findElement(By.cssSelector("input.icon-user"));
        //myPersonalInformationBtn.click();

    }
}
/*
    @BeforeEach
    public static void beforeEach(){
        System.out.println("this will be before EACH test");
}

    @BeforeAll
    public static void afterAll(){
        System.out.println("this will be before ALL test");
        }
}

//    @AfterEach
//    public void afterEach() {
//        this.driver.quit();
//    }


*/