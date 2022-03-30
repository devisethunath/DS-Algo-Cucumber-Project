package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WithoutLoggedIn {
	
	WebDriver ldriver;
	
	public WithoutLoggedIn(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//a[@href='data-structures-introduction']")
	@CacheLookup
	WebElement getStarted_btn;

	@FindBy(linkText="Data Structures")
	@CacheLookup
	WebElement btn_dataStructure;
	
	@FindBy(xpath="//a[normalize-space()='Arrays']")
	@CacheLookup
	WebElement btn_arrays;
	
	@FindBy(xpath="//div[@role='alert']")
	@CacheLookup
	WebElement alert;
	
	public void clickgetStarted()
	{
		getStarted_btn.click();
	}
	
	public void clickDataStructure()
	{
		btn_dataStructure.click();
	}
	public void clickArrays()
	{
		btn_arrays.click();
	}
	public String  getAlert()
	{
		String message=alert.getText();
		return message;
	}
}
