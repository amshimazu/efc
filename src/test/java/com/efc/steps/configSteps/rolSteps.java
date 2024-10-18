package com.efc.steps;
import com.efc.page.rolPage;
import com.efc.utils.Utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebDriver;

import static com.efc.utils.Utils.manageAssertions;

public class rolSteps {

    private static WebDriver driver;

    public rolSteps(WebDriver driver) {
        this.driver = driver;
    }

    public static void clickConfigOption(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until((ExpectedConditions.visibilityOfElementLocated(rolPage.clickConfigOption)));

        WebElement clickConfigOption = driver.findElement(rolPage.clickConfigOption);
        clickConfigOption.click();

        System.out.println("Se desplego el menú de configuración");
    }
    public static void clickRolOption(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement clickRolOption = driver.findElement(rolPage.rolOption);
        clickRolOption.click();

        System.out.println("Se ingreso a la opcion de roles");

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[contains(., 'Configuración')])[2]")));
        Utils.waitInSeconds(2);
    }

    public static void viewPermisson(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement viewPermisson = driver.findElement(rolPage.viewPermisson);
        viewPermisson.click();

        Utils.waitInSeconds(2);
        System.out.println("Se muestran los permisos del rol");
    }

    public static void clickEditButton(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement clickEditButton = driver.findElement(rolPage.clickEditButton);
        clickEditButton.click();

        System.out.println("Se hizo click en editar rol");

        WebElement elemento = Utils.waitUntilElementIsVisible(driver, rolPage.saveEditionButton);
    }

    public static void clickOnRol(WebDriver driver, String rol) {
        if (driver == null) {
            System.out.println("El objeto driver es nulo. Asegúrate de inicializarlo correctamente.");
            return;
        }

        String locatorCintaOpciones = Utils.obtenerLocatorCintaOpciones(rol);
        WebElement cintaOpciones = null;

        try {
            cintaOpciones = driver.findElement(By.xpath(locatorCintaOpciones));
            cintaOpciones.click();
            Utils.waitInSeconds(2);
        } catch (NoSuchElementException e) {
            System.out.println("No se pudo encontrar la cinta de opciones para el rol: " + rol);
            return;
        }

        String locatorBotonVerDetalle = Utils.obtenerLocatorBotonVerDetalle(rol);
        WebElement botonVerDetalle = null;

        try {
            botonVerDetalle = driver.findElement(By.xpath(locatorBotonVerDetalle));
            botonVerDetalle.click();
            System.out.println("Se selecciono el rol: " +rol);
        } catch (NoSuchElementException e) {
            System.out.println("No se pudo encontrar el botón 'Ver Detalle' para el rol: " + rol);
            return;
        }
    }

    public static void ingresarInformacionAEditar(String nombreRol, String estado, String descripcionRol, String grupoAsociado, WebDriver driver) {
        if (driver == null) {
            System.out.println("El objeto driver es nulo. Asegúrate de inicializarlo correctamente.");
            return;
        }
        ingresarNombreRol(nombreRol, driver);
        ingresarEstado(estado, driver);
        ingresarDescripcionRol(descripcionRol, driver);
        ingresarGrupoAsociado(grupoAsociado, driver);
    }
    public static void ingresarNombreRol(String nombreRol, WebDriver driver) {
        if (nombreRol == null || nombreRol.isEmpty()) {
            System.out.println("El nombre del rol está vacío. No se edito este campo");
            return;
        } else {
            WebElement ingresarNombreRol = driver.findElement(rolPage.nombreRol);

            Utils.borrarTextoEnCampo(driver, rolPage.nombreRol);
            Utils.waitInSeconds(2);

            ingresarNombreRol.sendKeys(nombreRol);
            Utils.waitInSeconds(2);

            System.out.println("Se edito el nombre del rol: " +nombreRol);
        }
    }
    public static void ingresarEstado(String estado, WebDriver driver) {
        if (estado == null || estado.isEmpty()) {
            System.out.println("El estado del rol está vacío. No se edito este campo");
            return;
        } else if (estado.equals("Activo")){
            WebElement openListStattusRol = driver.findElement(rolPage.openListStattusRol);
            openListStattusRol.click();

            Utils.waitInSeconds(2);

            WebElement selectStattusActive = driver.findElement(rolPage.selectStattusActive);
            selectStattusActive.click();

            Utils.waitInSeconds(2);

            System.out.println("Se selecciono el estado Activo");
        }else{
            WebElement openListStattusRol = driver.findElement(rolPage.openListStattusRol);
            openListStattusRol.click();

            Utils.waitInSeconds(2);

            WebElement selectStattusInactive = driver.findElement(rolPage.selectStattusInactive);
            selectStattusInactive.click();

            Utils.waitInSeconds(2);

            System.out.println("Se selecciono el estado Inactivo");
        }
    }

    public static void ingresarDescripcionRol(String descripcionRol, WebDriver driver) {
        if (descripcionRol == null || descripcionRol.isEmpty()){
            System.out.println("El campo descripcion esta vacio. No se edito este campo");
            return;
        }else {
            WebElement addDescription = driver.findElement(rolPage.addDescription);

            Utils.borrarTextoEnCampo(driver, rolPage.addDescription);
            Utils.waitInSeconds(2);

            addDescription.sendKeys(descripcionRol);
            System.out.println("Se agrego una nueva descripcion");
            Utils.waitInSeconds(2);
        }
    }

    public static void ingresarGrupoAsociado(String grupoAsociado, WebDriver driver) {
        if (grupoAsociado != null) {
            WebElement listarGrupos = driver.findElement(rolPage.openListGroups);
            listarGrupos.click();
            Utils.waitInSeconds(1);

                switch (grupoAsociado){
                    case "IP_Admin":
                        WebElement groupAdmin = driver.findElement(rolPage.groupAdmin);
                        groupAdmin.click();

                        Utils.waitInSeconds(1);
                        System.out.println("Se selecciono el grupo: " +grupoAsociado);
                        break;

                    case "IP_Lectura":
                        WebElement groupLectura = driver.findElement(rolPage.groupLectura);
                        groupLectura.click();

                        Utils.waitInSeconds(1);
                        System.out.println("Se selecciono el grupo: " +grupoAsociado);
                        break;

                    case "IP_Gestor":
                        WebElement groupGestor = driver.findElement(rolPage.groupGestor);
                        groupGestor.click();

                        Utils.waitInSeconds(1);
                        System.out.println("Se selecciono el grupo: " + grupoAsociado);
                        break;

                    default:
                        System.out.println("El rol " +grupoAsociado+ "no coincide con ninguno conocido");
                }
        }else{
            System.out.println("El grupo es nulo");
        }
    }

    public static void addAllPremissonRol(WebDriver driver) {
        WebElement viewPermisson = driver.findElement(rolPage.viewPermisson);
        viewPermisson.click();

        Utils.scrollToBottom(driver);
        Utils.waitInSeconds(2);

        System.out.println("Se muestran los permisos del rol");

        WebElement addAllPremissonRol = driver.findElement(rolPage.addPremissonRol);
        addAllPremissonRol.click();

        Utils.scrollToElement(driver, driver.findElement(rolPage.createRolButton));
        Utils.waitInSeconds(2);

        System.out.println("Se agregaron los permisos para el usuario");
    }

    public static void clickSaveButtonEdition(WebDriver driver) {
        WebElement saveEditionButton = driver.findElement(rolPage.saveEditionButton);
        Utils.scrollToBottom(driver);
        Utils.waitInSeconds(2);

        saveEditionButton.click();
        Utils.waitUntilElementIsClickeable(driver, rolPage.saveConfirmationButton);
    }

    public static void createNewRol(WebDriver driver) {
        WebElement createNewRol = driver.findElement(rolPage.createNewRol);
         createNewRol.click();

         Utils.waitInSeconds(1);
    }

    public static void createRolButton(WebDriver driver) {
        Utils.waitUntilElementIsClickeable(driver, rolPage.createRolButton);
        Utils.waitInSeconds(2);

        System.out.println("Se hizo click en crear rol.");
    }

    public static void buttonCreateRolConfirmation(WebDriver driver) {
        Utils.waitUntilElementIsClickeable(driver, rolPage.buttonCreateRolConfirmation);
        Utils.waitInSeconds(1);
    }

    public String getConfirmationMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(rolPage.confirmationMessage));
        return this.driver.findElement(rolPage.confirmationMessage).getText();
    }

    public String getConfirmationMessageRolCreated() {
        Utils.waitUntilElementIsVisible(driver, rolPage.getConfirmationMessageRolCreated);
        return this.driver.findElement(rolPage.getConfirmationMessageRolCreated).getText();
    }
}
