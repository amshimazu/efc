package com.efc.utils;
import org.openqa.selenium.WebDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Utils {
    public static void validarTitulo(WebDriver driver, String tituloEsperado) {
        String tituloActual = driver.getTitle();
        assertEquals(tituloEsperado, tituloActual, "El título de la página no coincide");
    }
}