package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class monitorPage {
	
	@FindBy(xpath = "//h2[text()='Monitors']")
	private WebElement monitorheading;
	
	@FindBy(xpath = "//a[text()='Apple Cinema 30\"']")
	private WebElement applieCinema30;
	
	
	public monitorPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getMonitorheading() {
		return monitorheading;
	}

	public WebElement getApplieCinema30() {
		return applieCinema30;
	}

}
