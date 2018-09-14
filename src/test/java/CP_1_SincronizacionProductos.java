import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.winium.DesktopOptions;
import  org.openqa.selenium.By;
import org.openqa.selenium.winium.WiniumDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class CP_1_SincronizacionProductos {
    protected DesktopOptions option;
    protected  WiniumDriver driver;
    protected WebDriverWait wait;
    @Before
    public void setUp() throws MalformedURLException {
        option = new DesktopOptions();
        option.setApplicationPath("C:\\Program Files (x86)\\SoftRestaurantSincronizador\\SoftRestaurantX.Syncronize.exe");
        driver = new WiniumDriver(new URL("http://localhost:9999"), option);
        wait = new WebDriverWait(driver,60);
    }
    @Test
    public void CP_1_SincronizacionProductosTest(){
        try{
            wait.until(ExpectedConditions.elementToBeClickable(By.name("Minimizar"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.id("btnFlat"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.name("Correo Electrónico"))).sendKeys("walook.pruebas@gmail.com");
            wait.until(ExpectedConditions.elementToBeClickable(By.name("Contraseña"))).sendKeys("PruebasWa100k");
            wait.until(ExpectedConditions.elementToBeClickable(By.name("Enviar"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.id("cmbEnterprises"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.className("Popup"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.name("ACEPTAR"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.name("Seleccionar..."))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.name("Empresa 2"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.name("Seleccionar"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.name("ACEPTAR"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.name("Sincronizar"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.name("ACEPTAR"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.id("PART_Toggle"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.name("Cerrar Sesión"))).click();
            driver.quit();
        }catch (Exception e){
            Assert.fail(e.getMessage());
        }
    }
    @After
    public void tearDown(){
        driver.quit();

    }


}
