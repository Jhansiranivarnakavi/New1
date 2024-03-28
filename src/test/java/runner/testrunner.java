package runner;




import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;



@CucumberOptions(
        features = {"src/test/java/feature"},
        glue = {"steps","utility"},
        plugin = {"pretty","html:target/htmalreport.html","json:cucumber.json",
                "timeline:test-output-thread/"},
        tags = "@Login"

)

public class testrunner extends AbstractTestNGCucumberTests {
}
