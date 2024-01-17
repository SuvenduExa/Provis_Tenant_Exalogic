//Provis

package StepDefinations;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import PageObjects.AccessPassRequestPage;
import PageObjects.AddUnitPage;
import PageObjects.AmenityBooking_pom_Tenant;
import PageObjects.ClassesOffering_Pom_Tenant;
import PageObjects.CommunityChat_pom_Tenant;
import PageObjects.DeliveryDisposalRequestPage;
import PageObjects.GeneralEnquiry_Tenant;
import PageObjects.LoginPage;
import PageObjects.MoveOutRequestPage;
import PageObjects.MoveinWithinBuildingPage;
import PageObjects.RateYourCommunityPreferences_Tenant;
import PageObjects.ReportanIssueAgainstAnotherUnit_Tenant;
import PageObjects.ReportanIssueinCommonArea_Tenant;
import PageObjects.StaroftheMonthNomination_Tenant;
import PageObjects.StorageBooking_pom_Tenant;
import PageObjects.VisitorRegistrationPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;




public class Steps extends BaseClass {


	@Before
	public void setup() throws IOException
	{

		logger=Logger.getLogger("Provis");//Added logger
		PropertyConfigurator.configure("log4j.properties");//Added logger


		//Reading properties

		Properties configProp = new Properties();
		FileInputStream configPropfile=new FileInputStream("config.properties");
		configProp.load(configPropfile);




		String br=configProp.getProperty("browser");

		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",configProp.getProperty("chromepath") );
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(options);
		}
		else if(br.equals("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver",configProp.getProperty("firefoxpath") );	
			driver=new FirefoxDriver();
		}

		else if(br.equals("ie")) 
		{
			System.setProperty("webdriver.ie.driver",configProp.getProperty("iepath") );	
			driver=new InternetExplorerDriver();
		}
		
		else if(br.equals("msedge")) 
		{
			System.setProperty("webdriver.edge.driver",configProp.getProperty("msedgepath") );	
			driver=new EdgeDriver();
		} 
		
