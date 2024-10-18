package com.efc.page;
import org.openqa.selenium.By;

public class auditPage {
    public static By clickAuditOption = By.xpath("//a[@href=\"/configuration/audit\"]");
    public static By auditTittle = By.xpath("(//span[contains(text(), 'Auditoría')])[1]");
    public static By menuDetaileAudit = By.xpath("(//button[@icon=\"pi pi-ellipsis-v\"])[1]");
    public static By auditDetails = By.xpath("//a[contains(@href, \"/configuration/audit/\")]");
    public static By userDetailsTittle = By.xpath("//div[contains(text(), \"USUARIO\")]");
}
