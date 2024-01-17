package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StaroftheMonthNomination_Tenant 
{
	public WebDriver driver;
	public StaroftheMonthNomination_Tenant(WebDriver driver1)
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
	WebElement MyBuilding3;
	
	@FindBy(xpath="//span[text()='Gate & Arc']")
	@CacheLookup
	WebElement GateArc3;
	
	
	@FindBy(xpath="//a[text()='Star Of The Month Nomination']")
	@CacheLookup
	WebElement StaroftheMonthNomination;
	

	@FindBy(id="employee")
	@CacheLookup
	WebElement Employee;
	
	
	@FindBy(xpath="//button[@class='btn dropdown-toggle btn-light bs-placeholder']")
	@CacheLookup
	WebElement Department;
	
	@FindBy(xpath="//span[text()='Administration']")
	@CacheLookup
	WebElement Administration ;
	
	
	@FindBy(xpath="//*[@class='cke_editable cke_editable_themed cke_contents_ltr']")
	@CacheLookup
	WebElement ReasonforNomination ;
	
	
	@FindBy(name="submit")
	@CacheLookup
	WebElement submitt_button;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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

	public void clickMyBuilding3()
	{
		MyBuilding3.click();
	}
	
	
	public void clickGateArc3()
	{
		GateArc3.click();
	}
	
	public void clickStaroftheMonthNomination()
	{
		StaroftheMonthNomination.click();
	}
	
	public void setEmployee(String text)
	{
		
		Employee.sendKeys(text);
	}
	
	public void clickDepartment()
	{
		Department.click();
	}
	
	public void clickAdministration()
	{
		Administration.click();
	}
	
	
	public void setReasonforNomination(String text)
	{
		driver.switchTo().frame(0);
		ReasonforNomination.sendKeys(text);
		driver.switchTo().defaultContent();
	}
	
	
	public void clicksubmitt_button()
	{
		submitt_button.click();
	}
	
}
