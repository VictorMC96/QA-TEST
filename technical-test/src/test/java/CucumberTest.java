
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.technicalTest.com.conts.ParametersCucumberConst;

/**
 * La clase CucumberTest se encarga de ejecutar los TestCase agregados dentro de la carpeta features.
 *
 * */

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ParametersCucumberConst.Feature,
        glue = ParametersCucumberConst.Glue,
        plugin = {ParametersCucumberConst.Pretty, ParametersCucumberConst.ReportHTML,
                ParametersCucumberConst.ReportJSON, ParametersCucumberConst.ReportXML},
        monochrome = true)
public class CucumberTest {

}
