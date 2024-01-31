package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import Utils.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseTest {
	public static WebDriver driver;

	//String LOGIN_MOBILE_EMAIL = System.getenv("LOGIN_MOBILE_EMAIL") != null ? System.getenv("LOGIN_MOBILE_EMAIL") : "automationtest2+1@gmail.com";
	// String ADMIN_APP_DOMAIN = System.getenv("ADMIN_APP_DOMAIN") != null ? System.getenv("ADMIN_APP_DOMAIN") : "https://app.lightbooks-dev.io";
	// String LOGIN_MOBILE_NUMBER = System.getenv("LOGIN_MOBILE_NUMBER") != null ? System.getenv("LOGIN_MOBILE_NUMBER") : "7890678906";
	// String LOGIN_PWD = System.getenv("LOGIN_PWD") != null ? System.getenv("LOGIN_PWD") : "India@999";

	public WebDriver GetDriver(){

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(options);     
		//	driver.get(Constants.Url);
		//	driver.manage().window().maximize();

		return driver;

	}


}