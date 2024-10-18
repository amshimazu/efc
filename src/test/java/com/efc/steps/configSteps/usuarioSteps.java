package com.efc.steps;
import com.efc.page.rolPage;
import com.efc.page.usuarioPage;
import com.efc.utils.Utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebDriver;

public class usuarioSteps {

    private static WebDriver driver;

    public usuarioSteps(WebDriver driver) {
        this.driver = driver;
    }

    public static void clickUserOption(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until((ExpectedConditions.visibilityOfElementLocated(usuarioPage.clickUserOption)));

        WebElement clickUserOption = driver.findElement(usuarioPage.clickUserOption);
        clickUserOption.click();

        System.out.println("Se ingreso a la opcion de usuarios");

        Utils.waitUntilTextIsVisible(driver, By.xpath("//span[contains(text(),'Lista de usuarios')]"));
    }

    public String validateUserListTittle() throws InterruptedException{
        return Utils.manageAssertions(driver, By.xpath("//span[contains(text(),'Lista de usuarios')]"));
    }
}
