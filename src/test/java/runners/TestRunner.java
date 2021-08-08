package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(

            features = "src/test/resources/features/",

            //glue is where we can find implementation for gherkin steps
            //we provide the path of package for steps
            glue = "steps",

            //if we set dryRun for true, it will quickly scan all gherkin steps are implemented or not
            //if it is true, then no execution happens
            dryRun = true,

            //it means that the console output for the cucumber text is easily visible
            //it will remove unreadable character
            monochrome = true,


            tags = "@example"

    )

    public class TestRunner{

    }

