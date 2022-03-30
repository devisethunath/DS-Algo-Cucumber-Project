package myTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(
		
	//features=	"C:\\Users\\sethu\\eclipse-workspace\\DsAlgoCucumberBddProject\\features\\Home.feature",
		//features="C:\\Users\\sethu\\eclipse-workspace\\DsAlgoCucumberBddProject\\features\\VerifyDetailsHomPage.feature",
		features="C:\\Users\\sethu\\eclipse-workspace\\DsAlgoCucumberBddProject\\features\\WithoutLoggedIn.feature",
	glue="stepDefinitions",
	plugin= {"pretty","html:target/cucumber-html-report","json:target/cucumber-json-report.json","junit:target/cucumber-junit-report.xml"},
	monochrome=true
	
		)

public class HomeTestRunner {
	
	

}
