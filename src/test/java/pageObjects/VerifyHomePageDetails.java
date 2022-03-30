package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyHomePageDetails {

	WebDriver ldriver;

	public  VerifyHomePageDetails(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}


	@FindBy(xpath="//button[@class='btn']")
	@CacheLookup
	WebElement btnGetStarted;

	@FindBy(linkText="Data Structures")
	@CacheLookup
	WebElement dataStructure;


	@FindBy(className="dropdown-item")
	@CacheLookup
	List<WebElement> options;



	public void ClickGetStarted()
	{
		btnGetStarted.click();
	}

	public int getDropdownSize()
	{
		int count=options.size();
		return count;
	}
	
	public void clickDataStructure()
	{
		dataStructure.click();
	}


}
