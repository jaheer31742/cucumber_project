package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import BaseConfiguration.BaseClass;
import PageObjectModel.HomePage;
import PageObjectModel.LoginPage;
import PageObjectModel.RegisterAccountPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps extends BaseClass {

	public WebDriver driver;

	public HomePage homePage;

	public RegisterAccountPage rap;
	
	public LoginPage lpage;
	
	public String mail=randomMail() + "@gmail.com";

	@Given("User launch the browser")
	public void user_launch_the_browser() {
		// Write code here that turns the phrase above into concrete actions
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		homePage = new HomePage(driver);
		rap = new RegisterAccountPage(driver);
		lpage=new LoginPage(driver);
	}

	@When("Navigate to the url {string}")
	public void navigate_to_the_url(String url) {
		// Write code here that turns the phrase above into concrete actions
		driver.get(url);
	}

	@When("User should click on the MyAccount button")
	public void user_should_click_on_the_my_account_button() {
		// Write code here that turns the phrase above into concrete actions
		homePage.getMyAccount().click();
	}

	@When("User should click on the register link")
	public void user_should_click_on_the_register_link() {
		// Write code here that turns the phrase above into concrete actions

		homePage.getRegister().click();
	}

	@Then("Verify the user is enter into the register page or not")
	public void verify_the_user_is_enter_into_the_register_page_or_not() {
		// Write code here that turns the phrase above into concrete actions
		String expectedUrl = "https://tutorialsninja.com/demo/index.php?route=account/register";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
	}

	@Then("User should enter the valid perdonal details and password and click on thee subscribe button {string}")
	public void user_should_enter_the_valid_perdonal_details_and_password_and_click_on_thee_subscribe_button(
			String string) {
		// Write code here that turns the phrase above into concrete actions
		rap.getFirstName().sendKeys("jaheer");
		rap.getLastName().sendKeys("shaik");
		rap.getE_Mail().sendKeys(mail);
		rap.getTelephone().sendKeys("9553205434");
		rap.getPassword().sendKeys("moin316");
		rap.getConfirm_Password().sendKeys("moin316");
		rap.getSubscribe().click();

	}

	@Then("user should click on the privacy policy check box and click on the continue button")
	public void user_should_click_on_the_privacy_policy_check_box_and_click_on_the_continue_button() {
		// Write code here that turns the phrase above into concrete actions
		rap.getPrivacy_Policy().click();
		rap.getContinue().click();
	}

	@Then("verify that user should register the account successfull")
	public void verify_that_user_should_register_the_account_successfull() {
		// Write code here that turns the phrase above into concrete actions
		String expectedUrl = "https://tutorialsninja.com/demo/index.php?route=account/success";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
	}

	@Then("click on the continue button")
	public void click_on_the_continue_button() {
		// Write code here that turns the phrase above into concrete actions
		rap.getContinue_Button().click();
	
	}

	@When("User should click on the Login link")
	public void user_should_click_on_the_login_link() {
		// Write code here that turns the phrase above into concrete actions
		homePage.getLogin().click();
	}

	@Then("Verify the user is enter into the Login page or not")
	public void verify_the_user_is_enter_into_the_login_page_or_not() {
		// Write code here that turns the phrase above into concrete actions
		String expectedUrl="https://tutorialsninja.com/demo/index.php?route=account/login";
		String actualUrl=driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
		
	}

	@Then("User should enter the valid email and password {string}")
	public void user_should_enter_the_valid_email_and_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    lpage.getEmailAddress().sendKeys(mail);
	    lpage.getPassword().sendKeys(string);
	}

	@Then("click on the Login button")
	public void click_on_the_login_button() {
		// Write code here that turns the phrase above into concrete actions
		lpage.getLoginButton().click();
	}

	@Then("close browser")
	public void close_browser() {
		// Write code here that turns the phrase above into concrete actions
		driver.quit();
	}

}
