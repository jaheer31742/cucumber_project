package BaseConfiguration;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public WebDriver driver;
	
	
	public BaseClass(WebDriver driver) { 
        this.driver = driver;
    }	


	/**
	 * this method is used to generate the random Mail
	 */
	public static String randomMail() {
		String mail = RandomStringUtils.randomAlphabetic(10);
		return mail;
	}

	/**
	 * this method is used to generate the random Mail
	 */
	public  void mouseHoverToElement(WebElement element) {
		Actions actionObj = new Actions(driver);
		actionObj.moveToElement(element).perform();

	}

	/**
	 * This method is used to pause the script execution for specified time
	 * 
	 * @param time
	 */
	public void pause(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * This Method is used to select an element from drop down based on value
	 * 
	 * @param element
	 * @param value
	 * 
	 */
	public void selectFromDropDown(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	/**
	 * This Method is used to handle alert pop up
	 * 
	 * @param status
	 * 
	 */
	public void handleAlert() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert al = driver.switchTo().alert();
		String text = al.getText();
		System.out.println(text);
		al.accept();

	}


	

}
