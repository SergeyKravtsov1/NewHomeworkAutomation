package org.Homework4;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest {

    private static WebDriver driver;
    private static LoginPage loginPage;

    @BeforeAll
    public static void init() {
        driver = WebDriverCash.getDriver();
        loginPage = new LoginPage(driver);
    }

    @Test
    public void testEmail() throws InterruptedException {
        driver.get("https://www.autodoc.de/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='popup-choose-cookies__btn popup-choose-cookies__btn--blue popup-choose-cookies__btn--big js-button_choose ga-click']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Anmelden')]")).click();
        driver.findElement(By.xpath("//input[@id='login_top_email']")).click();
        loginPage.setEmailAddressField("test@gmail.com");
        Assertions.assertTrue(loginPage.getEmailField().isDisplayed());
        driver.findElement(By.xpath("////input[@type='password']]")).click();
        loginPage.setPasswordAddressField("Test");
        Assertions.assertTrue(loginPage.getPasswordField().isDisplayed());



    }

    @AfterAll
    public static void quitDriver() {
        driver.quit();

    }
}

