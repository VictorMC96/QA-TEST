package parte02.ejercicio03;

import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest {

	protected WebDriver browser = null;
	protected AndroidDriver android = null;

	@BeforeAll
	public static void beforeAll() throws Exception {
	}
	
	@BeforeEach
	public void beforeTest() throws Exception {

	}

	@AfterEach
	public void afterTest() throws Exception {
		if(this.browser != null){
			this.browser.quit();
		}
		if(this.android != null){
			this.android.quit();
		}

	}

	@AfterAll
	public static void endTestSuite() {
	}
	

}
