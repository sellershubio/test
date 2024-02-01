package Test;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageEvents.AddProductPageEvents;
import PageEvents.CategoriesPageEvents;
import PageEvents.HomePageEvents;
import PageEvents.LoginPageEvents;
import Utils.Constants;
import Utils.ElementFetch;
import Base.BaseTest;
public class login extends BaseTest{

	WebDriver driver;
	LoginPageEvents LPE=new LoginPageEvents();
	HomePageEvents HPE=new HomePageEvents();
	AddProductPageEvents APE=new AddProductPageEvents();
	CategoriesPageEvents CPE=new CategoriesPageEvents();
	ElementFetch ef=new ElementFetch();

	@BeforeClass
	public void Setup() {
		driver=GetDriver();
		driver.get(Constants.Url);
		driver.manage().window().maximize();

	} 

	@Test(priority=1)
	public void LoginTest() throws InterruptedException
	{
		System.out.println("Login Sucess");
		Thread.sleep(3000);
		LPE.login();
		System.out.println("Login Sucess1");
		Thread.sleep(4000);
		HPE.ClickOnHomePage();

	}
	//@Test(priority=2)
	public void CreateProduct() throws InterruptedException
	{


		Thread.sleep(8000);
		HPE.ClickOnHomePage();
		System.out.println("Clicked On Home Page");
		Thread.sleep(3000);
		HPE.ClickOnProductsPage();
		Thread.sleep(2000);
		APE.ClickOnNewProductButton();
		System.out.println("Clicked On Create New Product Page");
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
		APE.Logistics();
		APE.SEO();
		APE.Variants();
		APE.Recommendation();
		Thread.sleep(2000);
		APE.SaveProduct();

	}

	@Test(priority=3)
	public void CreateCategoryTest() throws InterruptedException, AWTException
	{

		Thread.sleep(4000);
		HPE.ClickOnHomePage();
		Thread.sleep(2000);
		CPE.ClickedOnCategories();
		Thread.sleep(2000);
		CPE.ClickedOnNewCategoryButton();
		Thread.sleep(2000);
		CPE.EnterTheCategoryName("Test Category");
		Thread.sleep(500);
		CPE.EnterTheCategoryDescription("Test Category");
		Thread.sleep(500);
		driver.findElement(By.cssSelector("p:nth-child(4)")).click();
		Thread.sleep(1000);
		CPE.scrolldown();
		CPE.UploadTheImage();
		Thread.sleep(1000);
		CPE.scrolldown();
		CPE.EnableGoogleShopping();
		Thread.sleep(1000);
		CPE.scrolldown();
		//EnableSEO();
		CPE.scrolldown();
		Thread.sleep(1000);
		CPE.ClickOnSaveButton();
		CPE.ClickOnHome();
		Thread.sleep(1000);
		Thread.sleep(1000);
		CPE.ClickOnHome();
	}

	@Test(priority=4)
	public void addBrands() throws InterruptedException
	  {
		 //pass
	
		Thread.sleep(3000);
		  WebDriverWait wait = new WebDriverWait(driver, 30);
		  WebElement BrandsTab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Brands")));
		  BrandsTab.click();
		  Thread.sleep(4000);
		  WebElement New = driver.findElement(By.xpath("//*[contains(@class, 'btn__text') and contains(text(), 'New Brand')]"));
		  New.click();
		  Thread.sleep(4000);
		  boolean saveDisabled = driver.findElement(By.xpath("//*[contains(@class, 'btn__text') and contains(text(), 'Save')]")).isEnabled();
			if (saveDisabled == false )
			  { 
				CPE.scrolldown();
				Thread.sleep(1000);
				  WebElement Cancel = driver.findElement(By.cssSelector("#button"));
				  Cancel.click();
				  Thread.sleep(1000);
				  WebElement newBtn = driver.findElement(By.cssSelector("#new"));
				  newBtn.click();
				  WebElement brandName1 = driver.findElement(By.xpath("//*[@placeholder=\"Name\"]"));
				  brandName1.sendKeys("Test Brand");
				 CPE.scrolldown();
				  Thread.sleep(1000);
				  WebElement Save = driver.findElement(By.xpath("//*[contains(@class, 'btn__text') and contains(text(), 'Save')]"));
				  ef.Scroll(Save);
				  Save.click();
				  System.out.println("Brand Created successfully"); 
				  Thread.sleep(2000);
				  CPE.ClickOnHome();
			  }else {
				 // Assert.assertEquals("Testcase failed as Save button is enabled by default",false, saveDisabled);
			  }
			  		  
	  } 

