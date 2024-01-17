package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StorageBooking_pom_Tenant 
{
	public WebDriver driver;
	public StorageBooking_pom_Tenant (WebDriver driver1)
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
	

	@FindBy(xpath="//span[text()='My Building']")
	@CacheLookup
	WebElement MyBuilding;
	
	@FindBy(xpath="//span[text()='Gate & Arc']")
	@CacheLookup
	WebElement GateArc;
	
	@FindBy(xpath="//a[text()='Storage Booking']")
	@CacheLookup
	WebElement StorageBooking;
	
	@FindBy(xpath="(//a[text()='Book Now'])[1]")
	@CacheLookup
	WebElement BookNowStorage;
	
	@FindBy(id="months")
	@CacheLookup
	WebElement MonthStorage;
	
	@FindBy(id="storageMoveInDate")
	@CacheLookup
	WebElement StorageMoveInDate;
	
	@FindBy(xpath="//td[text()='25']")
	@CacheLookup
	WebElement StorageDate;
	
	
	@FindBy(id="description")
	@CacheLookup
	WebElement Description;
	
	@FindBy(xpath="//body/div[@id='wrapper']/div[@id='content-wrapper']/div[@id='content']/div[5]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[9]/div[1]/div[1]/label[1]")
	@CacheLookup
	WebElement Iacceptcheckbox;
	
	@FindBy(id="submit")
	@CacheLookup
	WebElement submitbtnn;
	

	@FindBy(id="creditCardNumber")
	@CacheLookup
	WebElement CardNumber;
	
	
	@FindBy(id="expiryMonthCreditCard")
	@CacheLookup
	WebElement ExpiryMonth;
	
	
	@FindBy(xpath="//option[text()='Dec (12)']")
	@CacheLookup
	WebElement Month;
	
	@FindBy(id="expiryYearCreditCard")
	@CacheLookup
	WebElement ExpiryYear;
	
	
	@FindBy(xpath="//option[text()='2029']")
	@CacheLookup
	WebElement Year;
	
	@FindBy(id="CVVNumberCreditCard")
	@CacheLookup
	WebElement Cvv;
	
	@FindBy(xpath="//span[text()='Make Payment']")
	@CacheLookup
	WebElement MakePayment;
	
	
	@FindBy(xpath="//input[@type='submit']")
	@CacheLookup
	WebElement Submitbtn;
	
	@FindBy(xpath="(//*[text()='Ok'])[2]")
	@CacheLookup
	WebElement OKbtn;
	
	@FindBy(xpath="//a[@class='btn btn-primary mt-2 mt-md-0']")
	@CacheLookup
	WebElement Downloadreceipt;
	
	
	@FindBy(id="icon")
	@CacheLookup
	WebElement DownloadArrow;
	
	
	
	
	
	
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

	public void clickMyBuilding1()
	{
		MyBuilding.click();
	}
	
	
	public void clickGateArc1()
	{
		GateArc.click();
	}
	
	public void clickStorageBooking()
	{
		StorageBooking.click();
	}
	
	public void clickBookNowStorage()
	{
		BookNowStorage.click();
	}
	
	public void setMonthStorage(String text)
	{
		MonthStorage.sendKeys(text);
	}
	
	public void clickStorageMoveInDate()
	{
		StorageMoveInDate.click();
	}
	
	public void clickStorageDate()
	{
		StorageDate.click();
	}
	
	public void setDescription(String text)
	{
		Description.sendKeys(text);
	}

	public void clickIacceptcheckbox()
	{
		Iacceptcheckbox.click();
	}
	
	
	public void clicksubmitbtnn()
	{
		submitbtnn.click();
	}
	
	public void setCardNumber(String text)
	{
		CardNumber.sendKeys(text);
	}

	public void clickExpiryMonth()
	{
		ExpiryMonth.click();
	}
	
	
	public void clickMonth()
	{
		Month.click();
	}

	
	public void clickExpiryYear()
	{
		ExpiryYear.click();
	}
	
	public void clickYear()
	{
		Year.click();
	}
	
	public void setCardCvv(String text)
	{
		Cvv.sendKeys(text);
	}
	
	
	public void clickonMakePayment()
	{
		MakePayment.click();
	}

	public void clickonSubmitbtn()
	{
		Submitbtn.click();
	}
	
	public void clickonOKbtnn()
	{
		OKbtn.click();
	}
	
	public void clickDownloadreceipt()
	{
		Downloadreceipt.click();
	}
	
	public void clickDownloadArrow()
	{
		DownloadArrow.click();
	}	
	
}
