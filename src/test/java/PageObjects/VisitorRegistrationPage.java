package PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VisitorRegistrationPage 
{
	public WebDriver driver;
	public VisitorRegistrationPage(WebDriver driver1)
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
	WebElement btnMyRequest6;

	@FindBy(xpath="//span[text()='My Services']")
	@CacheLookup
	WebElement btnMyServices6;

	@FindBy(xpath="//div[text()='Select category']/../../..")
	@CacheLookup
	WebElement SelectaService6;

	@FindBy(xpath="//span[text()='Visitor Registration']")
	@CacheLookup
	WebElement VisitorRegistration6;

	@FindBy(id="visitor_name")
	@CacheLookup
	WebElement VisitorName;

	@FindBy(id="visitor_mobile_no")
	@CacheLookup
	WebElement VisitorMobileno;

	@FindBy(id="visitor_email")
	@CacheLookup
	WebElement VisitorEmail;

	@FindBy(xpath="//button[@title='Guest']")
	@CacheLookup
	WebElement VisitorType;

	@FindBy(xpath="//span[text()='Visitor']")
	@CacheLookup
	WebElement Visitor;

	@FindBy(xpath="//input[@id='attachment']")
	@CacheLookup
	WebElement IdProof;

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

	@FindBy(id="visitor_expected_date")
	@CacheLookup
	WebElement CheckInDate;

	@FindBy(xpath="(//td[text()='7'])[2]")
	@CacheLookup
	WebElement InDate;

	@FindBy(id="visitor_expected_time")
	@CacheLookup
	WebElement CheckInTime;

	@FindBy(xpath="")
	@CacheLookup
	WebElement Time;

	@FindBy(id="visitor_expected_last_date")
	@CacheLookup
	WebElement CheckOutDate;

	@FindBy(xpath="(//td[text()='27'])[2]")
	@CacheLookup
	WebElement OutDate;	

	@FindBy(xpath="//body[@class=\"cke_editable cke_editable_themed cke_contents_ltr\"]")
	@CacheLookup
	WebElement AdditionalNotes;	

	@FindBy(xpath="//*[@id=\"form_submit\"]/div/div[2]/div/div/div")
	@CacheLookup
	WebElement Submit6;

	
	
	
	
	
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

	public void clickMyRequest6()
	{
		btnMyRequest6.click();
	}

	public void clickMyServices6()
	{
		btnMyServices6.click();
	}

	public void clickSelectaService6()
	{
		SelectaService6.click();
	}

	public void clickVisitorRegistration()
	{
		VisitorRegistration6.click();
	}

	public void setVisitorName(String Name) 
	{
		VisitorName.sendKeys(Name);
	}

	public void setVisitorMobileno(String Mobileno )
	{
		VisitorMobileno.click();
		VisitorMobileno.sendKeys(Mobileno);
	}

	public void setVisitorEmail(String VEmail)
	{
		VisitorEmail.sendKeys(VEmail);
	}	

	public void ClickVisitorType()
	{
		VisitorType.click();
	}	

	public void ClickVisitor()
	{
		Visitor.click();
	}	

	public void ClickIdProof()
	{
		IdProof.sendKeys("C:\\Users\\Suvendu\\Downloads\\images.png");
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

	public void ClickUnitNumber()
	{
		UnitNumber.click();
	}

	public void ClickGateT35407()
	{
		GateT35407.click();
	}

	public void ClickCheckInDate()
	{
		CheckInDate.click();
	}

	public void ClickInDate()
	{
		InDate.click();
	}

	public void ClickCheckInTime()
	{
		CheckInTime.sendKeys("11:40");
	}

	public void ClickCheckOutDate()
	{
		CheckOutDate.click();
	}

	public void ClickOutDate()
	{
		OutDate.click();
	}	
    
	public void setAdditionalNotes(String text)
	{
		driver.switchTo().frame(0);
		AdditionalNotes.sendKeys(text);
		driver.switchTo().defaultContent();
	}


	public void ClickSubmit6()
	{
		Submit6.click();
	}	
}

