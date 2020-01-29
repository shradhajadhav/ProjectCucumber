package testRunner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Featurefile",glue= {"stepDefinition"},tags="@user-specific",
                plugin= {"pretty","json:target/cucumber.json"})


public class LoginRunner
{
	

}
