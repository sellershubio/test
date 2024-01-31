package Test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageEvents.AddProductPageEvents;
import PageEvents.HomePageEvents;
import PageEvents.LoginPageEvents;
import Utils.Constants;
import Base.BaseTest;
public class login extends BaseTest{
	
	WebDriver driver;
	LoginPageEvents LPE=new LoginPageEvents();
	HomePageEvents HPE=new HomePageEvents();
	AddProductPageEvents APE=new AddProductPageEvents();

@BeforeClass
	public void Setup() {
		driver=GetDriver();
		driver.get(Constants.Url);
		driver.manage().window().maximize();
		
	} 
 
	@Test(priority=1)
	public void LoginTest() throws InterruptedException
	{
		Thread.sleep(3000);
		LPE.login();
	}
	@Test(priority=2)
	public void ProductsPageTest() throws InterruptedException
	{
	
		
		Thread.sleep(3000);
		HPE.ClickOnHomePage();
		Thread.sleep(3000);
		HPE.ClickOnProductsPage();
		Thread.sleep(2000);
		APE.ClickOnNewProductButton();
		Thread.sleep(2000);
		APE.EnterTheProductName();
		Thread.sleep(2000);
		APE.SelectTheProductType();
		Thread.sleep(2000);
		APE.EnterTheDescriptions();
		Thread.sleep(2000);
		APE.UpdateTheVideoURL();
		Thread.sleep(2000);
		APE.UploadTheIamges();
		Thread.sleep(2000);
		APE.UpdateTheSKUandGTIN();
		Thread.sleep(2000);
		APE.SelectTheCategories();
		Thread.sleep(2000);
		APE.SelectTheBrand();
		Thread.sleep(2000);
		APE.SelectTheTags();
		Thread.sleep(2000);
		
		//APE.UpdateCustomFields();
		Thread.sleep(2000);
		//APE.SelectTheTrustBadge();
		APE.ClickOnPricingTab();
		Thread.sleep(2000);
		APE.UpdatePrice();
		Thread.sleep(2000);
		APE.BulkPricing();
		Thread.sleep(2000);
		APE.SalesTax();
		
	}
}