		/*EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		EdgeDriver driver = new EdgeDriver(options);
       */
		logger.info("************* Launching browser**************");	
	}


	//Login Page Feature

	@Given("User launches browser")
	public void user_launches_browser()
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		lp=new LoginPage(driver);
		Ap=new AccessPassRequestPage(driver);
		Ad=new AddUnitPage(driver);
		Dp=new DeliveryDisposalRequestPage(driver);
		Min=new MoveinWithinBuildingPage(driver);
		Mo=new MoveOutRequestPage(driver);
		Vr=new VisitorRegistrationPage(driver);
		CO=new ClassesOffering_Pom_Tenant(driver);
		AB=new AmenityBooking_pom_Tenant(driver);
		SB=new StorageBooking_pom_Tenant(driver);
		CC=new CommunityChat_pom_Tenant(driver);
		SM=new StaroftheMonthNomination_Tenant(driver);
		RC=new RateYourCommunityPreferences_Tenant(driver);
		GE=new GeneralEnquiry_Tenant(driver);
		RI=new ReportanIssueAgainstAnotherUnit_Tenant(driver);
		RA=new ReportanIssueinCommonArea_Tenant(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) 
	{
		driver.get(url);
	}

	@When("User enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) 
	{
		lp.setUserName(email);
		lp.setPassword(password);
	}

	@When("Click on login")
	public void click_on_login() 
	{
		lp.clickLogin();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String string) 
	{
		if(driver.getPageSource().contains("Invalid Username or Password"))
		{
			driver.close();
			Assert.assertTrue(false);  
		}
		else
		{
			Assert.assertEquals(driver.getTitle(),"Provis");
		}	   
	}

	@Then("user click on close")
	public void user_click_on_close() 
	{
		lp.clickClose();
	}

	@Then("user click on account")
	public void user_click_on_account() 
	{
		lp.clickProfile(); 
	}

	@When("user click on logout")
	public void user_click_on_logout() 
	{
		lp.clickLogout();
		lp.clickLogout1();
	}

	@Then("Page2 title should be {string}")
	public void page2_title_should_be(String string)
	{
		Assert.assertEquals(driver.getTitle(),"Login to Provis");

	}

	@When("close browser")
	public void close_browser() {
		logger.info("************* Closing Browswer*******************");
		driver.quit();
	}



	//////////////Tenant My Request -> My Services  ///////////////////////////////////

	/// Access Pass Request ///


	@Then("click on MyRequest for AccessPassRequest")
	public void click_on_MyRequest_for_AccessPassRequest() 
	{
		Ap.clickMyRequest_100();
	}

	@Then("click on MyService on AccessPassRequest")
	public void click_on_MyService_on_AccessPassRequest()
	{
		Ap.clickMyServices2();
	}

	@Then("click on Service drop down on AccessPassRequest")
	public void click_on_Service_drop_down_on_AccessPassRequest() 
	{
		Ap.clickSelectaService2();
	}

	@Then("click on AccessPassRequest under Select a Service drop down")
	public void click_on_access_pass_request_under_select_a_service_drop_down() throws InterruptedException 
	{
		Ap.clickAccessPassRequest();
		Thread.sleep(2000);	
	}

	@Then("Click on Community drop down under AccessPassRequest")
	public void click_on_community_drop_down_under_access_pass_request() throws InterruptedException 
	{
		Ap.ClickSelectCommunity1();
		Thread.sleep(2000);	
	}

	@Then("Select any one option Under Community on AccessPassRequest")
	public void select_any_one_option_under_community_on_access_pass_request() throws InterruptedException 
	{
		Ap.clickGateArc();
		Thread.sleep(2000);	
	}

	@Then("Click on Precinct drop down on AccessPassRequest")
	public void click_on_precinct_drop_down_on_access_pass_request() throws InterruptedException 
	{
		Ap.ClickSelectPrecinct1();
		Thread.sleep(2000);
	}

	@Then("Select any one option under precinct on AccessPassRequest")
	public void select_any_one_option_under_precinct_on_access_pass_request() throws InterruptedException 
	{
		Ap.clickTheGate();
		Thread.sleep(2000);
	}

	@Then("Click on Unit Number drop down on AccessPassRequest")
	public void click_on_unit_number_drop_down_on_access_pass_request() throws InterruptedException
	{
		Ap.ClickSelectUnitNumber1();
		Thread.sleep(2000);
	}

	@Then("Select any one option under unit number on AccessPassRequest")
	public void select_any_one_option_under_unit_number_on_access_pass_request() throws InterruptedException 
	{
		Ap.clickGateT35407();
		Thread.sleep(2000);
	}
	@Then("click on Reason for Request")
	public void click_on_reason_for_request() throws InterruptedException 
	{
		Thread.sleep(4000);
		Ap.SetDamage();
		Thread.sleep(2000);
	}

	@Then("Enter Number of Cards")
	public void enter_number_of_cards() throws InterruptedException 
	{
		Ap.SetNumberofCards();
		Thread.sleep(2000);
	}



	@Then("Enter Remarks")
	public void enter_remarks() throws InterruptedException 
	{
		//driver.switchTo().frame(0);
		//Thread.sleep(2000);
		Ap.SetRemarks(); 
	}



	@Then("Click on Terms and Condition")
	public void click_on_terms_and_condition() throws InterruptedException 
	{
		//Thread.sleep(2000);
		Ap.SetTermsandConditions();

	}



	@Then("Click on Submit&Pay")
	public void click_on_submit_pay() 
	{
		Ap.ClickSubmit1();
	}





	/////////// Add Unit ///////////////////////////////////////


	@Then("User click on My Request on AddUnit")
	public void user_click_on_My_Request_on_AddUnit() 
	{
		Ad.clickMyRequest1();
	}

	@Then("User Click on My Service on AddUnit")
	public void user_Click_on_My_Service_on_AddUnit() 
	{
		Ad.clickMyServices1();
	}

	@Then("User click on Select a Service drop down on AddUnit")
	public void user_click_on_Select_a_Service_drop_down_on_AddUnit() 
	{
		Ad.clickSelectaService1();
	} 

	@Then("click on Add Unit under Select a Service drop down on AddUnit")
	public void click_on_Add_Unit_under_Select_a_Service_drop_down_on_AddUnit() 
	{
		Ad.clickAddUnit();
	}

	@Then("click on I am a Tenant radio button under User Type page")
	public void click_on_i_am_a_tenant_radio_button_under_user_type_page() throws InterruptedException 
	{
		Thread.sleep(2000);
		Ad.clickRadioButton();
	}

	@Then("click on Next button under user Type page")
	public void click_on_next_button_under_user_type_page() 
	{
		Ad.clickbtnNext();
	}

	@Then("click on Community drop down under unit Details page")
	public void click_on_community_drop_down_under_unit_details_page() throws InterruptedException 
	{
		Thread.sleep(2000);
		Ad.clickSelectCommunity2();
	}

	@Then("Select any one option in Community under unit Details page")
	public void select_any_one_option_in_community_under_unit_details_page() throws InterruptedException
	{
		Thread.sleep(2000);
		Ad.clickAlBandar();
	}

	@Then("Click on Precinct Building drop down under unit Details page")
	public void click_on_Precinct_Building_drop_down_under_unit_Details_page() throws InterruptedException 
	{
		Thread.sleep(2000);
		Ad.clickSelectPrecinct2();
	}

	@Then("Select any one option under precinct on unit Details page")
	public void select_any_one_option_under_precinct_on_unit_details_page() throws InterruptedException 
	{
		Thread.sleep(1000);
		Ad.clickAlBarza();
	}

	@Then("Click on Unit Number drop down under unit Details page")
	public void click_on_unit_number_drop_down_under_unit_details_page() throws InterruptedException
	{
		Thread.sleep(2000);
		Ad.clickSelectUnitNumber2();
	}

	@Then("Select any one option under unit number on unit Details page")
	public void select_any_one_option_under_unit_number_on_unit_details_page() throws InterruptedException
	{
		Thread.sleep(1000);
		Ad.clickAlBarza101();
	}

	@Then("User Clicks on next button in unit Details page")
	public void user_clicks_on_next_button_in_unit_details_page() 
	{
		Ad.clickbtnNextU();
	}

	@Then("Enter Name on Resident Details page {string}")
	public void enter_name_on_resident_details_page(String name)
	{
		Ad.setRName(name);
	}

	@Then("Enter Contact Number on Resident Details page {string}")
	public void enter_contact_number_on_resident_details_page(String mobileno)
	{
		Ad.setContactNumber(mobileno);
	}

	@Then("Enter Email Address on Resident Details page {string}")
	public void enter_email_address_on_resident_details_page(String email) 
	{
		Ad.setEmailAddress(email);
	}

	@Then("Click on Occupation drop down on Resident Details page")
	public void click_on_occupation_drop_down_on_resident_details_page() throws InterruptedException 
	{
		Thread.sleep(2000);
		Ad.clickbtnOccupation();
	}

	@Then("Select any one option under Occupation drop down on Resident Details page")
	public void select_any_one_option_under_occupation_drop_down_on_resident_details_page() 
	{
		Ad.clickLegal();
	}

	@Then("click on Next button under Resident Details page")
	public void click_on_next_button_under_resident_details_page() 
	{
		Ad.clickbtnNextR();
	}

	@Then("Click on Tenancy Start Date on occupancy Details pag")
	public void click_on_tenancy_start_date_on_occupancy_details_pag() 
	{
		Ad.clickTenancyStartDate();
	}

	@Then("Click any Date from Tenancy Start Date")
	public void click_any_date_from_tenancy_start_date() 
	{
		Ad.clickTSDate();
	}

	@Then("Click on Tenancy End Date on occupancy Details pag")
	public void click_on_tenancy_end_date_on_occupancy_details_pag() 
	{
		Ad.clickTenancyEndDate();
	}

	@Then("Click any Date from Tenancy End Date")
	public void click_any_date_from_tenancy_end_date() throws InterruptedException 
	{
		Ad.clickTEDate();
	}

	@Then("Upload ID Proof")
	public void upload_id_proof() throws InterruptedException 
	{
		Thread.sleep(2000);
		Ad.IDProof1();
	}

	@Then("Upload Contract  Agreement Copy")
	public void upload_contract_agreement_copy() throws InterruptedException, AWTException
	{	
		Thread.sleep(2000);
		Ad.ContractCopy1();
	}

	@Then("Click on Rules and Regulations")
	public void click_on_rules_and_regulations() 
	{
		Ad.clickIacceptCommunity();
	}

	@Then("sClick on Submit under occupancy Details page")
	public void s_click_on_submit_under_occupancy_details_page() 
	{
		Ad.clickbtnSubmit();
	}









	///////////////// Delivery Disposal Request ////////////


	@Then("Click on myrequest on DeliveryDisposalRequest")
	public void click_on_myrequest_on_delivery_disposal_request()
	{
		Dp.clickMyRequest();
	}

	@Then("click on myservice on DeliveryDisposalRequest")
	public void click_on_myservice_on_delivery_disposal_request()
	{
		Dp.clickMyServices();
	}

	@Then("click on SelectaService dropdown on DeliveryDisposalRequest")
	public void click_on_selecta_service_dropdown_on_delivery_disposal_request()
	{
		Dp.clickSelectaService();
	}

	@Then("click on DeliveryDisposalRequest")
	public void click_on_delivery_disposal_request() 
	{
		Dp.clickDeliveryDisposalRequest();
	}

	@Then("Click on Community drop down under DeliveryDisposalRequest")
	public void click_on_community_drop_down_under_delivery_disposal_request() 
	{
		Dp.ClickCommunity();
	}

	@Then("Click any one Community under DeliveryDisposalRequest")
	public void click_any_one_community_under_delivery_disposal_request()
	{
		Dp.ClickGateArc();
	}

	@Then("Click on Precinct drop down under DeliveryDisposalRequest")
	public void click_on_precinct_drop_down_under_delivery_disposal_request() 
	{
		Dp.ClickPrecinct();
	}

	@Then("Click any one Precinct under DeliveryDisposalRequest")
	public void click_any_one_precinct_under_delivery_disposal_request() 
	{
		Dp.ClickTheGate();
	}

	@Then("Click on Unit Number drop down under DeliveryDisposalRequest")
	public void click_on_unit_number_drop_down_under_delivery_disposal_request() 
	{

		Dp.ClickUnitNumber();

	}

	@Then("Click any one Unit Number under DeliveryDisposalRequest")
	public void click_any_one_unit_number_under_delivery_disposal_request() 
	{
		Dp.ClickGateT35407();
	}

	@Then("Click on Type of Request under DeliveryDisposalRequest")
	public void click_on_type_of_request_under_delivery_disposal_request() 
	{
		Dp.ClickTypeofRequest();
	}

	@Then("Click any one Type of Request under DeliveryDisposalRequest")
	public void click_any_one_type_of_request_under_delivery_disposal_request()
	{
		Dp.ClickDeliveryoption();
	}

	@Then("Enter Number of Items under DeliveryDisposalRequest")
	public void enter_number_of_items_under_delivery_disposal_request() 
	{
		Dp.Clicknumberofitems();
	}

	@Then("Enter Items Description under DeliveryDisposalRequest {string}")
	public void enter_items_description_under_delivery_disposal_request(String text)
	{
		Dp.ItemsDescription(text);
	}

	@Then("Click on DeliveryDisposal Date and select a date")
	public void click_on_delivery_disposal_date_and_select_a_date() throws InterruptedException 
	{
		Dp.Clickdisposaldate();

		Thread.sleep(2000);

		Dp.Clickdisdate();
	}

	@Then("Enter Contact Person Name {string}")
	public void enter_contact_person_name(String name)
	{
		Dp.setContactPersonName(name);
	}

	@Then("Enter Contact Person Number {string}")
	public void enter_contact_person_number(String mobileno) 
	{
		Dp.setContactPersonNumber(mobileno);
	}

	@Then("Enter Submit button")
	public void enter_submit_button() 
	{
		Dp.ClickSubmitbtn();
	}





	/////////////// Move in Within Building ////////////////////////////////////


	@Then("click on myRequest on MoveinWithinBuilding")
	public void click_on_myRequest_on_MoveinWithinBuilding() 
	{
		Min.clickMyRequest4();
	}

	@Then("Click on myservice on MoveinWithinBuilding")
	public void click_on_myservice_on_MoveinWithinBuilding() 
	{
		Min.clickMyServices4();
	}

	@Then("Click on service dropdown on MoveinWithinBuilding")
	public void click_on_service_dropdown_on_MoveinWithinBuilding()
	{
		Min.clickSelectaService4();
	}

	@Then("Click on MoveinWithinBuilding under Select a Service drop down")
	public void click_on_movein_within_building_under_select_a_service_drop_down() 
	{
		Min.clickMoveinWithinBuilding();
	}

	@Then("Click on Community drop down under MoveinWithinBuilding")
	public void click_on_community_drop_down_under_movein_within_building() 
	{
		Min.clickSelectCommunity4();
	}

	@Then("Select any one option Under Community on MoveinWithinBuilding")
	public void select_any_one_option_under_community_on_movein_within_building()
	{
		Min.clickGateArc();
	}

	@Then("Click on Precinct drop down on MoveinWithinBuilding")
	public void click_on_precinct_drop_down_on_movein_within_building() 
	{
		Min.clickPrecinct4();
	}

	@Then("Select any one option under precinct on MoveinWithinBuilding")
	public void select_any_one_option_under_precinct_on_movein_within_building() 
	{
		Min.clickArcRetail();
	}

	@Then("Click on Unit Number drop down on MoveinWithinBuilding")
	public void click_on_unit_number_drop_down_on_movein_within_building() 
	{
		Min.clickUnitNumber4();
	}

	@Then("Select any one option under unit number on MoveinWithinBuilding")
	public void select_any_one_option_under_unit_number_on_movein_within_building() 
	{
		Min.clickRetail();
	}

	@Then("click on next btn")
	public void click_on_next_btn() 
	{
		Min.clickNext();
	}

	@Then("Enter number of Adults {string}")
	public void enter_number_of_adults(String string) 
	{
		Min.setAdult(string);
	}

	@Then("Click on NextButton")
	public void click_on_next_button()
	{
		Min.clickNextbtn();
	}

	@Then("click on Next button on Emergency Contact page")
	public void click_on_next_button_on_emergency_contact_page() 
	{
		Min.clickBtnNext();
	}

	@Then("Click on Tenancy Start Date on Occupancy Details page")
	public void click_on_tenancy_start_date_on_occupancy_details_page() 
	{
		Min.clicktsdate();
	}

	@Then("Select one date in Tenancy Start Date")
	public void select_one_date_in_tenancy_start_date() 
	{
		Min.clickTstdate();
	}

	@Then("Click on Tenancy End Date on Occupancy Details page")
	public void click_on_tenancy_end_date_on_occupancy_details_page() 
	{
		Min.clicktedate();
	}

	@Then("Select one date in Tenancy End Date")
	public void select_one_date_in_tenancy_end_date() 
	{
		Min.clickTendate();
	}

	@Then("Click on Confirmed Move-in Date on Occupancy Details page")
	public void click_on_confirmed_move_in_date_on_occupancy_details_page() throws InterruptedException 
	{
		Min.clickMndate();
		Thread.sleep(2000);
	}

	@Then("Select one date in Confirmed Move-in Date")
	public void select_one_date_in_confirmed_move_in_date() 
	{
		Min.clickMidate();
	}

	@Then("Enter Time Slot for Lift Booking {string}")
	public void enter_time_slot_for_lift_booking(String string) 
	{
		Min.setTimeSlot(string);
	}

	@Then("give your ID Proofs {string}")
	public void give_your_id_proofs(String string) 
	{
		Min.setIDProof(string);
	}

	@Then("give your Contract Agreement Copy {string}")
	public void give_your_contract_agreement_copy(String string) 
	{
		Min.setAgreementCopy(string);
	}

	@Then("click on Rules and Regulations check box")
	public void click_on_rules_and_regulations_check_box() 
	{
		Min.clickIacceptCommunity();
	}

	@Then("Click on SubmitButtn")
	public void click_on_submit_buttn()
	{
		Min.clickSubmitBtn();
	}











	////////////////////////////////// Move Out Request //////////////////////////


	@Then("Click  myrequest on Move Out Request")
	public void click_myrequest_on_Move_Out_Request()
	{
		Mo.clickMyRequest5();
	}

	@Then("click  myservice on Move Out Request")
	public void click_myservice_on_Move_Out_Request() 
	{
		Mo.clickMyServices5();
	}

	@Then("click  SelectaService dropdown on Move Out Request")
	public void click_SelectaService_dropdown_on_Move_Out_Request()
	{
		Mo.clickSelectaService5();
	}


	@Then("click  Move Out Request")
	public void click_move_out_request() 
	{
		Mo.clickMoveoutRequest();
	}

	@Then("Click on Ok button")
	public void click_on_ok_button() 
	{
		Mo.clickok();
	}


	@Then("Enter Reasons for Leaving {string}")
	public void enter_reasons_for_leaving(String text) 
	{
		Mo.setreasonsforleaving(text);
	}

	@Then("Enter Location you are moving to {string}")
	public void enter_location_you_re_moving_to(String string)
	{
		Mo.setmovingOutTo(string);
	}

	@Then("Click on Furniture Move out Date")
	public void click_on_furniture_move_out_date() 
	{
		Mo.clickfurnituremoveoutdate();
	}

	@Then("Select move out Date")
	public void select_move_out_date() 
	{
		Mo.clickmoveoutdate();
	}

	@Then("Enter Preferred time {string}")
	public void enter_preferred_time(String string) 
	{
		Mo.setPreferredtime(string);
	}


	@Then("Click on Move out date Key handover date")
	public void click_on_move_out_date_key_handover_date() 
	{
		Mo.clickMoveoutdateKeyhandoverdate();
	}

	@Then("Select one date on Move out date Key handover date")
	public void select_one_date_on_move_out_date_key_handover_date() 
	{
		Mo.clickhandoverdate();
	}

	@Then("Enter Preferred time under handover date {string}")
	public void enter_preferred_time_under_handover_date(String string) 
	{
		Mo.setPretime(string);
	}


	@Then("Click on TERMS AND CONDITIONS")
	public void click_on_terms_and_conditions() 
	{
		Mo.clickTermsandConditions();
	}

	@Then("Click on Submit buton")
	public void click_on_submit_buton() 
	{
		Mo.clickbtnSubmit5();
	}







	/////////////////////////////// Visitor Registration //////////////////////




	@Then("click on My Request on VisitorRegistration")
	public void click_on_my_request_on_visitor_registration() 
	{
		Vr.clickMyRequest6();
	}

	@Then("Click on My Service on VisitorRegistration")
	public void click_on_my_service_on_visitor_registration() 
	{
		Vr.clickMyServices6();
	}

	@Then("click on Select a Service drop down on VisitorRegistration")
	public void click_on_select_a_service_drop_down_on_visitor_registration()
	{
		Vr.clickSelectaService6();
	}


	@Then("click on Visitor Registration")
	public void click_on_visitor_registration() 
	{
		Vr.clickVisitorRegistration();
	}

	@Then("Enter Visitor Name {string}")
	public void enter_visitor_name(String Name)
	{
		Vr.setVisitorName(Name);
	}

	@Then("Enter Visitor Mobile Number {string}")
	public void enter_visitor_mobile_number(String Mobileno)
	{
		Vr.setVisitorMobileno(Mobileno);
	}

	@Then("Enter Visitor Email {string}")
	public void enter_visitor_email(String VEmail) 
	{
		Vr.setVisitorEmail(VEmail);
	}

	@Then("Click on Visitor Type drop down")
	public void click_on_visitor_type_drop_down() 
	{
		Vr.ClickVisitorType();
	}

	@Then("click any one option on Visitor Type drop down")
	public void click_any_one_option_on_visitor_type_drop_down() 
	{
		Vr.ClickVisitor();
	}

	@Then("Click on Choose button on Visitor ID Proof")
	public void click_on_choose_button_on_visitor_id_proof()
	{
		Vr.ClickIdProof();
	}


	@Then("Click on Community drop down")
	public void click_on_community_drop_down() 
	{
		Vr.ClickCommunity();
	}

	@Then("Click any one Community")
	public void click_any_one_community() 
	{
		Vr.ClickGateArc();
	}

	@Then("Click on Precinct drop down")
	public void click_on_precinct_drop_down() 
	{
		Vr.ClickPrecinct();
	}

	@Then("Click any one Precinct")
	public void click_any_one_precinct() 
	{
		Vr.ClickTheGate();
	}

	@Then("Click on Unit Number drop down")

	public void click_on_unit_number_drop_down()
	{
		Vr.ClickUnitNumber();
	}

	@Then("Click any one Unit Number")
	public void click_any_one_unit_number() 
	{
		Vr.ClickGateT35407();
	}

	@Then("Click on Check In Date")
	public void click_on_check_in_date() 
	{
		Vr.ClickCheckInDate();
	}

	@Then("Click any Date from Check In Date Calender")
	public void click_any_date_from_check_in_date_calender()
	{
		Vr.ClickCheckInTime();
	}

	@Then("Click on Check In Time picker")
	public void click_on_check_in_time_picker()
	{

		Vr.ClickInDate();
	}

	@Then("Select Time")
	public void select_time()
	{

	}

	@Then("Click on Expected Check Out Date")
	public void click_on_expected_check_out_date() 
	{
		Vr.ClickCheckOutDate(); 
	}

	@Then("Click any Date from Expected Check Out Date Calender")
	public void click_any_date_from_expected_check_out_date_calender()
	{
		Vr.ClickOutDate();
	}



	@Then("Enter text on Additional Notes {string}")
	public void enter_text_on_additional_notes(String AText) 
	{
		Vr.setAdditionalNotes(AText);
	}

	@Then("Click on submit button")
	public void click_on_submit_button() 
	{
		Vr.ClickSubmit6();
	}



	////////////////  Classes & Offering //////////




	@Then("click on My Building on Classes & Offering Tenant")
	public void click_on_My_Building_on_Classes_Offering_Tenant() 
	{
		CO.clickMyBuilding1();
	}

	@Then("click on Gate&Arc on Classes & Offering Tenant")
	public void click_on_Gate_Arc_on_Classes_Offering_Tenant() 
	{
		CO.clickGateArc1();
	}

	@Then("Click on Classes&Offering")
	public void click_on_classes_offering() 
	{
		CO.clickClassesOffering1();
	}

	@Then("Click on BookNow")
	public void click_on_book_now() 
	{
		CO.clickBookNow();
	}

	@Then("Click on Select Your Package Radio Button")
	public void click_on_select_your_package_radio_button() 
	{
		CO.clickSelectYourPackage();
	}

	@Then("Click on Select Your Schedule Radio Button")
	public void click_on_select_your_schedule_radio_button() 
	{
		CO.clickSelectYourSchedule();
	}

	@Then("Click on Unit Number under Book")
	public void click_on_unit_number_under_book()
	{
		CO.clickUnitNumber();
	}

	@Then("Click on any one option under Unit Number")
	public void click_on_any_one_option_under_unit_number() 
	{
		CO.clickSelectUnit();
	}

	@Then("Enter Applicant Name {string}")
	public void enter_applicant_name(String string) 
	{
		CO.setApplicantName(string);
	}

	@Then("Enter Applicant Age {string}")
	public void enter_applicant_age(String string)
	{
		CO.setApplicantAge(string);
	}

	@Then("Click on Pay&Book")
	public void click_on_pay_book() 
	{
		CO.clickPayBook();
	}

	@Then("Enter Card Number {string}")
	public void enter_card_number(String string) 
	{
		CO.setCardNumber(string);
	}

	@Then("Click on Expiry Month")
	public void click_on_expiry_month() 
	{
		CO.clickExpiryMonth();
	}

	@Then("Select the Month")
	public void select_the_month() 
	{
		CO.clickMonth();
	}

	@Then("Click on Expiry Year")
	public void click_on_expiry_year() 
	{
		CO.clickExpiryYear();
	}

	@Then("Select Year")
	public void select_year() 
	{
		CO.clickYear();
	}

	@Then("Enter CVV {string}")
	public void enter_cvv(String string) 
	{
		CO.setCvv(string);
	}

	@Then("Click on Make Payment")
	public void click_on_make_payment() throws InterruptedException 
	{
		CO.clickMakePayment();
	}

	@Then("Click on Submitbtn")
	public void click_on_submitbtn() throws InterruptedException 
	{
		Thread.sleep(4000);
		CO.clickSubmitbtn();
		Thread.sleep(4000);
	}

	@Then("Click on Download receipt")
	public void click_on_download_receipt() throws InterruptedException 
	{
		Thread.sleep(4000);
		CO.clickDownloadreceipt();
		Thread.sleep(4000);
	}

	@Then("Click on Download Arrow")
	public void click_on_download_arrow()
	{
		CO.clickDownloadArrow();
	}





	///////////  Amenity Booking Tenant ////////////




	@Then("hits on my Building on Amenity Booking")
	public void hits_on_my_Building_on_Amenity_Booking()
	{
		AB.clickMyBuilding2();
	}

	@Then("hits on Gate&Arc on Amenity Booking")
	public void hits_on_Gate_Arc_on_Amenity_Booking()
	{
		AB.clickGateArc2();
	}

	@Then("click on Amenity Booking")
	public void click_on_Amenity_Booking() 
	{
		AB.clickAmenityBooking();
	}

	@Then("click on Book button")
	public void click_on_Book_button() 
	{
		AB.clickNowBook();
	}

	@Then("click on Unit drop down")
	public void click_on_Unit_drop_down() 
	{
		AB.clickunitdropdown();
	}

	@Then("select unit no")
	public void select_unit_no() 
	{
		AB.clickunitno();
	}

	@Then("click on Check In Date")
	public void click_on_Check_In_Date() 
	{
		AB.clickcheckindate();
	}

	@Then("select one date in check in date calendar")
	public void select_one_date_in_check_in_date_calendar()
	{
		AB.clickchkindate();
	}

	@Then("select Time Slot")
	public void select_Time_Slot() 
	{
		AB.clickslottime();
	}

	@Then("click in I understand and agree check box")
	public void click_in_I_understand_and_agree_check_box() 
	{
		AB.clickIunderstandandagree();
	}

	@Then("click on ok button on pop up")
	public void click_on_ok_button_on_pop_up() 
	{
		AB.clickOKbtn();
	}

	@Then("click on book button under Amenity Booking")
	public void click_on_book_button_under_Amenity_Booking()
	{
		AB.clicksbmtbtn();
	}






	/////////////////////////// Storage Booking Tenant /////////////////////////////////////////


	@Then("click on My Building for Storage Booking")
	public void click_on_my_building_for_storage_booking() 
	{
		SB.clickMyBuilding1();
	}

	@Then("click on Gate&Arc for Storage Booking")
	public void click_on_gate_arc_for_storage_booking() 
	{
		SB.clickGateArc1();
	}

	@Then("click on Storage Booking")
	public void click_on_storage_booking()
	{
		SB.clickStorageBooking();
	}



	@Then("click on Book Now button for Storage Booking")
	public void click_on_book_now_button_for_storage_booking() 
	{
		SB.clickBookNowStorage();
	}

	@Then("Enter Month for Storage Booking {string}")
	public void enter_month_for_storage_booking(String string)
	{
		SB.setMonthStorage(string);
	}

	@Then("click on Expected Move In To Storage")
	public void click_on_expected_move_in_to_storage() 
	{
		SB.clickStorageMoveInDate();
	}

	@Then("click on the date for Move In To Storage")
	public void click_on_the_date_for_move_in_to_storage() 
	{
		SB.clickStorageDate();
	}

	@Then("Enter Purpose of use {string}")
	public void enter_purpose_of_use(String string)
	{
		SB.setDescription(string); 
	}

	@Then("Click on  Storage Agreement Terms and Condition check box")
	public void click_on_storage_agreement_terms_and_condition_check_box() 
	{
		SB.clickIacceptcheckbox();
	}

	@Then("Click on Book Now for Storage Booking")
	public void click_on_book_now_for_storage_booking() 
	{
		SB.clicksubmitbtnn();
	}

	@Then("enter Card Number for Storage Booking  {string}")
	public void enter_card_number_for_storage_booking(String string) 
	{
		SB.setCardNumber(string);
	}

	@Then("Click on Expiry Month for Storage Booking")
	public void click_on_expiry_month_for_storage_booking() 
	{
		SB.clickExpiryMonth();
	}

	@Then("Select the Month for Storage Booking")
	public void select_the_month_for_storage_booking()
	{
		SB.clickMonth();

	}

	@Then("Click on Expiry Year for Storage Booking")
	public void click_on_expiry_year_for_storage_booking() 
	{
		SB.clickExpiryYear();	
	}

	@Then("Select Year for Storage Booking")
	public void select_year_for_storage_booking() 
	{
		SB.clickYear(); 
	}

	@Then("Enter CVV for Storage Booking {string}")
	public void enter_cvv_for_storage_booking(String string)  
	{
		SB.setCardCvv(string); 
	}

	@Then("Click on Make Payment for Storage Booking")
	public void click_on_make_payment_for_storage_booking()
	{
		SB.clickonMakePayment();
	}

	@Then("Click on Submitbtn for Storage Booking")
	public void click_on_submitbtn_for_storage_booking()
	{
		SB.clickonSubmitbtn();
	}





	@Then("Click on Download receipt for Storage Booking")
	public void click_on_download_receipt_for_storage_booking() 
	{
		SB.clickDownloadreceipt();
	}

	@Then("Click on Download Arrow for Storage Booking")
	public void click_on_download_arrow_for_storage_booking()
	{
		SB.clickDownloadArrow();
	}



	////////////////////////////// Community Chat Tenanyt ////////////////////////////////


	@Then("click on My Building for Community Chat")
	public void click_on_My_Building_for_Community_Chat() 
	{
		CC.clickMyBuilding3();
	}

	@Then("click on Gate&Arc for Community Chat")
	public void click_on_Gate_Arc_for_Community_Chat() 
	{
		CC.clickGateArc3();
	}

	@Then("click on Community Chat")
	public void click_on_Community_Chat() 
	{
		CC.clickCommunityChat();
	}

	@Then("Click on Create Community Post")
	public void click_on_Create_Community_Post() 
	{
		CC.clickCreateCommunityPost();
	}

	@Then("Enter Title {string}")
	public void enter_Title(String text)
	{
		CC.setTitle(text);
	}

	@Then("Enter description for Community Chat {string}")
	public void enter_description_for_Community_Chat(String text) 
	{
		CC.setDescription1(text);
	}

	@Then("Enter Video URL {string}")
	public void enter_Video_URL(String url) 
	{
		CC.setvideourl(url);
	}

	@Then("Upload Image or PDF {string}")
	public void upload_Image_or_PDF(String pic)
	{
		CC.setUploadImage(pic);
	}

	@Then("Click on Save button")
	public void click_on_Save_button() 
	{
		CC.clickSaveButton();
	}





	/////////////////////////// Star of the Month Nomination ///////////////////////////


	@Then("click on My Building for StaroftheMonthNomination")
	public void click_on_My_Building_for_StaroftheMonthNomination() 
	{
		SM.clickMyBuilding3();
	}

	@Then("click on Gate&Arc for StaroftheMonthNomination")
	public void click_on_Gate_Arc_for_StaroftheMonthNomination()
	{
		SM.clickGateArc3();
	}

	@Then("click on StaroftheMonthNomination")
	public void click_on_StaroftheMonthNomination()
	{
		SM.clickStaroftheMonthNomination();
	}

	@Then("Enter Name of the Employee {string}")
	public void enter_Name_of_the_Employee(String string) 
	{
		SM.setEmployee(string);
	}

	@Then("Click on Department drop down")
	public void click_on_Department_drop_down() 
	{
		SM.clickDepartment();
	}

	@Then("Select Administration")
	public void select_Administration() 
	{
		SM.clickAdministration();
	}

	@Then("Enter Reason for Nomination {string}")
	public void enter_Reason_for_Nomination(String string) 
	{
		SM.setReasonforNomination(string);
	}

	@Then("Click on submit button for StaroftheMonthNomination")
	public void click_on_submit_button_for_StaroftheMonthNomination() 
	{
		SM.clicksubmitt_button();
	}


	//////////////////////////////////////// Rate Your Community Preferences Tenant //////////////////////////




	@Then("click on My Building for Rate Your Community Preferences")
	public void click_on_My_Building_for_Rate_Your_Community_Preferences()
	{
		RC.clickMyBuilding4();
	}

	@Then("click on Gate&Arc for Rate Your Community Preferences")
	public void click_on_Gate_Arc_for_Rate_Your_Community_Preferences() 
	{
		RC.clickGateArc4();
	}

	@Then("click on Rate Your Community Preferences")
	public void click_on_Rate_Your_Community_Preferences() 
	{
		RC.clickRateyourcommunitypreferences();
	}

	@Then("click on Rental Price")
	public void click_on_Rental_Price() 
	{
		RC.clickRentalPrice();
	}

	@Then("click on Lease Flexibility")
	public void click_on_Lease_Flexibility() 
	{
		RC.clickLeaseFlexibility();
	}

	@Then("click on Maintenance Standards")
	public void click_on_Maintenance_Standards() 
	{
		RC.clickMaintenanceStandards();
	}

	@Then("click on Building Facilities")
	public void click_on_Building_Facilities() 
	{
		RC.clickBuildingFacilities();
	}

	@Then("click on Office Size and Quality of Finishes")
	public void click_on_Office_Size_and_Quality_of_Finishes() 
	{
		RC.clickOfficeSize();
	}

	@Then("click on Neighborhood and Surrounding Area")
	public void click_on_Neighborhood_and_Surrounding_Area() 
	{
		RC.clickSurroundingArea();
	}

	@Then("click on Cost of Utility")
	public void click_on_Cost_of_Utility() 
	{
		RC.clickCostofUtility();
	}

	@Then("click on submit Rate Your Community Preferences")
	public void click_on_submit_Rate_Your_Community_Preferences()
	{
		RC.clicksubmit_button1();
	}







	///////////////////////////////// General Enquiry Tenant //////////////////////////////




	@Then("click on General Enquiry")
	public void click_on_General_Enquiry() 
	{
		GE.clickGeneralEnquiry();
	}

	@Then("Click on Category drop down")
	public void click_on_Category_drop_down() 
	{
		GE.clickCategory();
	}

	@Then("Select Enquiry Helath club")
	public void select_Enquiry_Helath_club()
	{
		GE.clickHelathClub();
	}

	@Then("Click on Enquiry Type drop down")
	public void click_on_Enquiry_Type_drop_down() 
	{
		GE.clickEnquiryType();
	}

	@Then("Select Events")
	public void select_Events() 
	{
		GE.clickEvents(); 
	}

	@Then("Enter Remarks {string}")
	public void enter_Remarks(String string) 
	{
		GE.setRemarks(string);
	}

	@Then("Click on Submit General Enquiry")
	public void click_on_Submit_General_Enquiry() 
	{
		GE.clickSubbtn();
	}


	/////////////////////////////////// Report an Issue Against Another Unit ////////////////////////

	@Then("click on Report an Issue")
	public void click_on_Report_an_Issue() 
	{
		RI.clickReportanIssue();
	}

	@Then("click on Select Issue Type")
	public void click_on_Select_Issue_Type() 
	{
		RI.clickSelectIssueType();
	}

	@Then("click on Report an Issue Against Another Unit")
	public void click_on_Report_an_Issue_Against_Another_Unit()
	{
		RI.clickReportanIssueAgainstAnotherUnit();
	}

	@Then("click on Complaint Category drop down")
	public void click_on_Complaint_Category_drop_down() 
	{
		RI.clickComplaintCategory();
	}

	@Then("Select Parking")
	public void select_Parking() 
	{
		RI.clickParking();
	}

	@Then("click on Community for Report an Issue Against Another Unit")
	public void click_on_Community_for_Report_an_Issue_Against_Another_Unit() 
	{
		RI.clickCommunity5();
	}

	@Then("select Gate&Arc for Report an Issue Against Another Unit")
	public void select_Gate_Arc_for_Report_an_Issue_Against_Another_Unit() 
	{
		RI.clickGateArc5();
	}

	@Then("click on Precinct for Report an Issue Against Another Unit")
	public void click_on_Precinct_for_Report_an_Issue_Against_Another_Unit() 
	{
		RI.clickPrecinct5();
	}

	@Then("select The Gate for Report an Issue Against Another Unit")
	public void select_The_Gate_for_Report_an_Issue_Against_Another_Unit() 
	{
		RI.clickTheGate5();
	}

	@Then("click on Unit Number for Report an Issue Against Another Unit")
	public void click_on_Unit_Number_for_Report_an_Issue_Against_Another_Unit() 
	{
		RI.clickUnitNumber5();
	}

	@Then("Select Gatet for Report an Issue Against Another Unit")
	public void select_Gatet_for_Report_an_Issue_Against_Another_Unit()
	{
        RI.clickGateT35407rc();
	}

	@Then("select Attachment for Report an Issue Against Another Unit {string}")
	public void select_Attachment_for_Report_an_Issue_Against_Another_Unit(String string) 
	{
		RI.setimage(string);
	}

	@Then("Enter Additional Notes for Report an Issue Against Another Unit {string}")
	public void enter_Additional_Notes_for_Report_an_Issue_Against_Another_Unit(String text) 
	{
		RI.setAdditionalNotes(text);
	}

	@Then("Click on Submit for Report an Issue Against Another Unit")
	public void click_on_Submit_for_Report_an_Issue_Against_Another_Unit() 
	{
		RI.clicksubbtn5();
	}


	//////////////////////// Report an Issue in Common Area /////////////////////
	
	@Then("click on Report an Issu")
	public void click_on_Report_an_Issu() 
	{
	    RA.clickReportanIssu();
	}

	@Then("click on Select Issue Typ")
	public void click_on_Select_Issue_Typ() 
	{
	    RA.clickSelectIssueTyp();
	}

	@Then("click on Report an Issue in Common Area")
	public void click_on_Report_an_Issue_in_Common_Area() 
	{
	    RA.clickReportanIssueinCommonArea();
	}

	@Then("click on Category for Report an Issue in Common Area")
	public void click_on_Category_for_Report_an_Issue_in_Common_Area() 
	{
	    RA.clickCategory();
	}

	@Then("Select Air Conditioning on Category")
	public void select_Air_Conditioning_on_Category() 
	{
	    RA.clickAirConditioning();
	}

	@Then("Click on Sub Category drop down for Report an Issue in Common Area")
	public void click_on_Sub_Category_drop_down_for_Report_an_Issue_in_Common_Area() 
	{
	    RA.clickSubCategory();
	}

	@Then("select Ac defect under Sub Category drop down")
	public void select_Ac_defect_under_Sub_Category_drop_down() 
	{
	    RA.clickACDefect();
	}

	@Then("click on Precinct drop down for Report an Issue in Common Area")
	public void click_on_Precinct_drop_down_for_Report_an_Issue_in_Common_Area() 
	{
	    RA.clickPrecinct6();
	}

	@Then("Select Arc Retail under precinct for Report an Issue in Common Area")
	public void select_Arc_Retail_under_precinct_for_Report_an_Issue_in_Common_Area() 
	{
	   RA.clickArcRetail6();
	}

	@Then("click on Floor drop down")
	public void click_on_Floor_drop_down() 
	{
	   RA.clickFloor();   
	}

	@Then("select Retails second ground floor")
	public void select_Retails_second_ground_floor()
	{
	    RA.clickRetail02();
	}

	@Then("click on Common Area drop down")
	public void click_on_Common_Area_drop_down() 
	{
	   RA.clickCommonArea();
	}

	@Then("select Pizza Express")
	public void select_Pizza_Express() 
	{
	    RA.clickPizzaExpress();
	}

	@Then("Upload a photo for Report an Issue in Common Area {string}")
	public void upload_a_photo_for_Report_an_Issue_in_Common_Area(String img) 
	{
	    RA.setPhoto(img);
	}

	@Then("Enter Additional Note for Report an Issue in Common Area {string}")
	public void enter_Additional_Note_for_Report_an_Issue_in_Common_Area(String text) 
	{
	    RA.setNotes(text);
	}

	@Then("click on submit for Report an Issue in Common Area")
	public void click_on_submit_for_Report_an_Issue_in_Common_Area() 
	{
	   RA.clickbtnsub();
	}



}

