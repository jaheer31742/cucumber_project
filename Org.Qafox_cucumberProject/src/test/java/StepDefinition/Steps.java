package StepDefinition;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import BaseConfiguration.BaseClass;
import PageObjectModel.HomePage;
import PageObjectModel.LoginPage;
import PageObjectModel.RegisterAccountPage;
import PageObjectModel.ShoppingCart;
import PageObjectModel.applieCinema_30;
import PageObjectModel.monitorPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps {	

	public WebDriver driver;

	public HomePage homePage;

	public RegisterAccountPage rap;

	public LoginPage lpage;

	public String mail ;
	
	public monitorPage mp;

	public applieCinema_30 ac;

	public ShoppingCart sc;

	public BaseClass bc;

	@Given("User launch the browser")
	public void user_launch_the_browser() {
		// Write code here that turns the phrase above into concrete actions
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		homePage = new HomePage(driver);
		rap = new RegisterAccountPage(driver);
		lpage = new LoginPage(driver);
		mp = new monitorPage(driver);
		ac = new applieCinema_30(driver);
		sc = new ShoppingCart(driver);
		bc = new BaseClass(driver);

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
		mail=bc.randomMail()+"@gmail.com";
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
		String expectedUrl = "https://tutorialsninja.com/demo/index.php?route=account/login";
		String actualUrl = driver.getCurrentUrl();
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

	@Then("click on the home button")
	public void click_on_the_home_button() {
		homePage.getHomeButton().click();
		bc.pause(2000);

	}

	@Then("verify the user is enter into the home page or not")
	public void verify_the_user_is_enter_into_the_home_page_or_not() {
		// Write code here that turns the phrase above into concrete actions
		String expectedUrl = "https://tutorialsninja.com/demo/index.php?route=common/home";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
	}

	@Then("user can mouse hover to the component module")
	public void user_can_mouse_hover_to_the_component_module() {

		// Write code here that turns the phrase above into concrete actions
		WebElement element=homePage.getComponents();
		bc.mouseHoverToElement(element);
		bc.pause(3000);
		homePage.getComponents().click();
		bc.pause(3000);

	}

	@Then("click on the monitor sub module")
	public void click_on_the_monitor_sub_module() {
		// Write code here that turns the phrase above into concrete actions
		homePage.getMonitor().click();
		bc.pause(2000);
	}

	@Then("verify user is enter into the monitor module or not")
	public void verify_user_is_enter_into_the_monitor_module_or_not() {
		// Write code here that turns the phrase above into concrete actions
		String expectedUrl = "https://tutorialsninja.com/demo/index.php?route=product/category&path=25_28";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);

	}

	@Then("click on the product applie cinema")
	public void click_on_the_product_applie_cinema() {
		// Write code here that turns the phrase above into concrete actions
		String text = mp.getMonitorheading().getText();
		System.out.println(text);
		mp.getApplieCinema30().click();
		bc.pause(3000);
	}

	@Then("verify the user enter into the apple cinema page or not")
	public void verify_the_user_enter_into_the_apple_cinema_page_or_not() {
		// Write code here that turns the phrase above into concrete actions
		String expectedUrl = "https://tutorialsninja.com/demo/index.php?route=product/product&path=25_28&product_id=42";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
	}

	@Then("fetch the details of the page and perform actions")
	public void fetch_the_details_of_the_page_and_perform_actions() {
		// Write code here that turns the phrase above into concrete actions
		// fetch the main heading
		String mainHeading = ac.getApplieCinemaheading().getText();
		System.out.println(mainHeading);

		// fetch the brand
		String brand = ac.getBrand().getText();
		System.out.println(brand);

		// fetch the product code
		String productCode = ac.getPoductCode().getText();
		System.out.println(productCode);

		// fetch reward points
		String rewardPoints = ac.getRewardPoints().getText();
		System.out.println(rewardPoints);

		// fetch the price
		String price = ac.getPrice().getText();
		System.out.println(price);

		// fetch the stock availability
		String stockAvailablity = ac.getStockavailability().getText();
		System.out.println(stockAvailablity);

		// click on the radio button
		ac.getRadio().click();

		// click on the check box
		ac.getCheckBox_3().click();

		// enter the value in the text field
		ac.getText_field().sendKeys("jaheer");
		bc.pause(1000);

		// choice one option in the drop down
		bc.selectFromDropDown(ac.getDropdown(), "4");

		// enter the data in the text area
		ac.getText_area().sendKeys("software testing");
		bc.pause(2000);

		// click on the upload file button
		ac.getUploadFile().click();

		try {
			Runtime.getRuntime().exec("C:\\Users\\Jaheer\\Desktop\\fileUpload.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		bc.handleAlert();
		bc.pause(5000);

		// enter the date
		ac.getDate().sendKeys("2025-02-10");
		bc.pause(1000);

		// enter the time
		ac.getTime().sendKeys("18:00");

		// enter date and time
		ac.getDate_time().sendKeys("2025-02-10 18:00");

		// enter the qty
		ac.getQty().sendKeys("3");

		// click on the add to cart button
		ac.getAddToCartButton().click();
		bc.pause(2000);

	}

	@Then("click on the item cart button and view cart button")
	public void click_on_the_item_cart_button_and_view_cart_button() {
		// Write code here that turns the phrase above into concrete actions

		// click on the item cart button
		homePage.getItemCart().click();
		bc.pause(3000);

		// click on the view cart
		homePage.getViewCart().click();
		bc.pause(2000);

	}

	@Then("verify the user enter into the shopping cart page or not")
	public void verify_the_user_enter_into_the_shopping_cart_page_or_not() {
		// Write code here that turns the phrase above into concrete actions

		String expectedUrl = "https://tutorialsninja.com/demo/index.php?route=checkout/cart";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);

	}

	@Then("fetch the details of the shopping page and check out")
	public void fetch_the_details_of_the_shopping_page_and_check_out() {
		// Write code here that turns the phrase above into concrete actions
		String shoppingHeading = sc.getShoppingHeading().getText();
		System.out.println(shoppingHeading);
		String unitPrice = sc.getUnitPrice().getText();
		System.out.println(unitPrice);
		String totalPrice = sc.getTotalPrice().getText();
		System.out.println(totalPrice);

		sc.getCheckout().click();

	}

	@Then("click on the logout")
	public void click_on_the_logout() {
		// Write code here that turns the phrase above into concrete actions
		homePage.getLagout().click();
	}

	@Then("close browser")
	public void close_browser() {
		// Write code here that turns the phrase above into concrete actions
		driver.quit();
	}

}
