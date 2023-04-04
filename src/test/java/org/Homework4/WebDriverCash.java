package org.Homework4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class WebDriverCash {

    private static WebDriver driver;

    private WebDriverCash(){}

    public static WebDriver getDriver(){
        if (Objects.nonNull(driver)) {
            return driver;
        }else{
            System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
            System.setProperty("webdriver.http.factory", "jdk-http-client");
            driver = new ChromeDriver();
            return driver;
        }
    }

        }

