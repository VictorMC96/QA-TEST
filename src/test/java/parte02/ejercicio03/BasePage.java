package parte02.ejercicio03;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Se recomienda hacer más acciones de usuario para las diferentes plataformas incluso encapsulandolas en un CORE
 *  (JAR/Package)
 */
public class BasePage {

    public Object driver;

    public BasePage(Object driver) {
        this.driver = driver;
    }

    /**
     * Esto permite obtener el objeto para un web driver en especifico
     *  Se sugiera cambiar el finding por explicit wait
     * @param locator
     * @return
     * @throws Exception
     */
    protected WebElement getUIElemet(By locator) throws Exception {
        WebElement uiElement = null;

        try{
            if(this.driver instanceof WebDriver){
                uiElement = ((WebDriver) this.driver).findElement(locator);
            }
            if(this.driver instanceof AndroidDriver){
                uiElement = ((AndroidDriver) this.driver).findElement(locator);
            }
            if(uiElement == null){
                throw new Exception("DRIVER INVALID");
            }

        } catch (Exception e){
            throw new Exception("ERROR WHEN TRY TO GET UIELEMENT. EXCEPTION: " + e.getMessage());
        }

        return uiElement;
    }
}
