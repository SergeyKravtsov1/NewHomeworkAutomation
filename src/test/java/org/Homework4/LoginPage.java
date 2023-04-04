package org.Homework4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class LoginPage extends AbstractPage {

    private WebDriver driver;

    private static final By EMAIL_ADDRESS_FIELD = By.xpath("//input[@id='login_top_email']");
    private static final By PASSWORD_FIELD = By.name("Password");

    public LoginPage(WebDriver driver) {
        super(driver);

    }

    public WebElement getEmailField() {
        return driver.findElement(EMAIL_ADDRESS_FIELD);
    }

    public WebElement getPasswordField() {
        return driver.findElement(PASSWORD_FIELD);
    }
    public void setEmailAddressField(String emailAddressField) {
        WebDriver driver = new ChromeDriver();
        driver.findElement(EMAIL_ADDRESS_FIELD).sendKeys(emailAddressField);
    }
    public void setPasswordAddressField(String passwordField) {
        WebDriver driver = new ChromeDriver();
        driver.findElement(EMAIL_ADDRESS_FIELD).sendKeys(passwordField);

        }
    }

