package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath = "//li[@class='dropdown'][1]/child::a[@title='My Account']")
	private WebElement MyAccount;

	@FindBy(xpath = "//a[text()='Register']")
	private WebElement Register;

	@FindBy(xpath = "//li/child::a[text()='Login']")
	private WebElement Login;
	
	@FindBy(xpath = "//ul[@class='breadcrumb']/li[1]")
	private WebElement homeButton;	

	@FindBy(xpath = "//a[text()='Components']")
	private WebElement components;

	@FindBy(xpath = "//a[text()='Monitors (2)']")
	private WebElement monitor;

	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement itemCart;

	@FindBy(xpath = "//strong[text()='View Cart']")
	private WebElement viewCart;

	@FindBy(xpath = "//li/child::a[text()='Logout']")
	private WebElement lagout;

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

	public WebElement getComponents() {
		return components;
	}

	public WebElement getMonitor() {
		return monitor;
	}

	public WebElement getItemCart() {
		return itemCart;
	}

	public WebElement getViewCart() {
		return viewCart;
	}

	public WebElement getLagout() {
		return lagout;
	}
	
	public WebElement getHomeButton() {
		return homeButton;
	}

}
