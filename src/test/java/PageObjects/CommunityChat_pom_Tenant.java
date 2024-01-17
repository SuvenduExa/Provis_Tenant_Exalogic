package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommunityChat_pom_Tenant 
{

	public WebDriver driver;
	public CommunityChat_pom_Tenant(WebDriver driver1)
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
	
	@FindBy(xpath="//a[text()='Community Chat']")
	@CacheLookup
	WebElement CommunityChat;
	
	@FindBy(xpath="//*[@id=\"content\"]/div[5]/div[1]/div/div/div/div[1]/div[2]/a")
	@CacheLookup
	WebElement CreateCommunityPost;
	
	@FindBy(name="topic")
	@CacheLookup
	WebElement Title;

	@FindBy(xpath="//body[@class='cke_editable cke_editable_themed cke_contents_ltr']")
	@CacheLookup
	WebElement Description1;
	
	
	@FindBy(id="video_url")
	@CacheLookup
	WebElement videourl;
	
	@FindBy(id="inputImage")
	@CacheLookup
	WebElement UploadImage;
	
	
	@FindBy(name="submit")
	@CacheLookup
	WebElement SaveButton;

	
	
	
	
	
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
	
	public void clickCommunityChat()
	{
		CommunityChat.click();
	}
	
	public void clickCreateCommunityPost()
	{
		CreateCommunityPost.click();
	}
	
	public void setTitle(String text)
	{
		Title.sendKeys(text);
	}
	
	public void setDescription1(String text)
	{
		driver.switchTo().frame(0);
		Description1.sendKeys(text);
		driver.switchTo().defaultContent();
	}
	public void setvideourl(String url)
	{
		videourl.sendKeys(url);
	}
	
	public void setUploadImage(String pic)
	{
		UploadImage.sendKeys(pic);
	}
	
	public void clickSaveButton()
	{
		SaveButton.click();
	}
	
	
}
