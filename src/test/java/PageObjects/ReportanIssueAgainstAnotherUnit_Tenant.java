package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportanIssueAgainstAnotherUnit_Tenant 
{

	public WebDriver driver;
	public ReportanIssueAgainstAnotherUnit_Tenant(WebDriver driver1)
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
	

	@FindBy(xpath="//span[text()='Report An Issue']")
	@CacheLookup
	WebElement ReportanIssue;
	
	
	@FindBy(xpath="//div[text()='Select']/../../..")
	@CacheLookup
	WebElement SelectIssueType;
	
	
	@FindBy(xpath="//span[text()='Report an Issue Against Another Unit']")
	@CacheLookup
	WebElement ReportanIssueAgainstAnotherUnit;
	
	@FindBy(xpath="(//button[@class='btn dropdown-toggle btn-light'])[2]")
	@CacheLookup
	WebElement ComplaintCategory;
	
	
	@FindBy(xpath="//span[text()='Parking']")
	@CacheLookup
	WebElement Parking;
	
	@FindBy(xpath="//div[text()='Select Community']/../../..")
	@CacheLookup
	WebElement Community5;
	
	@FindBy(xpath="(//span[text()='Gate & Arc'])[2]")
	@CacheLookup
	WebElement GateArc5;
	
	
	@FindBy(xpath="//div[text()='Select Precinct']/../../..")
	@CacheLookup
	WebElement Precinct5;
	
	@FindBy(xpath="//span[text()='The Gate']")
	@CacheLookup
	WebElement TheGate5;
	
	@FindBy(xpath="//div[text()='Select Unit Number']/../../..")
	@CacheLookup
	WebElement UnitNumber5;
	
	
	@FindBy(xpath="//span[text()='Gate - T3 - 5407']")
	@CacheLookup
	WebElement GateT35407rc;
	
	@FindBy(id="file_atach")
	@CacheLookup
	WebElement image;

	@FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")
	@CacheLookup
	WebElement AdditionalNotes;
	
	@FindBy(name="submit")
	@CacheLookup
	WebElement subbtn5;
	
	
	
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

	public void clickReportanIssue()
	{
		ReportanIssue.click();
	}
	
	public void clickSelectIssueType()
	{
		SelectIssueType.click();
	}
	
	
	public void clickReportanIssueAgainstAnotherUnit()
	{
		ReportanIssueAgainstAnotherUnit.click();
	}
	
	
	public void clickComplaintCategory()
	{
		ComplaintCategory.click();
	}
	
	public void clickParking()
	{
		Parking.click();
	}
	
	public void clickCommunity5()
	{
		Community5.click();
	}
	
	public void clickGateArc5()
	{
		GateArc5.click();
	}
	
	public void clickPrecinct5()
	{
		Precinct5.click();
	}
	
	public void clickTheGate5()
	{
		TheGate5.click();
	}
	
	public void clickUnitNumber5()
	{
		UnitNumber5.click();
	}
	
	public void clickGateT35407rc()
	{
		GateT35407rc.click();
	}
	
	
	public void setimage(String img)
	{
		image.sendKeys(img);
	}
	
	public void setAdditionalNotes(String text)
	{
		driver.switchTo().frame(0);
		AdditionalNotes.sendKeys(text);
		driver.switchTo().defaultContent();
	}
	
	
	public void clicksubbtn5()
	{
		subbtn5.click();
	}
	
	
	
}
