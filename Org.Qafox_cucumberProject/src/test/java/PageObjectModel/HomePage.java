package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage  {
	@FindBy(xpath = "//li[@class='dropdown'][1]/child::a[@title='My Account']")
	private WebElement MyAccount;

	@FindBy(xpath = "//a[text()='Register']")
	private WebElement Register;

	@FindBy(xpath = "//li/child::a[text()='Login']")
	private WebElement Login;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getMyAccount() {
		return MyAccount;
	}

	public WebElement getRegister() {
		return Register;
	}

	public WebElement getLogin() {
		return Login;
	}
	

}
