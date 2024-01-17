package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MoveOutRequestPage 
{

	public WebDriver driver;
	public MoveOutRequestPage(WebDriver driver1)
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
	WebElement btnMyRequest5;

	@FindBy(xpath="//span[text()='My Services']")
	@CacheLookup
	WebElement btnMyServices5;

	@FindBy(xpath="//div[text()='Select category']/../../..")
	@CacheLookup
	WebElement SelectaService5;
	
	@FindBy(xpath="(//a[text()='Ok'])[4]")
	@CacheLookup
	WebElement ok;
	
	@FindBy(xpath="(//span[text()='Move-out Request'])[1]")
	@CacheLookup
	WebElement MoveoutRequest;
	
	
	@FindBy(name="reasons_for_leaving")
	@CacheLookup
	WebElement reasonsforleaving;
	
	
	@FindBy(id="movingOutTo")
	@CacheLookup
	WebElement movingOutTo;
		

	@FindBy(id="furniture_moveout_date")
	@CacheLookup
	WebElement furnituremoveoutdate;
	
	
	@FindBy(xpath="(//td[text()='7'])[2]")
	@CacheLookup
	WebElement moveoutdate;
	
	
	@FindBy(name="furniture_time")
	@CacheLookup
	WebElement Preferredtime;
	
	
	
	@FindBy(id="preferred_date")
	@CacheLookup
	WebElement MoveoutdateKeyhandoverdate;
	
	
	@FindBy(xpath="//td[text()='25']")
	@CacheLookup
	WebElement handoverdate;
	
	@FindBy(name="time")
	@CacheLookup
	WebElement Pretime;
	
	
	
	
	@FindBy(xpath="//label[@class='accept_comm']")
	@CacheLookup
	WebElement TermsandConditions;
	
	
	@FindBy(name="submit")
	@CacheLookup
	WebElement btnSubmit5;
	
	
	
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

	public void clickMyRequest5()
	{
		btnMyRequest5.click();
	}

	public void clickMyServices5()
	{
		btnMyServices5.click();
	}

	public void clickSelectaService5()
	{
		SelectaService5.click();
	}

	public void clickMoveoutRequest()
	{
		MoveoutRequest.click();
	}
	
	
	public void clickok()
	{
		ok.click();
	}
	
	
	
	public void setreasonsforleaving(String text)
	{
		reasonsforleaving.sendKeys(text);
	}
	
	public void setmovingOutTo(String text)
	{
		movingOutTo.sendKeys(text);
	}
	
	public void clickfurnituremoveoutdate()
	{
		furnituremoveoutdate.click();
	}
	
	public void clickmoveoutdate()
	{
		moveoutdate.click();
	}
	
	
	public void setPreferredtime(String time)
	{
		Preferredtime.sendKeys(time);
	}
	
	
	
	
	public void clickMoveoutdateKeyhandoverdate()
	{
		MoveoutdateKeyhandoverdate.click();
	}
	
	public void clickhandoverdate()
	{
		handoverdate.click();
	}
	
	
	public void setPretime(String text)
	{
		Pretime.sendKeys(text);
	}
	
	
	
	public void clickTermsandConditions()
	{
		TermsandConditions.click();
	}
	
	public void clickbtnSubmit5()
	{
		btnSubmit5.click();
	}
	
	
}
