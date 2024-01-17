package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MoveinWithinBuildingPage 
{

	public WebDriver driver;
	public MoveinWithinBuildingPage(WebDriver driver1)
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
	WebElement btnMyRequest4;

	@FindBy(xpath="//span[text()='My Services']")
	@CacheLookup
	WebElement btnMyServices4;

	@FindBy(xpath="//div[text()='Select category']/../../..")
	@CacheLookup
	WebElement SelectaService4;

	@FindBy(xpath="//span[text()='Move-in Within Building']")
	@CacheLookup
	WebElement MoveinWithinBuilding;
	
	@FindBy(xpath="//div[text()='Select Community']")
	@CacheLookup
	WebElement SelectCommunity4;
	
	@FindBy(xpath="//span[text()=' Gate & Arc ']")
	@CacheLookup
	WebElement GateArc;	

	@FindBy(xpath="//div[text()='Select Precinct']")
	@CacheLookup
	WebElement Precinct4;

	@FindBy(xpath="//span[text()='Arc Retail']")
	@CacheLookup
	WebElement ArcRetail;	

	@FindBy(xpath="//div[text()='Select Unit Number']")
	@CacheLookup
	WebElement UnitNumber4;

	@FindBy(xpath="(//span[text()='Arc Retail'])[2]")
	@CacheLookup
	WebElement Retail;
	
	@FindBy(xpath="//a[text()='Next']")
	@CacheLookup
	WebElement Next;
	
	@FindBy(id="adult")
	@CacheLookup
	WebElement Adult;
	
	
	@FindBy(xpath="//a[text()='Next']")
	@CacheLookup
	WebElement Nextbtn;
	
	@FindBy(xpath="//a[text()='Next']")
	@CacheLookup
	WebElement BtnNext;
	
	
	@FindBy(id="tsdate")
	@CacheLookup
	WebElement tsdate;
	
	@FindBy(xpath="//td[text()='15']")
	@CacheLookup
	WebElement Tstdate;
	
	
	@FindBy(xpath="//input[@id='tedate']")
	@CacheLookup
	WebElement tedate;
	
	//@FindBy(id="tedate")
	//@CacheLookup
	//WebElement tedate;
	
	@FindBy(xpath="//body[1]/div[17]/div[1]/table[1]/tbody[1]/tr[5]/td[6]")
	@CacheLookup
	WebElement Tendate;
	
	@FindBy(id="date")
	@CacheLookup
	WebElement Mndate;
	
	@FindBy(xpath="/html/body/div[17]/div[1]/table/tbody/tr[2]/td[3]")
	@CacheLookup
	WebElement Midate;
	
	@FindBy(name="time")
	@CacheLookup
	WebElement TimeSlot;
	
	
	
	@FindBy(xpath="//input[@id='attach0']")
	@CacheLookup
	WebElement IDProof;
	
	
	@FindBy(xpath="//input[@id='agreement']")
	@CacheLookup
	WebElement AgreementCopy;
	
	
	@FindBy(xpath="//label[text()=' I accept Community ']")
	@CacheLookup
	WebElement IacceptCommunity;
	
	
	@FindBy(xpath="//a[text()='Submit']")
	@CacheLookup
	WebElement SubmitBtn;
	
	
	
	
	
	
	
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

	public void clickMyRequest4()
	{
		btnMyRequest4.click();
	}

	public void clickMyServices4()
	{
		btnMyServices4.click();
	}

	public void clickSelectaService4()
	{
		SelectaService4.click();
	}

	public void clickMoveinWithinBuilding()
	{
		MoveinWithinBuilding.click();
	}
	
	public void clickSelectCommunity4()
	{
		SelectCommunity4.click();
		SelectCommunity4.click();
	}	
	
	public void clickGateArc()
	{
		GateArc.click();
	}	
	
	public void clickPrecinct4()
	{
		Precinct4.click();
		Precinct4.click();
	}	
	
	public void clickArcRetail()
	{
		ArcRetail.click();
	}	
	
	
	public void clickUnitNumber4()
	{
		UnitNumber4.click();
		UnitNumber4.click();
	}	
	
	public void clickRetail()
	{
		Retail.click();
	}	
	
	
	public void clickNext()
	{
		Next.click();
	}	
	
	public void setAdult(String text)
	{
		Adult.sendKeys(text);
	}
	
	public void clickNextbtn()
	{
		Nextbtn.click();
	}
	
	
	public void clickBtnNext()
	{
		BtnNext.click();
	}
	
	public void clicktsdate()
	{
		tsdate.click();
	}
	
	public void clickTstdate()
	{
		Tstdate.click();
	}
	
	
	public void clicktedate()
	{
		tedate.click();
	}
	
	public void clickTendate()
	{
		Tendate.click();
	}
	
	
	public void clickMndate()
	{
		Mndate.click();
	}
	
	public void clickMidate()
	{
		Midate.click();
	}
	
	public void setTimeSlot(String string)
	{
		TimeSlot.sendKeys(string);
	}
	
	
	public void setIDProof(String file)
	{
		//Actions a=new Actions(driver);
		//a.scrollToElement(IDProof);
		//Actions a=new Actions(driver);  
		//a.moveToElement(IDProof);
		IDProof.sendKeys(file);
	}
	
	
	public void setAgreementCopy(String string)
	{
		//Actions a=new Actions(driver);
		//a.scrollToElement(AgreementCopy);
		AgreementCopy.sendKeys(string);
	}
	
	
	public void clickIacceptCommunity()
	{
		IacceptCommunity.click();
	}
	
	public void clickSubmitBtn()
	{
		SubmitBtn.click();
	}
	
	
}
