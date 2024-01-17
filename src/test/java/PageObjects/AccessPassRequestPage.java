package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccessPassRequestPage
{
	public WebDriver driver;
	public AccessPassRequestPage(WebDriver driver1)
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

	//My Requests
	
	@FindBy(xpath="//span[contains(text(),'My Requests')]")
	@CacheLookup
	WebElement btnMyRequest1;
     
	//My Services
	@FindBy(xpath="//span[text()='My Services']")
	@CacheLookup
	WebElement btnMyServices1;
    
	//Click on Select a Service drop 
	@FindBy(xpath="//div[text()='Select category']/../../..")
	@CacheLookup
	WebElement SelectaService1;
	
	// select AccessPassRequest
	
	@FindBy(xpath="//span[text()='Access Pass Request']")
	@CacheLookup
	WebElement AccessPassRequest ;
	
	//Select Community
	@FindBy(xpath="//button[@title='Select Community']")
	@CacheLookup
	WebElement SelectCommunity1;
	
	@FindBy(xpath="(//span[text()='Gate & Arc'])[2]")
	@CacheLookup
	WebElement GateArc;
	
	// Select Precinct
	@FindBy(xpath="//button[contains(@title,'Select Precinct')]")
	@CacheLookup
	WebElement SelectPrecinct1;
	
	@FindBy(xpath="//span[text()='The Gate']")
	@CacheLookup
	WebElement TheGate;
	
	//SelectUnitNumber
	@FindBy(xpath="//body/div[@id='wrapper']/div[@id='content-wrapper']/div[@id='content']/div[5]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/button[1]")
	@CacheLookup
	WebElement SelectUnitNumber1;
	
	@FindBy(xpath="//span[text()='Gate - T3 - 5407']")
	@CacheLookup
	WebElement GateT35407;
	
	
	//Reason for Request
	//@FindBy(xpath="//label[@for='idCat_64']")
	//@CacheLookup
//	WebElement Damage;

	@FindBy(xpath="//input[@id='number_of_card']")
	@CacheLookup
	WebElement NumberofCards;
	
	//Reason for Request
		@FindBy(xpath="//label[@for='idCat_64']")
		@CacheLookup
		WebElement Damage;
	
	//Remarks
	@FindBy(xpath="//body[@class=\"cke_editable cke_editable_themed cke_contents_ltr\"]")
	@CacheLookup
	WebElement Remarks;
	
	//Terms and Conditions
	@FindBy(xpath="//label[@class='accept_comm']")
	@CacheLookup
	WebElement TermsandConditions;
	
	// Submit & Pay
	
	@FindBy(name="submit")
	@CacheLookup
	WebElement Submit1;
	
	
	
	
	
	
	
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

	public void clickMyRequest_100()
	{
		btnMyRequest1.click();
	}

	public void clickMyServices2()
	{
		btnMyServices1.click();
	}

	public void clickSelectaService2()
	{
		SelectaService1.click();
	}
	
	public void clickAccessPassRequest()
	{
		AccessPassRequest.click();
	}
	
	
	public void ClickSelectCommunity1()
	{
		SelectCommunity1.click();
	}
	
	public void clickGateArc()
	{
		GateArc.click();
	}
	
	
	public void ClickSelectPrecinct1()
	{
		SelectPrecinct1.click();
	}
	
	
	public void clickTheGate()
	{
		TheGate.click();
	}
	
	public void ClickSelectUnitNumber1()
	{
		SelectUnitNumber1.click();
	}
	
	public void clickGateT35407()
	{
		GateT35407.click();
	}
	
	public void SetDamage() throws InterruptedException
	{
		///Thread.sleep(2000);
		Damage.click();
		Thread.sleep(4000);
	}
	
	public void SetNumberofCards() throws InterruptedException
	{
	//Thread.sleep(3000);
		//NumberofCards.click();
		NumberofCards.sendKeys("2");
		
	}
	
	public void SetRemarks() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		Remarks.sendKeys("Testing");
		driver.switchTo().defaultContent();
	}
	
	public void SetTermsandConditions()
	{
		TermsandConditions.click();
	}
	
	public void ClickSubmit1()
	{
		Submit1.click();
	}
	
}


