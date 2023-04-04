package org.Homework4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFlowTest {

    private static WebDriver driver;
    private static LoginFlow loginFlow;

    @BeforeAll
    public static void init() {
        driver = WebDriverCash.getDriver();
        loginFlow = new LoginFlow(driver);
    }

    @Test
    public void testEmail() throws InterruptedException {
        driver.get("https://www.autodoc.de/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@class='popup-choose-cookies__btn popup-choose-cookies__btn--blue popup-choose-cookies__btn--big js-button_choose ga-click']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Anmelden')]")).click();
        driver.findElement(By.xpath("//input[@id='login_top_email']")).click();
        loginFlow.setEmailAddressField("test@gmail.com");
        Assertions.assertTrue(loginFlow.isEmailDisplayed());
        driver.findElement(By.xpath("////input[@type='password']]")).click();
        loginFlow.setPasswordField("Test");
        Assertions.assertTrue(loginFlow.isPasswordDisplayed());
    }
}