	@Test(priority=5)
	 public void DeleteProduct() throws InterruptedException
	  {
		   //pass
		
		Thread.sleep(3000);
		  WebDriverWait wait = new WebDriverWait(driver, 30);
		  WebElement ProductTabs = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Products")));
		  ProductTabs.click();
		  Thread.sleep(2000);
		 /* WebElement searchvalidProduct = driver.findElement(By.cssSelector(".MuiInputBase-input.MuiInputBase-inputTypeSearch"));
		  searchvalidProduct.sendKeys("Test");
		  Thread.sleep(1000);*/
		  WebElement moreOptions = driver.findElement(By.xpath("(//*[@class=\"fa-solid fa-ellipsis\"])[1]"));
		  moreOptions.click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("(//*[@title=\"Delete\"])[1]")).click();
		  Thread.sleep(1000);
		  WebElement cancelProduct = driver.findElement(By.xpath("//div[@class='btn__text' and text()='Cancel']"));
		  cancelProduct.click();
		  WebElement moreOptions1 = driver.findElement(By.xpath("(//*[@class=\"fa-solid fa-ellipsis\"])[1]"));
		  moreOptions1.click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("(//*[@title=\"Delete\"])[1]")).click();
		  Thread.sleep(1000);
		  WebElement deleteProduct =driver.findElement(By.xpath("//div[@class='btn__text' and text()='Delete']"));
		  deleteProduct.click();
		  System.out.println("Product deleted successfully"); 
		  Thread.sleep(2000);
		  CPE.ClickOnHome();
	  }
	@Test(priority=6)
	public void EditProduct() throws InterruptedException 
	{
		
		Thread.sleep(3000);
		  WebDriverWait wait = new WebDriverWait(driver, 30);
		  WebElement ProductTabs = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Products")));
		  ProductTabs.click();
		  Thread.sleep(2000);
		  WebElement moreOptions = driver.findElement(By.xpath("(//*[@class=\"fa-solid fa-ellipsis\"])[1]"));
		  moreOptions.click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("(//*[@title=\"Edit\"])[1]")).click();
		  Thread.sleep(2000);
		  APE.EnterTheProductName();
			Thread.sleep(2000);
			APE.SelectTheProductType();
			Thread.sleep(2000);
			APE.EnterTheDescriptions();
			Thread.sleep(2000);
			ef.ScrollToEndOfThePage();
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
			APE.Logistics();
			APE.SEO();
			Thread.sleep(2000);
			APE.SaveProduct();
	}
	@Test(priority=7)
	public void DeleteCategoryTest() throws InterruptedException 
	{
		
		Thread.sleep(3000);
		Thread.sleep(500);
		CPE.ClickedOnCategories();
		Thread.sleep(1000);
		CPE.SearchCategory("a");
		Thread.sleep(1000);
		CPE.ClickOnMenu();
		Thread.sleep(500);
		CPE.DeleteCategory();
		Thread.sleep(500);
		CPE.ClickOnHome();
	}
	@Test(priority=8)
	public void DeleteBrand()
	{

	}
	@Test(priority=9)
	public void CreateChildcategory() throws InterruptedException, AWTException 
	{
		
		Thread.sleep(3000);
		CPE.ClickedOnCategories();
		Thread.sleep(1000);
		CPE.ClickedOnNewCategoryButton();
		Thread.sleep(1000);
		CPE.EnterTheCategoryName("Test Sub Category");
		Thread.sleep(1000);
		CPE.SelectTheParentCategory();
		Thread.sleep(1000);
		CPE.EnterTheCategoryDescription("Test Sub category Descriptin");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("p:nth-child(4)")).click();
		//UploadTheImage();
		Thread.sleep(1000);
		CPE.scrolldown();
		CPE.ClickOnSaveButton();
		Thread.sleep(500);
		CPE.ClickOnHome();
	}

	@Test(priority=10)
	public void DargAndDropTest() throws InterruptedException {
		//pass
		
		Thread.sleep(3000);
		CPE.ClickedOnCategories();
		Thread.sleep(1000);
		WebElement drg = driver.findElement(By.xpath("(//*[@class=\"table__dragable-box\"])[1]"));
		WebElement drp = driver.findElement(By.xpath("(//*[@class=\"m-list__card\"])[3]"));
		Actions acn = new Actions(driver);

		Action dragAndDrop = acn.clickAndHold(drg).moveToElement(drp).release(drp).build();
		dragAndDrop.perform();
		Thread.sleep(500);
		CPE.ClickOnHome();
	}
	@Test(priority=11)
	public void HideOrUnHideCategoryTest() throws InterruptedException
	{
		
		Thread.sleep(3000);
		Thread.sleep(500);
		CPE.ClickedOnCategories();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[@class='s-content__left' and text()='ALL Categories'])")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[@class='body-md ls-md mb-0' and text()='Available Categories'])")).click();
		//SearchCategory("a");
		Thread.sleep(500);
		CPE.ClickOnMenu();
		CPE.HideOrUnhidecategory();
		Thread.sleep(2000);
		CPE.ClickOnMenu();
		Thread.sleep(500);
		//HideOrUnhidecategory();


	}
	@Test(priority=12)
	public void SearchCategoryTest() throws InterruptedException {
		//pass
		
		Thread.sleep(3000);
		driver.navigate().refresh();
		String Str = "Test Category";
		Thread.sleep(3000);
		CPE.ClickedOnCategories();
		CPE.SearchCategory(Str);
		Thread.sleep(1000);
		List<WebElement> Titles = driver.findElements(By.xpath("//*[@class=\"heading-xs mb-0\"]"));
		Thread.sleep(1000);
		for (int i = 0; i < Titles.size(); i++) {
			String temp = Titles.get(i).getText();

			if ((temp.toLowerCase().contains(Str.toLowerCase()))) {
				//Assert.assertTrue(Str + " is displayed on product title Product Title: " + temp, true);
			} else {
				//Assert.assertTrue(Str + " is not displayed on product title Product Title: " + temp, false);


			}

		}
		Thread.sleep(500);
		CPE.ClickOnHome();
	}
	@Test(priority=13)
	public void CategoryProductsValidation() throws InterruptedException {
		//pass
		
		String Str1 = "TestCategory1";
		Thread.sleep(3000);
		CPE.ClickedOnCategories();
		Thread.sleep(1000);
		CPE.SearchCategory(Str1);
		String number = driver.findElement(By.xpath("(//*[@class=\"body-sm ls-md mb-0 \"])[1]")).getText();
		System.out.print(number+"number");
		String number1 = number.substring(0, 1);
		System.out.println(number1+"number1");
		int i = Integer.parseInt(number1);
		driver.findElement(By.xpath("(//*[@class=\"row m-0 table__data-row cursor-pointer\"])[1]")).click();
		List<WebElement> count = driver.findElements(By.xpath("//*[@id=\"edit\"]"));
		int products = count.size();
		if (products == i) {
			System.out.println("Count matched");

		} else {
			System.out.println("Count not matched");
		}
		Thread.sleep(500);
		CPE.ClickOnHome();
	}
	
	
}

