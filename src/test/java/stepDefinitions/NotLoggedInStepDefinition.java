package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.WithoutLoggedIn;

public class NotLoggedInStepDefinition {
	
	public WebDriver driver;
	public WithoutLoggedIn wl;
	
	@Given("User is on the DsAlgoPortal app home page {string}")
	public void user_is_on_the_ds_algo_portal_app_home_page(String url) {
		System.setProperty("webdriver.chrome.driver","C://Users/sethu/Downloads/chromedriver_win32/chromedriver.exe");//opens browser
		driver=new ChromeDriver();
		wl=new WithoutLoggedIn(driver);
		driver.get(url);
	}

	@When("User clicks on GetStarted Button")
	public void user_clicks_on_get_started_button() {
		wl.clickgetStarted();
	   
	}

	@Then("message is displayed {string}")
	public void message_is_displayed(String text) {
		
		String message1=wl.getAlert();
		Assert.assertEquals(text, message1);
	   
}
	@Given("User is on the DsAlgoPortal app home  {string}")
	public void user_is_on_the_ds_algo_portal_app_home(String url1) {
		System.setProperty("webdriver.chrome.driver","C://Users/sethu/Downloads/chromedriver_win32/chromedriver.exe");//opens browser
		driver=new ChromeDriver();
		wl=new WithoutLoggedIn(driver);
		driver.get(url1);
	}

	@When("User Clicks on DataSTructure dropdown")
	public void user_clicks_on_data_s_tructure_dropdown() {
	   wl.clickDataStructure();
	  
	}

	@When("user clicks on Arrays in Datastructure dropdown")
	public void user_clicks_on_arrays_in_datastructure_dropdown() {
		 wl.clickArrays();
	}
	
	@Then("message is displayed1 {string}")
	public void message_is_displayed1(String text1) {
		
		String message2=wl.getAlert();
		Assert.assertEquals(text1, message2);
	   
}







}
