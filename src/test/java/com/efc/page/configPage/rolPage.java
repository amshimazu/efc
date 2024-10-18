package com.efc.page;
import org.openqa.selenium.By;

public class rolPage {
    public static By clickConfigOption = By.xpath("(//a[contains(., 'Configuración')])[1]");
    public static By rolOption = By.xpath("//a[@href='/configuration/role']");
    public static By viewPermisson = By.xpath("//div[contains(@class, 'cursor-pointer') and contains(span, 'Ver más')]");
    public static By clickEditButton = By.xpath("//button[@data-pc-name=\"button\"]");
    public static By nombreRol = By.xpath("//input[@id='name']");
    public static By selectStattusActive = By.xpath("//li[@role='option' and @aria-label='Activo']");
    public static By selectStattusInactive = By.xpath("//li[@role='option' and @aria-label='Inactivo']");
    public static By addDescription = By.xpath("//textarea[@id='description']");
    public static By addPremissonRol = By.xpath("//div[contains(@class, 'p-checkbox-box')]");
    public static By saveEditionButton = By.xpath("(//button[@data-pc-name='button'])[2]");
    public static By saveConfirmationButton = By.xpath("//button[contains(., 'Sí, guardar')]");
    public static By confirmationMessage = By.xpath("//div[contains(@class, 'p-toast-message-content')]");
    public static By createNewRol = By.xpath("//div[@routerlink=\"/configuration/role/create\"]");
    public static By openListGroups = By.xpath("(//div[contains(@class, 'p-multiselect-label')])[1]");
    public static By groupAdmin = By.xpath("//li[@aria-label='IP_Admin']");
    public static By groupLectura = By.xpath("//li[@aria-label='IP_Lectura']");
    public static By groupGestor = By.xpath("//li[@aria-label='IP_Gestor de Criticos']");
    public static By createRolButton = By.xpath("//button[contains(span/@class, 'bi-check-circle') and span[text()='Crear rol']]");
    public static By buttonCreateRolConfirmation = By.xpath("//button[span='Sí, crear']");
    public static By getConfirmationMessageRolCreated = By.xpath("//div[@class='p-toast-detail ng-tns-c3576075022-23']\n");
    public static By openListStattusRol = By.xpath("//div[@class='p-dropdown-trigger']");
}
