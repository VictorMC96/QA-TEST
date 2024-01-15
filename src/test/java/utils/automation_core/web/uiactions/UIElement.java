package utils.automation_core.web.uiactions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UIElement {

    /**
     * Metodo privado que permite obtener un WebElement
     * @param driver
     * @param uiElementName Nombre del elemento de la UI
     * @param uiElementLocator Objeto By locator para identificar al elemento en la UI
     * @param ec Condicion de espera
     * @param timeOut tiempo maximo de espera por el objeto segun su condicion de espera "ec"
     * @param isAssert true=assert(fallar el test), false=verify(marcar el warning en consola y continuar)
     * @return
     * @throws Exception
     */
    private static WebElement getWebElement(WebDriver driver, String uiElementName, By uiElementLocator, ExpectCondition ec,
                                            int timeOut, boolean isAssert) throws Exception {
        WebElement element = null;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));

        try {
            switch (ec) {
                case EXIST:
                    element = wait.until(ExpectedConditions.presenceOfElementLocated(uiElementLocator));
                    break;
                case VISIBLE:
                    element = wait.until(ExpectedConditions.visibilityOfElementLocated(uiElementLocator));
                    break;
                case INVISIBLE:
                    wait.until(ExpectedConditions.invisibilityOfElementLocated(uiElementLocator));
                    break;
                case CLICKABLE:
                    element = wait.until(ExpectedConditions.elementToBeClickable(uiElementLocator));
                    break;
                default:
                    throw new Exception("CONDICIÓN ESPERA NO SOPORTADA: " + ec);
            }
        } catch (NoSuchElementException e) {
            // TODO: handle exception
            System.out.println(MessagesActions.errorUIElementNotFound(uiElementName, timeOut, e.getMessage()));
            if(isAssert) {
                throw new Exception(MessagesActions.errorUIElementNotFound(uiElementName, timeOut, e.getMessage()));
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(MessagesActions.errorUIElementNotFound(uiElementName, timeOut, e.getMessage()));
            if(isAssert) {
                throw new Exception(MessagesActions.errorUIElementNotFound(uiElementName, timeOut, e.getMessage()));
            }
        }

        return element;
    }

    /**
     * Permite realizar un assert si existe un elemento en la UI, de no existir se crea una exception
     * @param driver
     * @param uiElementName
     * @param uiElementLocator
     * @param ec
     * @param timeOut
     * @param isAssert
     * @return
     * @throws Exception
     */
    public static WebElement assertUIElement(WebDriver driver, String uiElementName, By uiElementLocator, ExpectCondition ec,
                                       int timeOut, boolean isAssert) throws Exception {
        WebElement element = getWebElement(driver, uiElementName, uiElementLocator, ec, timeOut, true);
        System.out.println(MessagesActions.successUIElementFound(uiElementName, timeOut));
        return element;
    }

    /**
     * Permite realizar un verify si existe un elemento en la UI, de no existir se crea un mensaje de warning en la consola
     * @param driver
     * @param uiElementName
     * @param uiElementLocator
     * @param ec
     * @param timeOut
     * @param isAssert
     * @return
     * @throws Exception
     */
    public static WebElement verifyUIElement(WebDriver driver, String uiElementName, By uiElementLocator, ExpectCondition ec,
                                       int timeOut, boolean isAssert) throws Exception {
        WebElement element = getWebElement(driver, uiElementName, uiElementLocator, ec, timeOut, false);
        System.out.println(MessagesActions.successUIElementFound(uiElementName, timeOut));
        return element;
    }

    /**
     * Permite hacer click a un elemento de la UI
     * @param driver
     * @param uiElementName
     * @param uiElementLocator
     * @param ec
     * @param timeOut
     * @throws Exception
     */
    public static void clickUIElement(WebDriver driver, String uiElementName, By uiElementLocator, ExpectCondition ec,
                                 int timeOut) throws Exception {
        String action = "CLICK";

        try {
            WebElement element = assertUIElement(driver, uiElementName, uiElementLocator, ec, timeOut, true);
            element.click();
            System.out.println(MessagesActions.successUIElementAction(uiElementName, action));
        } catch (Exception e) {
            // TODO: handle exception
            throw new Exception(MessagesActions.errorUIElementAction(uiElementName, action, e.getMessage()));
        }
    }

    /**
     * Permite limpiar el texto y luego escribir en una caja de texto o text area
     * @param driver
     * @param uiElementName
     * @param uiElementLocator
     * @param ec
     * @param timeOut
     * @throws Exception
     */
    public static void clearAndSendKeys(WebDriver driver, String uiElementName, By uiElementLocator, ExpectCondition ec,
                                 int timeOut) throws Exception {
        String action = "CLEAR AND SEND KEYS";

        try {
            WebElement element = assertUIElement(driver, uiElementName, uiElementLocator, ec, timeOut, true);
            element.click();
            System.out.println(MessagesActions.successUIElementAction(uiElementName, action));
        } catch (Exception e) {
            // TODO: handle exception
            throw new Exception(MessagesActions.errorUIElementAction(uiElementName, action, e.getMessage()));
        }
    }

    public static void mouseOver(WebDriver driver, String uiElementName, By uiElementLocator, ExpectCondition ec,
                                 int timeOut) throws Exception {
        String action = "MOUSE OVER";

        try {
            WebElement element = assertUIElement(driver, uiElementName, uiElementLocator, ec, timeOut, true);
            //CODIGO PENDIENTE PARA EL ALUMNO


            System.out.println(MessagesActions.successUIElementAction(uiElementName, action));
        } catch (Exception e) {
            // TODO: handle exception
            throw new Exception(MessagesActions.errorUIElementAction(uiElementName, action, e.getMessage()));
        }
    }


}
