//Provis

package StepDefinations;

import org.apache.log4j.Logger;
//import java.util.Properties;
import org.openqa.selenium.WebDriver;


import PageObjects.LoginPage;
import PageObjects.AccessPassRequestPage;
import PageObjects.AddUnitPage;
import PageObjects.AmenityBooking_pom_Tenant;
import PageObjects.ClassesOffering_Pom_Tenant;
import PageObjects.CommunityChat_pom_Tenant;
import PageObjects.DeliveryDisposalRequestPage;
import PageObjects.GeneralEnquiry_Tenant;
import PageObjects.MoveOutRequestPage;
import PageObjects.MoveinWithinBuildingPage;
import PageObjects.RateYourCommunityPreferences_Tenant;
import PageObjects.ReportanIssueAgainstAnotherUnit_Tenant;
import PageObjects.ReportanIssueinCommonArea_Tenant;
import PageObjects.StaroftheMonthNomination_Tenant;
import PageObjects.StorageBooking_pom_Tenant;
import PageObjects.VisitorRegistrationPage;


public class BaseClass
{
	public WebDriver driver;
	public LoginPage lp;
	public AccessPassRequestPage Ap;
	public AddUnitPage Ad;
	public DeliveryDisposalRequestPage Dp;
	public MoveinWithinBuildingPage Min;
	public MoveOutRequestPage Mo;
	public VisitorRegistrationPage Vr;
	public ClassesOffering_Pom_Tenant CO;
	public AmenityBooking_pom_Tenant AB;
	public StorageBooking_pom_Tenant SB;
	public CommunityChat_pom_Tenant CC;
	public StaroftheMonthNomination_Tenant SM;
	public RateYourCommunityPreferences_Tenant RC;
    public GeneralEnquiry_Tenant GE;
	public ReportanIssueAgainstAnotherUnit_Tenant RI;
	public ReportanIssueinCommonArea_Tenant RA;
	
	
	
	
	public static Logger logger;




}
