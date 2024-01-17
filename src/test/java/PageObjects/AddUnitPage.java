package PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUnitPage
{

	public WebDriver driver;
	public AddUnitPage(WebDriver driver1)
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
	WebElement btnMyRequest2;

	@FindBy(xpath="//span[text()='My Services']")
	@CacheLookup
	WebElement btnMyServices2;

	@FindBy(xpath="//div[text()='Select category']/../../..")
	@CacheLookup
	WebElement SelectaService2;
	
	@FindBy(xpath="//span[text()='Add Unit']")
	@CacheLookup
	WebElement AddUnit;
	
	@FindBy(xpath = "//label[contains(@for,'tenUser')]")
	@CacheLookup
	WebElement RadioButton;
	
	@FindBy(xpath="//a[text()='Next']")
	@CacheLookup
	WebElement btnNext;

	@FindBy(xpath="(//button[contains(@data-id,'OMcommunity')])[1]")
	@CacheLookup
	WebElement SelectCommunity2;
	
	@FindBy(xpath="//span[text()=' Al Bandar ']")
	@CacheLookup
	WebElement AlBandar;
	
	@FindBy(xpath="(//button[contains(@title,'Select Precinct')])[1]")
	@CacheLookup
	WebElement SelectPrecinct2;
	
	@FindBy(xpath="(//span[text()='Al Barza'])[1]")
	@CacheLookup
	WebElement AlBarza;
	
	@FindBy(xpath="(//button[contains(@title,'Select Unit Number')])[1]")
	@CacheLookup
	WebElement SelectUnitNumber2;
	
	@FindBy(xpath="(//span[text()='Al Barza - 1 - 01'])[1]")
	@CacheLookup
	WebElement AlBarza101;
	
	@FindBy(xpath="//a[text()='Next']")
	@CacheLookup
	WebElement btnNextU;
	

	@FindBy(id="name1")
	@CacheLookup
	WebElement RName;

	@FindBy(id="contactNo")
	@CacheLookup
	WebElement ContactNumber;

	@FindBy(id="email1")
	@CacheLookup
	WebElement EmailAddress;

	@FindBy(xpath="(//div[@class='filter-option-inner-inner'])[8]")
	@CacheLookup
	WebElement btnOccupation;
	
	@FindBy(xpath="//span[text()='Legal professionals']")
	@CacheLookup
	WebElement Legal;
	
	@FindBy(xpath="//a[text()='Next']")
	@CacheLookup
	WebElement btnNextR;
	
	@FindBy(id="tsdate")
	@CacheLookup
	WebElement TenancyStartDate;

	@FindBy(xpath="//td[text()='22']")
	@CacheLookup
	WebElement TSDate;
	
	@FindBy(id="tedate")
	@CacheLookup
	WebElement TenancyEndDate ;

	@FindBy(xpath="(//td[text()='7'])[2]")
	@CacheLookup
	WebElement TEDate;
	
	@FindBy(xpath="//input[@id='attach0']")
	@CacheLookup
	WebElement IDProof;
	
	
	@FindBy(xpath="//input[@id='agreement']")
	@CacheLookup
	WebElement ContractCopy;
	
	
	@FindBy(xpath="//*[@id=\"form-total-p-4\"]/div/div[3]/div")
	@CacheLookup
	WebElement IacceptCommunity;
	
	@FindBy(xpath="//a[text()='Submit']")
	@CacheLookup
	WebElement btnSubmit;
	
	
	
	
	
	
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

	public void clickMyRequest1()
	{
		btnMyRequest2.click();
	}

	public void clickMyServices1()
	{
		btnMyServices2.click();
	}

	public void clickSelectaService1()
	{
		SelectaService2.click();
	}
	
	public void clickAddUnit()
	{
		AddUnit.click();
	}

	public void clickRadioButton()
	{
		RadioButton.click();
	}
	
	public void clickbtnNext()
	{
		btnNext.click();
	}
	
	public void clickSelectCommunity2()
	{
		SelectCommunity2.click();
		SelectCommunity2.click();
	}
	
	public void clickAlBandar()
	{
		AlBandar.click();
	}
	
	public void clickSelectPrecinct2()
	{
		SelectPrecinct2.click();
		SelectPrecinct2.click();
	}
	
	public void clickAlBarza()
	{
		AlBarza.click();
	}
	
	public void clickSelectUnitNumber2()
	{
		SelectUnitNumber2.click();
		SelectUnitNumber2.click();
	}
	
	public void clickAlBarza101()
	{
		AlBarza101.click();
	}
	
	public void clickbtnNextU()
	{
		btnNextU.click();
	}
	
	public void setRName(String Name) 
	{
		RName.clear();
		RName.sendKeys(Name);
	}

	public void setContactNumber(String Mobileno )
	{
		ContactNumber.clear();
		ContactNumber.sendKeys(Mobileno);
	}

	public void setEmailAddress(String VEmail)
	{
		EmailAddress.clear();
		EmailAddress.sendKeys(VEmail);
	}
	
	public void clickbtnOccupation()
	{
		btnOccupation.click();
		btnOccupation.click();
	}
	
	public void clickLegal()
	{
		Legal.click();
	}
	
	public void clickbtnNextR()
	{
		btnNextR.click();
	}
	
	public void clickTenancyStartDate()
	{
		TenancyStartDate.click();
	}
	
	public void clickTSDate()
	{
		TSDate.click();
	}
	
	public void clickTenancyEndDate()
	{
		TenancyEndDate.click();
	}
	
	public void clickTEDate() 
	{
		TEDate.click();
	}
	
	public void IDProof1()
	{
		//Actions a=new Actions(driver);
		//a.scrollToElement(IDProof);
		IDProof.sendKeys("C:\\Users\\Suvendu\\Downloads\\images.png");
	}	
	
	public void ContractCopy1() throws InterruptedException
	{
		ContractCopy.sendKeys("C:\\Users\\Suvendu\\Downloads\\images.png");
	   //Thread.sleep(5000);
	   //Actions a=new Actions(driver);
	   
	   //a.scrollToElement(ContractCopy);
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//label[text()=' Upload Contract / Agreement Copy ']")));
	   
		
//		File f=new File("C:\\Users\\Suvendu\\Downloads\\images.png");
//	   String absolute = f.getAbsolutePath();
//		ContractCopy.sendKeys(absolute);
	}	
		
	public void clickIacceptCommunity()
	{
		IacceptCommunity.click();
	}
	
	
	public void clickbtnSubmit()
	{
		btnSubmit.click();
	}	
}
