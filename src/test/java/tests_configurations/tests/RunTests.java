package tests_configurations.tests;

import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
//@RunWith(value = Cucumber.class)
//@CucumberOptions(monochrome = true,
//        features = "src/test/resources/features",
//        glue = "tests_configurations",
//        tags = "@CreateAccount"
//        tags = "@Smoke and @Regression"
//        tags = "@Smoke and not(to ignore) @Regression"
//        )
public final class RunTests {

        //TODO: Do we need to create a UserBean in <@Before> and then get all properties from that entity?
        //TODO: How to separate steps, each scenario = different steps file or each feature = different step file?
}