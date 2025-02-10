package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart {

	@FindBy(xpath = "//div[@id='content']/child::h1")
	private WebElement ShoppingHeading;

	@FindBy(xpath = "//td[text()='$162.80']")
	private WebElement unitPrice;
	
	@FindBy(xpath = "//tbody/tr/td[6]")
	private WebElement totalPrice;
	
	@FindBy(xpath = "//a[text()='Checkout']")
	private WebElement checkout;
	
	@FindBy(xpath = "(//ul[@class='breadcrumb']/following-sibling::div)[1]")
	private WebElement shopppingcartMessage;

	public ShoppingCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getShoppingHeading() {
		return ShoppingHeading;
	}

	public WebElement getUnitPrice() {
		return unitPrice;
	}

	public WebElement getTotalPrice() {
		return totalPrice;
	}

	public WebElement getCheckout() {
		return checkout;
	}
	
	public WebElement getShopppingcartMessage() {
		return shopppingcartMessage;
	}
}
