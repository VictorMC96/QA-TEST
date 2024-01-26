package parte02.ejercicio03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginPage extends BasePage {

	public LoginPage(Object driver) throws Exception {
		super(driver);
	}

	private WebElement txtUser = this.getUIElemet(By.id("SOME-ID"));
	private WebElement txtPassword = this.getUIElemet(By.id("SOME-ID"));
	private WebElement btnLogin = this.getUIElemet(By.id("SOME-ID"));


	/********************************************************************************
	 * ******************************************************************************
	 * ACCIONES
	 * ******************************************************************************
	 ********************************************************************************/
	
	public void llenarFormulario(String usuario, String password) throws Exception {
		try {
			txtUser.sendKeys(usuario);
			txtPassword.sendKeys(password);

		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception("Error. Al llenar formulario: 'Login'. \nException => " + e.getMessage() );
		}
	}
	
	public void clickBottonLogin() throws Exception {
		try {
			btnLogin.click();
			
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception("Error. Al hacer click en el boton: 'Sign In'. \nException => " + e.getMessage() );
		}
	}

	
	
}
