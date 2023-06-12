package testRun;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		
		//features = ".\\Features\\login.feature",
		features = ".\\Features\\Customers1.feature",
		//features = ".\\Features\\Customers2.feature",
		//features = ".\\features\\Customers4.feature",
		//features = ".\\Features\\",
		glue = "stepDef",
		monochrome = true,
		dryRun = false,
		//tags = {"@ibm_smoke"},
		plugin = {"pretty", 
				
		
						"html:target/ibm_CucumberReport.html",
						"json:target/ibm_CucumberReport.json",
						"junit:target/ibm_CucumberReport.xml"
		
		
					},
		//tags = {"@sanity"}
		//tags = {"@ibm_regression"}
		tags = "@regression"
		
		

	)






public class TestRunner extends AbstractTestNGCucumberTests {
	
	
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		
		return super.scenarios();
	}

	
	
}
