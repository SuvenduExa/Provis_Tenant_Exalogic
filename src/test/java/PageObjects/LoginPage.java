package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	public WebDriver driver;
	public LoginPage(WebDriver driver1)
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

	@FindBy(id="userDropdown")
	@CacheLookup
	WebElement btnProfile;

	@FindBy(xpath="(//a[contains(@class,'dropdown-item')])[4]")
	@CacheLookup
	WebElement btnLogout;

	@FindBy(xpath="//a[text()='Logout']/..")
	@CacheLookup
	WebElement btnLogout1;




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

	public void clickProfile()
	{
		btnProfile.click();
	}

	public void clickLogout()
	{
		btnLogout.click();
	}

	public void clickLogout1()
	{
		btnLogout1.click();
	}
}
