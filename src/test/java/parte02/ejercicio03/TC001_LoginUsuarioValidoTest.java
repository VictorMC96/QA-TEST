package parte02.ejercicio03;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.fail;

public class TC001_LoginUsuarioValidoTest extends BaseTest {

	/**
	 * Esto permite utilizar el mismmo PAGE OBJECT para cualquier plataforma
	 * 	encapsulando la implementación del driver en el BasePage
	 * @throws Exception
	 */
	@Test
	public void tc001login() throws Exception {
		try {
			//LOGIN PARA WEB
			LoginPage loginPageWeb = new LoginPage(this.browser);
			loginPageWeb.llenarFormulario("test.0@test.com", "Test1234");
			loginPageWeb.clickBottonLogin();

			//LOGIN PARA ANDROID
			LoginPage loginPageAdr = new LoginPage(this.android);
			loginPageAdr.llenarFormulario("test.0@test.com", "Test1234");
			loginPageAdr.clickBottonLogin();

		} catch (Exception e) {
			// TODO: handle exception
			fail("FAIL TEST: " + e);
		} finally {
			//REPORTEO
		}
	}


	
}
