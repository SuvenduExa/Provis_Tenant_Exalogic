package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RateYourCommunityPreferences_Tenant 
{

	public WebDriver driver;
	public RateYourCommunityPreferences_Tenant(WebDriver driver1)
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
	WebElement MyBuilding4;
	
	@FindBy(xpath="//span[text()='Gate & Arc']")
	@CacheLookup
	WebElement GateArc4;
	
	
	@FindBy(xpath="//a[text()=' Rate Your Community Preferences ']")
	@CacheLookup
	WebElement Rateyourcommunitypreferences;
	
	
	@FindBy(xpath="//label[@for='rental_1']")
	@CacheLookup
	WebElement RentalPrice;
	
	
	@FindBy(xpath="//label[@for='rental_3']")
	@CacheLookup
	WebElement LeaseFlexibility;
	
	
	@FindBy(xpath="//label[@for='rental_5']")
	@CacheLookup
	WebElement MaintenanceStandards;

	
	@FindBy(xpath="//label[@for='rental_7']")
	@CacheLookup
	WebElement BuildingFacilities;
	
	
	@FindBy(xpath="//label[@for='rental_2']")
	@CacheLookup
	WebElement OfficeSize;
	
	@FindBy(xpath="//label[@for='rental_4']")
	@CacheLookup
	WebElement SurroundingArea;
	
	@FindBy(xpath="//label[@for='rental_6']")
	@CacheLookup
	WebElement CostofUtility;
	
	@FindBy(id="addSurveyBtn")
	@CacheLookup
	WebElement submit_button1;
	
	
	
	
	
	
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

	public void clickMyBuilding4()
	{
		MyBuilding4.click();
	}
	
	
	public void clickGateArc4()
	{
		GateArc4.click();
	}
	
	public void clickRateyourcommunitypreferences()
	{
		Rateyourcommunitypreferences.click();
	}
	
	
	public void clickRentalPrice()
	{
		RentalPrice.click();
	}
	
	public void clickLeaseFlexibility()
	{
		LeaseFlexibility.click();
	}
	
	
	public void clickMaintenanceStandards()
	{
		MaintenanceStandards.click();
	}
	
	public void clickBuildingFacilities()
	{
		BuildingFacilities.click();
	}
	
	public void clickOfficeSize()
	{
		OfficeSize.click();
	}
	
	public void clickSurroundingArea()
	{
		SurroundingArea.click();
	}
	
	
	public void clickCostofUtility()
	{
		CostofUtility.click();
	}
	
	public void clicksubmit_button1()
	{
		submit_button1.click();
	}
	
	
	
}
