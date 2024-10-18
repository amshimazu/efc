package com.efc.page;
import org.openqa.selenium.By;

public class usuarioPage {
    public static By clickUserOption = By.xpath("//a[@href='/configuration/user']");
    public static By typeUser  = By.xpath("//input[@id='name']");
    public static By typeLastNameUser = By.xpath("//input[@id='lastnames']");
    public static By typeEmailUser = By.xpath("//input[@id='email']");
}
