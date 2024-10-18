package com.efc.stepsdefinitions;
import com.efc.steps.rolSteps;
import com.efc.utils.Utils;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

public class rolStepsDef {
    private WebDriver driver;

    public rolStepsDef() {
        driver = Utils.WebDriverManager.getDriver();
    }

    private rolSteps rolSteps() {
        return new rolSteps(driver);
    }

    @Y("hago click en roles.")
    public void hagoClickEnRoles() {
        rolSteps.clickConfigOption(driver);
        rolSteps.clickRolOption(driver);
    }

    @Y("veo los permisos asignados.")
    public void veoLosPermisosAsignados() {
        rolSteps.viewPermisson(driver);
    }

    @Y("hago click en el rol.")
    public void hagoClickEnElRol() {
        rolSteps.clickConfigOption(driver);
        rolSteps.clickRolOption(driver);
    }

    @Y("hago click en el rol {string}.")
    public void hagoClickEnElRol(String rol) throws InterruptedException{
        rolSteps.clickOnRol(driver, rol);
    }
    @Y("hago click en editar")
    public void hagoClickEnEditar() {
        rolSteps.clickEditButton(driver);
    }

    @Y("ingreso la información del rol.")
    public void ingresoLaInformacionDelRol(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);

        String nombreRol = data.get(0).get("nombreRol");
        String estado = data.get(0).get("estado");
        String descripcionRol = data.get(0).get("descripcionRol");
        String grupoAsociado = data.get(0).get("grupoAsociado");

        rolSteps.ingresarInformacionAEditar(nombreRol, estado, descripcionRol, grupoAsociado, driver);
    }

    @Y("agrego los permisos para el rol")
    public void agregoLosPermisosParaElRol() {
        rolSteps.addAllPremissonRol(driver);
    }

    @Entonces("hago click en el boton guardar")
    public void hagoClickEnElBotonGuardar() {
        rolSteps.clickSaveButtonEdition(driver);
    }

    @Y("valido toast con mensaje: {string}")
    public void validoToastConMensaje(String expectedMessage) {
        String confirmationMessage = rolSteps().getConfirmationMessage();
        Assertions.assertEquals(expectedMessage, confirmationMessage);

        System.out.println("Se validó el mensaje: " + confirmationMessage);
    }

    @Entonces("hago click en crear nuevo rol.")
    public void hagoClickEnCrearNuevoRol() {
        rolSteps.createNewRol(driver);
    }

    @Cuando("hago click en crear rol")
    public void hagoClickEnCrearRol() {
        rolSteps.createRolButton(driver);
        rolSteps.buttonCreateRolConfirmation(driver);
    }

    @Y("valido toast: {string}")
    public void validoToast(String expectedMessage) {
        String confirmationMessageRolCreated = rolSteps().getConfirmationMessageRolCreated();
        Assertions.assertEquals(expectedMessage, confirmationMessageRolCreated);

        System.out.println("Se validó el mensaje: " + confirmationMessageRolCreated);
    }

}
