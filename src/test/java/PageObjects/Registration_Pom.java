package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_Pom 
{

	
	public WebDriver driver;
	public Registration_Pom (WebDriver driver1)
	{
		driver=driver1;
		PageFactory.initElements(driver1, this);
	}
	
	
	
	@FindBy(xpath="//a[text()='Register']")
	@CacheLookup
	WebElement Register;
	
	public void clickRegister()
	{
		 Register.click();
	}
	
	@FindBy(xpath="//*[contains(text(),'I am a Tenant')]")
	@CacheLookup
	WebElement Tenant;
	
	public void clickTenant()
	{
		Tenant.click();
	}
	
	
	@FindBy(xpath="//*[text()='Next']")
	@CacheLookup
	WebElement Next_T;
	
	
	public void clickNext_T()
	{
		Next_T.click();
	}
	
	
	@FindBy(xpath="(//*[text()='Select Community'])[2]")
	@CacheLookup
	WebElement Community_T;
	
	@FindBy(xpath="(//*[text()=' Al Bandar '])[2]")
	@CacheLookup
	WebElement AlBandar_T;
	
	public void clickCommunity_T() throws InterruptedException
	{
		Community_T.click();
		Thread.sleep(2000);
		AlBandar_T.click();
	}

	
	
	@FindBy(xpath="(//*[text()='Select Precinct'])[2]")
	@CacheLookup
	WebElement Precinct_T;
	
	@FindBy(xpath="(//*[text()='Al Barza'])[2]")
	@CacheLookup
	WebElement AlBarza_T;
	
	public void clickPrecinct_T() throws InterruptedException
	{
		Precinct_T.click();
		Thread.sleep(2000);
		AlBarza_T.click();
	}
	
	
	@FindBy(xpath="(//*[@title='Select Unit Number'])[1]")
	@CacheLookup
	WebElement UnitNumber_T;
	
	@FindBy(xpath="(//*[text()='Al Barza - 1 - 01'])[2]")
	@CacheLookup
	WebElement AlBarza101_T;
	
	public void clickUnitNumber_T() throws InterruptedException
	{
		UnitNumber_T.click();
		Thread.sleep(2000);
		AlBarza101_T.click();
	}
	
	
	@FindBy(xpath="//*[text()='Next']")
	@CacheLookup
	WebElement Next_TT;
	
	public void clickNext_TT()
	{
		Next_TT.click();
	}
	
	
	
	
	@FindBy(id="adult")
	@CacheLookup
	WebElement Adult_T;
	
	public void setAdult_T(String string)
	{
		Adult_T.sendKeys(string);
	}
	
	
	@FindBy(id="name1")
	@CacheLookup
	WebElement FullName_T;
	
	public void setFullName_T(String string)
	{
		FullName_T.sendKeys(string);
	}
	
	@FindBy(id="contactNo")
	@CacheLookup
	WebElement ContactNumber_T;
	
	public void setContactNumber_T(String string)
	{
		ContactNumber_T.sendKeys(string);
	}
	
	
	@FindBy(id="pobox")
	@CacheLookup
	WebElement POBox_T;
	
	public void setPOBox_T(String string)
	{
		POBox_T.sendKeys(string);
	}
	
	
	
	@FindBy(id="email1")
	@CacheLookup
	WebElement EmailAddress_T;
	
	public void setEmailAddress_T(String string)
	{
		 EmailAddress_T.sendKeys(string);
	}
	
	
	@FindBy(xpath="(//*[text()='Select Nationality'])[2]")
	@CacheLookup
	WebElement Nationality_T;
	
	@FindBy(xpath="(//*[text()=' Afghan '])[2]")
	@CacheLookup
	WebElement Afghan_T;
	
	public void clickNationality_T() throws InterruptedException
	{
		Nationality_T.click();
		Thread.sleep(2000);
		Afghan_T.click();
		
	}
	
	

	
	
	@FindBy(xpath="//*[@title='Occupation of Resident 1']")
	@CacheLookup
	WebElement Occupation_T;
	
	@FindBy(xpath="(//*[text()='Legal professionals'])[2]")
	@CacheLookup
	WebElement Legalprofessional_T; 
	
	
	public void clickOccupation_T() throws InterruptedException
	{
		Occupation_T.click();
		Thread.sleep(2000);
		Legalprofessional_T.click();
	}
	

	
	@FindBy(xpath="//*[text()='Next']/..")
	@CacheLookup
	WebElement Next_TTTTT;
	
	public void clickNext_TTTTT()
	{
		Next_TTTTT.click();
	}
	
	@FindBy(id="emergencyName")
	@CacheLookup
	WebElement EName_TT;
	
	public void setEName_TT(String string)
	{
		EName_TT.sendKeys(string);
	}
	
	
	@FindBy(id="emergencyEmail")
	@CacheLookup
	WebElement EmailAddress_TT;
	
	public void setEmailAddress_TT(String string)
	{
		EmailAddress_TT.sendKeys(string);
	}
	
	
	@FindBy(id="emergencyNumber")
	@CacheLookup
	WebElement ContactNumber_TT;
	
	public void setContactNumber_TT(String string)
	{
		ContactNumber_TT.sendKeys(string);
	}
	
	
	@FindBy(xpath="(//*[text()='Select Emirate'])[2]")
	@CacheLookup
	WebElement EmirateofResidence_T;
	
	@FindBy(xpath="(//*[text()='Abu Dhabi'])[2]")
	@CacheLookup
	WebElement AbuDhabi_T;
	
	public void clickEmirateofResidence_T() throws InterruptedException
	{
		EmirateofResidence_T.click();
		Thread.sleep(2000);
		AbuDhabi_T.click();
	}
	
	
	
	@FindBy(xpath="//*[text()='Next']")
	@CacheLookup
	WebElement Next_TTTT;
	
	public void clickNext_TTTT()
	{
		Next_TTTT.click();
	}
	
	@FindBy(xpath="//*[text()='Yes, I would like to Move in ']")
	@CacheLookup
	WebElement Wouldyoulike_T;
	
	public void clickWouldyoulike_T()
	{
		Wouldyoulike_T.click();
	}
	
	
	@FindBy(name="tenancy_start_date")
	@CacheLookup
	WebElement TenancyStartDate_T;
	
	@FindBy(xpath="//*[text()='20']")
	@CacheLookup
	WebElement TSDate_T;
	
	public void clickTenancyStartDate_T() throws InterruptedException
	{
		TenancyStartDate_T.click();
		Thread.sleep(2000);
		TSDate_T.click();
	}
	
	
	@FindBy(name="tenancy_end_date")
	@CacheLookup
	WebElement TenancyEndDate_T;
	
	@FindBy(xpath="//*[text()='24']")
	@CacheLookup
	WebElement TEDate_T;
	
	public void clickTenancyEndDate_T() throws InterruptedException
	{
		TenancyEndDate_T.click();
		Thread.sleep(2000);
		TEDate_T.click();
	}
	
	@FindBy(name="confirm_move_in_date")
	@CacheLookup
	WebElement ConfirmedMoveinDate_T;
	
	@FindBy(xpath="//*[text()='22']")
	@CacheLookup
	WebElement CMDate_T;
	
	@FindBy(xpath="//*[text()='12:00 - 14:00']")
	@CacheLookup
	WebElement TimeSlot_T;
	
	public void clickConfirmedMoveinDate_T() throws InterruptedException
	{
		ConfirmedMoveinDate_T.click();
		Thread.sleep(2000);
		CMDate_T.click();
		Thread.sleep(2000);
		TimeSlot_T.click();
	}
	
	
	@FindBy(id="attach0")
	@CacheLookup
	WebElement IDProof_T;
	
	public void setIDProof_T(String string)
	{
		IDProof_T.sendKeys(string);
	}
	
	@FindBy(id="agreement")
	@CacheLookup
	WebElement Contract_T;
	
	public void setContract_T(String string)
	{
		Contract_T.sendKeys(string);
	}
	
	
	@FindBy(xpath="(//*[text()=' I accept Community '])[1]")
	@CacheLookup
	WebElement IacceptCommunity_T;
	
	public void clickIacceptCommunity_T()
	{
		IacceptCommunity_T.click();
	}
	
	@FindBy(xpath="//*[text()='Submit']")
	@CacheLookup
	WebElement Submit_T;
	
	public void clickSubmit_T()
	{
		Submit_T.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
