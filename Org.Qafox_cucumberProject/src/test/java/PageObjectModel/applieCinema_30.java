package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class applieCinema_30 {

	@FindBy(xpath = "//h1[text()='Apple Cinema 30\"']")
	private WebElement applieCinemaheading;

	@FindBy(xpath = "//li/a[text()='Apple']")
	private WebElement brand;

	@FindBy(xpath = "//li[text()='Product Code:Product 15']")
	private WebElement poductCode;

	@FindBy(xpath = "//li[text()='Reward Points:100']")
	private WebElement rewardPoints;

	@FindBy(xpath = "//li[text()='Availability:In Stock']")
	private WebElement stockavailability;

	@FindBy(xpath = "//li/h2[text()='$110.00']")
	private WebElement price;

	@FindBy(xpath = "//input[@name='option[218]']")
	private WebElement radio;

	@FindBy(xpath = "//input[@name='option[223][]']")
	private WebElement checkBox_3;

	@FindBy(xpath = "//input[@id='input-option208']")
	private WebElement text_field;

	@FindBy(xpath = "//select[@id='input-option217']")
	private WebElement dropdown;

	@FindBy(xpath = "//textarea[@id='input-option209']")
	private WebElement text_area;

	@FindBy(xpath = "//button[@id='button-upload222']")
	private WebElement uploadFile;

	@FindBy(xpath = "//input[@id='input-option219']")
	private WebElement date;

	@FindBy(xpath = "//input[@id='input-option221']")
	private WebElement time;

	@FindBy(xpath = "//input[@id='input-option220']")
	private WebElement date_time;

	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement qty;

	@FindBy(xpath = "//button[text()='Add to Cart']")
	private WebElement addToCartButton;

	public applieCinema_30(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getApplieCinemaheading() {
		return applieCinemaheading;
	}

	public WebElement getBrand() {
		return brand;
	}

	public WebElement getPoductCode() {
		return poductCode;
	}

	public WebElement getRewardPoints() {
		return rewardPoints;
	}

	public WebElement getStockavailability() {
		return stockavailability;
	}

	public WebElement getPrice() {
		return price;
	}

	public WebElement getRadio() {
		return radio;
	}

	public WebElement getCheckBox_3() {
		return checkBox_3;
	}

	public WebElement getText_field() {
		return text_field;
	}

	public WebElement getDropdown() {
		return dropdown;
	}

	public WebElement getText_area() {
		return text_area;
	}

	public WebElement getUploadFile() {
		return uploadFile;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getTime() {
		return time;
	}

	public WebElement getDate_time() {
		return date_time;
	}

	public WebElement getQty() {
		return qty;
	}

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}

}
