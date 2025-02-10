package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RegisterAccountPage  {

	// declaration
	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement FirstName;

	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement LastName;

	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement E_Mail;

	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement Telephone;

	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement Password;

	@FindBy(xpath = "//input[@id='input-confirm']")
	private WebElement Confirm_Password;

	@FindBy(xpath = "//label[text()='Yes']")
	private WebElement Subscribe;

	@FindBy(xpath = "//input[@name='agree']")
	private WebElement Privacy_Policy;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement Continue;

	@FindBy(xpath = "//a[text()='Continue']")
	private WebElement Continue_Button;

	// initilization
	public RegisterAccountPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getE_Mail() {
		return E_Mail;
	}

	public WebElement getTelephone() {
		return Telephone;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getConfirm_Password() {
		return Confirm_Password;
	}

	public WebElement getSubscribe() {
		return Subscribe;
	}

	public WebElement getPrivacy_Policy() {
		return Privacy_Policy;
	}

	public WebElement getContinue() {
		return Continue;
	}

	public WebElement getContinue_Button() {
		return Continue_Button;
	}

	
	

}
