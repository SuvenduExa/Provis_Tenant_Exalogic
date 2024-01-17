package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReportanIssueinCommonArea_Tenant 
{

	
	public WebDriver driver;
	public ReportanIssueinCommonArea_Tenant (WebDriver driver1)
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
	WebElement ReportanIssu;
	
	
	@FindBy(xpath="//div[text()='Select']/../../..")
	@CacheLookup
	WebElement SelectIssueTyp;
	
	
	@FindBy(xpath="//span[text()='Report an Issue in Common Area']")
	@CacheLookup
	WebElement ReportanIssueinCommonArea;
	
	
	@FindBy(xpath="//div[text()='Category']/../../..")
	@CacheLookup
	WebElement Category;
	
	@FindBy(xpath="//span[text()='Air Conditioning']")
	@CacheLookup
	WebElement AirConditioning;
	
	@FindBy(xpath="//div[text()='Sub Category']/../../..")
	@CacheLookup
	WebElement SubCategory;
	
	
	@FindBy(xpath="//span[text()='AC Defect']")
	@CacheLookup
	WebElement ACDefect;
	
	@FindBy(xpath="(//button[@class='btn dropdown-toggle bs-placeholder btn-light'])[3]")
	@CacheLookup
	WebElement Precinct6;
	
	
	@FindBy(xpath="//span[text()='Arc Retail']")
	@CacheLookup
	WebElement ArcRetail6;
	
	@FindBy(xpath="//div[text()='Select Floor']/../../..")
	@CacheLookup
	WebElement Floor;
	
	
	@FindBy(xpath="//span[text()='Retail - 02 - Ground Floor']")
	@CacheLookup
	WebElement Retail02;
	
	@FindBy(xpath="//div[text()='Select Common Area']/../../..")
	@CacheLookup
	WebElement CommonArea;
	
	
	@FindBy(xpath="//span[text()='Pizza Express']")
	@CacheLookup
	WebElement PizzaExpress;
	
	
	@FindBy(id="file_atach")
	@CacheLookup
	WebElement Photo;
	
	
	@FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")
	@CacheLookup
	WebElement Notes;
	
	@FindBy(name="submit")
	@CacheLookup
	WebElement btnsub;
	
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

	public void clickReportanIssu()
	{
		ReportanIssu.click();
	}
	
	public void clickSelectIssueTyp()
	{
		SelectIssueTyp.click();
	}
	
	
	public void clickReportanIssueinCommonArea()
	{
		ReportanIssueinCommonArea.click();
	}
	
	public void clickCategory()
	{
		Category.click();
	}
	
	
	public void clickAirConditioning()
	{
		AirConditioning.click();
	}
	
	public void clickSubCategory()
	{
		SubCategory.click();
	}
	
	public void clickACDefect()
	{
		ACDefect.click();
	}
	
	public void clickPrecinct6()
	{
		Precinct6.click();
	}
	
	public void clickArcRetail6()
	{
		ArcRetail6.click();
	}
	
	public void clickFloor()
	{
		Floor.click();
	}
	
	public void clickRetail02()
	{
		Retail02.click();
	}
	
	public void clickCommonArea()
	{
		CommonArea.click();
	}
	

	public void clickPizzaExpress()
	{
		PizzaExpress.click();
	}
	
	public void setPhoto(String img)
	{
		
		Photo.sendKeys(img);
	}
	
	public void setNotes(String text)
	{
		driver.switchTo().frame(0);
		Notes.sendKeys(text);
		driver.switchTo().defaultContent();
	}
	
	public void clickbtnsub()
	{
		btnsub.click();
	}
	
}
