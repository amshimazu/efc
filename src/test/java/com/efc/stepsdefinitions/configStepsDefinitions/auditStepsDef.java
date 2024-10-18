package com.efc.stepsdefinitions;
import com.efc.steps.auditSteps;

import com.efc.steps.rolSteps;
import com.efc.utils.Utils;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class auditStepsDef {

    private WebDriver driver;

    public auditStepsDef() {
        driver = Utils.WebDriverManager.getDriver();
    }

    private rolSteps rolSteps() {
        return new rolSteps(driver);
    }

    @Y("hago click en auditoria.")
    public void hagoClickEnAuditoria() {
        rolSteps.clickConfigOption(driver);
        auditSteps.clickAuditOption(driver);
    }

    @Entonces("veo el detalle del evento.")
    public void veoElDetalleDelEvento() {
        auditSteps.clickAuditDetails(driver);
    }
}
