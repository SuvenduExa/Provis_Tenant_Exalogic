package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeliveryDisposalRequestPage 
{

	public WebDriver driver;
	public DeliveryDisposalRequestPage(WebDriver driver1)
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

	@FindBy(xpath="//span[text()='My Requests']")
	@CacheLookup
	WebElement btnMyRequest3;

	@FindBy(xpath="//span[text()='My Services']")
	@CacheLookup
	WebElement btnMyServices3;

	@FindBy(xpath="//div[text()='Select category']/../../..")
	@CacheLookup
	WebElement SelectaService3;
	
	@FindBy(xpath="//span[text()='Delivery/Disposal Request']")
	@CacheLookup
	WebElement Delivery;
	
	@FindBy(xpath="//div[text()='Select Community']/../../..")
	@CacheLookup
	WebElement Community;

	@FindBy(xpath="(//span[text()='Gate & Arc'])[2]")
	@CacheLookup
	WebElement GateArc;	

	@FindBy(xpath="//button[@title='Select Precinct']")
	@CacheLookup
	WebElement Precinct;

	@FindBy(xpath="//span[text()='The Gate']")
	@CacheLookup
	WebElement TheGate;	

	@FindBy(xpath="//button[@title='Select Unit']")
	@CacheLookup
	WebElement UnitNumber;

	@FindBy(xpath="//span[text()='Gate - T3 - 5407']")
	@CacheLookup
	WebElement GateT35407;
	
	@FindBy(xpath="//*[@id=\"formid\"]/div[2]/div[1]/div[4]/div/div/button")
	@CacheLookup
	WebElement TypeofRequest;
	
	@FindBy(xpath="//span[text()=' Delivery ']")
	@CacheLookup
	WebElement Deliveryoption;
	
	@FindBy(name="number_of_items")
	@CacheLookup
	WebElement numberofitems;
	
	@FindBy(xpath="//body[@class=\"cke_editable cke_editable_themed cke_contents_ltr\"]")
	@CacheLookup
	WebElement ItemsDescription;
	
	@FindBy(id="disposal_date")
	@CacheLookup
	WebElement disposaldate;
	
	@FindBy(xpath="(//td[text()='4'])[2]")
	@CacheLookup
	WebElement disdate;
	
	@FindBy(name="company_name")
	@CacheLookup
	WebElement ContactPersonName;
	
	@FindBy(id="alteration_contact_number")
	@CacheLookup
	WebElement ContactPersonNumber;
	
	@FindBy(id="btnsubmit")
	@CacheLookup
	WebElement Submitbtn;
	
	
	
	
	
	
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

	public void clickMyRequest()
	{
		btnMyRequest3.click();
	}

	public void clickMyServices()
	{
		btnMyServices3.click();
	}

	public void clickSelectaService()
	{
		SelectaService3.click();
	}

	public void clickDeliveryDisposalRequest()
	{
		Delivery.click();
	} 
	
	public void ClickCommunity()
	{
		Community.click();
	}	

	public void ClickGateArc()
	{
		GateArc.click();
	}	

	public void ClickPrecinct()
	{
		Precinct.click();
	}

	public void ClickTheGate()
	{
		TheGate.click();
	}

	public void ClickTypeofRequest()
	{
		TypeofRequest.click();
	}

	public void ClickDeliveryoption()
	{
		Deliveryoption.click();
	}
	
	public void ClickUnitNumber()
	{
		UnitNumber.click();
	}

	public void ClickGateT35407()
	{
		GateT35407.click();
	}
	

	public void Clicknumberofitems()
	{
		numberofitems.sendKeys("3");
	}
	
	
	public void setContactPersonName(String Name) 
	{
		ContactPersonName.sendKeys(Name);
	}
	
	public void Clickdisposaldate()
	{
		disposaldate.click();
	}
	
	public void Clickdisdate()
	{
		disdate.click();
	}
	
	
	public void ItemsDescription(String text) 
	{
		driver.switchTo().frame(0);
		ItemsDescription.sendKeys(text);
		driver.switchTo().defaultContent();
	}
	
	public void setContactPersonNumber(String mobileno) 
	{
		ContactPersonNumber.sendKeys(mobileno);
	}
	
	public void ClickSubmitbtn()
	{
		Submitbtn.click();
	}
	
}
