package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.HomePageLoading;

public class HomeStepDefinitions {
	
	public WebDriver driver;
	public HomePageLoading hp;
	
	
	@Given("Open the browser")
	public void open_the_browser() {
		
		System.setProperty("webdriver.chrome.driver","C://Users/sethu/Downloads/chromedriver_win32/chromedriver.exe");//opens browser
		driver=new ChromeDriver();
		hp=new HomePageLoading(driver);
	}

	@When("Enter the URL  {string}")
	public void enter_the_url(String url) {
		driver.get(url);
	}

	@When("Click GetStarted Button")
	public void click_get_started_button() {
		
		hp.ClickGetStarted();
	}

	@Then("User is directed to  DS Algo portal home  page")
	public void user_is_directed_to_ds_algo_portal_home_page() {
		
		String curerntUrl=driver.getCurrentUrl();
		System.out.print(curerntUrl);
		String Actual_Url="https://dsportalapp.herokuapp.com/home";
		Assert.assertEquals(Actual_Url, curerntUrl);
	}


}
