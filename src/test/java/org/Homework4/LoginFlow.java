package org.Homework4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFlow {
    private LoginPage loginPage;

    public LoginFlow(WebDriver driver) {
        loginPage = new LoginPage(driver);
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }

    public void setEmailAddressField(String emailAddressField) {
        loginPage.getEmailField()
                .sendKeys(emailAddressField);
    }

    public void setPasswordField(String passwordField) {
        loginPage.getEmailField()
                .sendKeys(passwordField);
    }

    public boolean isEmailDisplayed() {
        return loginPage.getEmailField().isDisplayed();
    }

    public boolean isPasswordDisplayed() {
        return loginPage.getPasswordField().isDisplayed();
    }
}