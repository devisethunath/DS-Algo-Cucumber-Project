package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.VerifyHomePageDetails;

public class VerifyHomePageDetailsStepDefinitions {
	
	public WebDriver driver;
	
	public VerifyHomePageDetails hp;
	
	
	@Given("User eneters the url {string} in the browser")
	public void user_eneters_the_url_in_the_browser(String URL) {
		
		System.setProperty("webdriver.chrome.driver","C://Users/sethu/Downloads/chromedriver_win32/chromedriver.exe");//opens browser
		driver=new ChromeDriver();
		hp=new VerifyHomePageDetails(driver);
		driver.get("https://dsportalapp.herokuapp.com/");
		driver.manage().window().maximize();
		
	}

	@Given("User Clicks getstarted button")
	public void user_clicks_getstarted_button() {
		hp.ClickGetStarted();
		
	}

	@When("user clicks the datastructure dropdown")
	public void user_clicks_the_datastructure_dropdown() {
		
	  hp.clickDataStructure();
	}

	@Then("{int} datastructure elements displayed")
	public void datastructure_elements_displayed(Integer int1) {
		
		int countelements=hp.getDropdownSize();
		System.out.println(countelements);
		int act_elements=6;
		Assert.assertEquals(act_elements, countelements);
	}

}
