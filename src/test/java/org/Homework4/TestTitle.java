package org.Homework4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.junit.jupiter.api.Test;

public class TestTitle {

    private static WebDriver driver;

    @BeforeAll
    public static void init(){
        driver = WebDriverCash.getDriver();
    }

    @Test
    public void testGetUrl() {
        driver.get("https://www.autoersatzteile.de/10414787-hella");
        String expected = "Zündkerze 8EH 188 705-081 HELLA M14 x 1.25, SW: 16 günstig in Original Qualität";
        Assertions.assertEquals(driver.getTitle(), expected);
        driver.findElement(By.xpath("//button[@class='cookies-popup__btn']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Anmelden')]")).click();
        WebElement shopingBagtitle = driver.findElement(By.xpath("//input[@class='form-input popup__input'][@type='email']"));
        shopingBagtitle.sendKeys("test@ukr.net");
        Assertions.assertTrue(shopingBagtitle.isDisplayed());

    }
}
