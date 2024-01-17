package PageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClassesOffering_Pom_Tenant 
{
	public WebDriver driver;
	public ClassesOffering_Pom_Tenant (WebDriver driver1)
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
	WebElement MyBuilding1;
	
	@FindBy(xpath="//span[text()='Gate & Arc']")
	@CacheLookup
	WebElement GateArc1;
	
	@FindBy(xpath="//a[text()='Classes & Offering']")
	@CacheLookup
	WebElement ClassesOffering1;
	
	@FindBy(xpath="(//a[text()='Book Now'])[1]")
	@CacheLookup
	WebElement BookNow;
	
	@FindBy(xpath="(//label[@class='custom-control-label'])[1]")
	@CacheLookup
	WebElement SelectYourPackage;
	
	@FindBy(xpath="(//label[@class='custom-control-label'])[2]")
	@CacheLookup
	WebElement SelectYourSchedule;
	
	@FindBy(id="id_unit")
	@CacheLookup
	WebElement UnitNumber;
	
	@FindBy(xpath="//option[contains(text(),'Gate - T3 - 5407')]")
	@CacheLookup
	WebElement SelectUnit;
	
	@FindBy(id="applicant_name0")
	@CacheLookup
	WebElement ApplicantName;
	
	@FindBy(id="applicant_age0")
	@CacheLookup
	WebElement ApplicantAge;

	@FindBy(id="submit")
	@CacheLookup
	WebElement PayBook;
	
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
		MyBuilding1.click();
	}
	
	
	public void clickGateArc1()
	{
		GateArc1.click();
	}
	
	public void clickClassesOffering1()
	{
		ClassesOffering1.click();
	}
	
	public void clickBookNow()
	{
		BookNow.click();
	}
	
	public void clickSelectYourPackage()
	{
		SelectYourPackage.click();
	}

	public void clickSelectYourSchedule()
	{
		SelectYourSchedule.click();
	}
	
	public void clickUnitNumber()
	{
		UnitNumber.click();
	}
	
	public void clickSelectUnit()
	{
		SelectUnit.click();
	}
	
	
	public void setApplicantName(String name)
	{
		ApplicantName.sendKeys(name);
	}
	
	public void setApplicantAge(String age)
	{
		ApplicantAge.sendKeys(age);
	}
	
	public void clickPayBook()
	{
		PayBook.click();
	}
	
	public void setCardNumber(String cardno)
	{
		CardNumber.sendKeys(cardno);
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
	
	public void setCvv(String cvv)
	{
		Cvv.sendKeys(cvv);
	}
	
	public void clickMakePayment() throws InterruptedException
	{
		MakePayment.click();
		Thread.sleep(4000);
	}
	
	public void clickSubmitbtn()
	{
		Submitbtn.click();
	}
	
	public void clickDownloadreceipt()
	{
		Downloadreceipt.click();
	}
	
	public void clickDownloadArrow()
	{
		String tab = driver.getWindowHandle();
		//driver.switchTo().window(tab);
		//driver.findElement(By.xpath());
       DownloadArrow.click();
	}
	
	
	
}
