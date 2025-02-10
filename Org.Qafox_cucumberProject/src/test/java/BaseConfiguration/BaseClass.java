package BaseConfiguration;



import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

public class BaseClass {	
	public WebDriver driver;
	
	public static String randomMail() {
		String mail=RandomStringUtils.randomAlphabetic(10);
		return mail;
		
	}
	
	
}
