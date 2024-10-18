package com.efc.stepsdefinitions;
import com.efc.steps.rolSteps;
import com.efc.steps.usuarioSteps;

import com.efc.utils.Utils;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

public class usuarioStepsDef {
    private WebDriver driver;

    private usuarioSteps usuarioSteps(){
        return new usuarioSteps(driver);
    }

    public usuarioStepsDef() {
        driver = Utils.WebDriverManager.getDriver();
    }

    @Dado("que hago click en usuarios.")
    public void queHagoClickEnUsuarios() {
        rolSteps.clickConfigOption(driver);
        usuarioSteps.clickUserOption(driver);
    }

    @Y("valido que me encuentre en la lista de usuarios {string}.")
    public void validoQueMeEncuentreEnLaListaDeUsuarios(String expectedTitle) throws  InterruptedException{
        String validateUserListTittle = usuarioSteps().validateUserListTittle();
        Assertions.assertEquals(expectedTitle, validateUserListTittle);

        Utils.waitInSeconds(2);
        System.out.println("Se valido el título: " +validateUserListTittle);
    }
}
