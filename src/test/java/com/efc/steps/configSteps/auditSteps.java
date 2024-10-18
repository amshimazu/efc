package com.efc.steps;
import com.efc.page.auditPage;

import com.efc.utils.Utils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebDriver;

public class auditSteps {

    private static WebDriver driver;

    public auditSteps(WebDriver driver) {
        this.driver = driver;
    }

    public static void clickAuditOption(WebDriver driver) {
        try{
            Utils.waitUntilElementIsClickeable(driver, auditPage.clickAuditOption);

            System.out.println("Se ingreso a la opción auditoria");

            Utils.waitUntilTextIsVisible(driver, auditPage.auditTittle);
            Utils.waitInSeconds(2);

        }catch (Exception e){
            System.out.println("Elemento no encontrado: " + e.getMessage());
        }

    }
    public static void clickAuditDetails(WebDriver driver) {
        WebElement menuDetailAudit = driver.findElement(auditPage.menuDetaileAudit);
        menuDetailAudit.click();

        try{
            Utils.waitUntilElementIsClickeable(driver, auditPage.auditDetails);
            Utils.waitUntilTextIsVisible(driver, auditPage.userDetailsTittle);
            Utils.waitInSeconds(2);

        }catch (Exception e){
            System.out.println("Elemento no encontrado: " + e.getMessage());
        }
    }
}
