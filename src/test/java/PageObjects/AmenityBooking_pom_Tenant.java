package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmenityBooking_pom_Tenant 
{
	public WebDriver driver;
	public AmenityBooking_pom_Tenant (WebDriver driver1)
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
	WebElement MyBuilding2;
	
	@FindBy(xpath="//span[text()='Gate & Arc']")
	@CacheLookup
	WebElement GateArc2;
	
	@FindBy(xpath="//a[text()='Amenity Booking']")
	@CacheLookup
	WebElement AmenityBooking;
	
	@FindBy(xpath="(//a[text()='Book Now'])[6]")
	@CacheLookup
	WebElement NowBook;
	
	@FindBy(xpath="//*[@class='btn dropdown-toggle btn-light bs-placeholder']")
	@CacheLookup
	WebElement unitdropdown;
    
	
	@FindBy(xpath="(//*[@class='dropdown-item'])[5]")
	@CacheLookup
	WebElement unitno;
	
	@FindBy(id="check_in_date")
	@CacheLookup
	WebElement checkindate;
	
	@FindBy(xpath="(//*[text()='7'])[1]")
	@CacheLookup
	WebElement chkindate;
	
	@FindBy(xpath="(//*[@class='custom-input radio mb-2'])[1]")
	@CacheLookup
	WebElement slottime;
	
	@FindBy(xpath="//*[text()='I understand and agree with the Terms and Conditions mentioned herein.']")
	@CacheLookup
	WebElement Iunderstandandagree;
	
	@FindBy(xpath="(//*[text()='Ok'])[2]")
	@CacheLookup
	WebElement OKbtn;
	
	
	@FindBy(id="submit")
	@CacheLookup
	WebElement sbmtbtn;
	
	
	
	
	
	
	
	
	
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

	public void clickMyBuilding2()
	{
		MyBuilding2.click();
	}
	
	
	public void clickGateArc2()
	{
		GateArc2.click();
	}
	
	public void clickAmenityBooking()
	{
		AmenityBooking.click();
	}
	
	public void clickNowBook()
	{
		NowBook.click();
	}
	
	public void clickunitdropdown()
	{
		unitdropdown.click();
	}
	
	public void clickunitno()
	{
		unitno.click();
	}
	
	public void clickcheckindate()
	{
		checkindate.click();
	}
	
	public void clickchkindate()
	{
		chkindate.click();
	}
	
	
	public void clickslottime()
	{
		slottime.click();
	}
	
	
	public void clickIunderstandandagree()
	{
		Iunderstandandagree.click();
	}
	
	public void clickOKbtn()
	{
		OKbtn.click();
	}
	
	
	public void clicksbmtbtn()
	{
		sbmtbtn.click();
	}	
	
}
