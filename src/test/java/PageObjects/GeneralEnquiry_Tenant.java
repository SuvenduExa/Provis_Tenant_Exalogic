package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralEnquiry_Tenant 
{

	public WebDriver driver;
	public GeneralEnquiry_Tenant(WebDriver driver1)
	{
		driver=driver1;
		PageFactory.initElements(driver1, this);
	}
	
	@FindBy(name="username")
	@CacheLookup
	WebElement txtEmail;

	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;

	@FindBy(xpath="//button[contains(@type,'submit')]")
	@CacheLookup
	WebElement btnLogin;

	@FindBy(xpath="//button[@onclick='closeapppopup()']/..")
	@CacheLookup
	WebElement btnClose;
	

	@FindBy(xpath="//span[text()='General Enquiry']")
	@CacheLookup
	WebElement GeneralEnquiry;
	
	
	@FindBy(xpath="(//button[@class='btn dropdown-toggle btn-light bs-placeholder'])[1]")
	@CacheLookup
	WebElement Category;
	
	
	@FindBy(xpath="//span[text()='Enquiry - Helath Club']")
	@CacheLookup
	WebElement HelathClub;
	
	
	@FindBy(xpath="//div[text()='Enquiry Type']/../../..")
	@CacheLookup
	WebElement EnquiryType;
	
	@FindBy(xpath="//span[text()='Events']")
	@CacheLookup
	WebElement Events;
	
	
	@FindBy(id="comment")
	@CacheLookup
	WebElement Remarks;
	
	
	@FindBy(name="submit")
	@CacheLookup
	WebElement Subbtn;
	
	
	
	
	
	
	
	
	
	public void setUserName(String username)
	{
		txtEmail.clear();
		txtEmail.sendKeys(username);
	}

	public void setPassword(String password)
	{
		txtPassword.clear();
		txtPassword.sendKeys(password);
	}

	public void clickLogin()
	{
		btnLogin.click();
	}

	public void clickClose()
	{
		btnClose.click();
	}

	public void clickGeneralEnquiry()
	{
		GeneralEnquiry.click();
	}
	
	
	public void clickCategory()
	{
		Category.click();
	}
	
	
	public void clickHelathClub()
	{
		HelathClub.click();
	}
	
	
	public void clickEnquiryType()
	{
		EnquiryType.click();
	}
	
	public void clickEvents()
	{
		Events.click();
	}
		
	
	public void setRemarks(String text)
	{
		
		Remarks.sendKeys(text);
	}
	
	
	public void clickSubbtn()
	{
		Subbtn.click();
	}
			
	
	
	
}
