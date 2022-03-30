package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageLoading {
	
	WebDriver ldriver;
	
	public HomePageLoading(WebDriver rdriver)
	
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	
	@FindBy(xpath="//button[@class='btn']")
	@CacheLookup
	WebElement btnGetStarted;
	
	
	public void ClickGetStarted()
	{
		btnGetStarted.click();
	}
	
}
