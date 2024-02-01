package PageEvents;

import Utils.ElementFetch;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Base.BaseTest;
import PageElements.AddProductPageElements;

public class AddProductPageEvents extends BaseTest
{
	ElementFetch ef=new ElementFetch();


	public void ClickOnNewProductButton()
	{
		ef.getWebElement("XPATH", AddProductPageElements.NewProductButton).click();
	}
	public void EnterTheProductName() 
	{
		ef.getWebElement("XPATH", AddProductPageElements.ProductName).sendKeys("Test");
	}
	public void SelectTheProductType() 
	{
		ef.getWebElement("XPATH", AddProductPageElements.ProductType).click();
	}
	public void EnterTheDescriptions() 
	{
		WebElement We=ef.getWebElement("CSS", AddProductPageElements.Description);
		ef.Scroll(We);
		We.sendKeys("Test Description");
		ef.getWebElement("XPATH", AddProductPageElements.ShortDescription).sendKeys("Test Short Description");
	}
	public void UploadTheIamges() 
	{	
		WebElement we=ef.getWebElement("XPATH", AddProductPageElements.Images);
		ef.Scroll(we);
		we.click();
	}
	public void UpdateTheVideoURL() 
	{	
		WebElement we=ef.getWebElement("XPATH", AddProductPageElements.VideoUrl);
		ef.Scroll(we);
		we.sendKeys("Tset");
	}
	public void SelectTheCategories() 
	{	
		WebElement we=ef.getWebElement("XPATH", AddProductPageElements.Categories);
		ef.Scroll(we);
		we.click();
		//ef.getWebElement("XPATH", AddProductPageElements.CategorySearch).sendKeys("Test Category");
		WebElement we1=ef.getWebElement("XPATH", AddProductPageElements.CategorySearch);
		//ef.Scroll(we1);
		we1.click();
		ef.getWebElement("XPATH", AddProductPageElements.MultiSelectionOption).click();
	}
	public void SelectTheBrand() 
	{
		WebElement we=ef.getWebElement("XPATH", AddProductPageElements.Brands);
		ef.Scroll(we);
		we.click();
		ef.getWebElement("XPATH", AddProductPageElements.BrandsSelect).click();
		ef.getWebElement("XPATH", AddProductPageElements.BrandClick).click();
	}
	public void SelectTheTags() 
	{
		WebElement we=ef.getWebElement("XPATH", AddProductPageElements.Tags);
		ef.Scroll(we);
		we.click();
		ef.getWebElement("XPATH", AddProductPageElements.TagsSelect).click();
		ef.getWebElement("XPATH", AddProductPageElements.TagsClick).click();
	}
	public void UpdateTheSKUandGTIN() 
	{	
		WebElement we=ef.getWebElement("XPATH", AddProductPageElements.Sku);
		ef.Scroll(we);
		we.clear();
		we.sendKeys("34567");
		WebElement we1=ef.getWebElement("XPATH", AddProductPageElements.GTIN);
		ef.Scroll(we1);
		we1.sendKeys("12345");
	}
	public void UpdateCustomFields() 
	{
		JavascriptExecutor jse = (JavascriptExecutor) BaseTest.driver;

		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		WebElement we=ef.getWebElement("XPATH", AddProductPageElements.CustomFieldsEnableorDisable);
		//ef.Scroll(we);
		we.click();
		ef.getWebElement("XPATH", AddProductPageElements.SelectCustomField).click();
		ef.getWebElement("XPATH", AddProductPageElements.SelectCustomFieldValueSelect).click();
		ef.getWebElement("XPATH", AddProductPageElements.SelectCustomeFieldClick).click();
	}
	public void SelectTheTrustBadge() 
	{	


		WebElement we=ef.getWebElement("XPATH", AddProductPageElements.TrustedBadge);
		ef.Scroll(we);
		we.click();
		ef.getWebElement("XPATH", AddProductPageElements.SizeChart).click();
	}

	public void ClickOnPricingTab()
	{
		ef.getWebElement("XPATH", AddProductPageElements.ClickOnPricingTab).click();
	}
	public void UpdatePrice() throws InterruptedException
	{
		ef.getWebElement("XPATH", AddProductPageElements.MSRP).clear();
		ef.getWebElement("XPATH", AddProductPageElements.MSRP).sendKeys("30");
		ef.getWebElement("XPATH", AddProductPageElements.SellingPrice).clear();
		ef.getWebElement("XPATH", AddProductPageElements.SellingPrice).sendKeys("40");
		ef.getWebElement("XPATH", AddProductPageElements.HideOrUnhide).click();
		Thread.sleep(2000);
		ef.getWebElement("XPATH", AddProductPageElements.HideOrUnhide).click();
		Thread.sleep(2000);
	}
	public void BulkPricing() throws InterruptedException
	{
		ef.getWebElement("XPATH", AddProductPageElements.BulkPriceEnableOrDisable).click();
		Thread.sleep(2000);
		ef.getWebElement("XPATH", AddProductPageElements.MinQty).clear();
		ef.getWebElement("XPATH", AddProductPageElements.MinQty).sendKeys("30");
		ef.getWebElement("XPATH", AddProductPageElements.MaxQty).clear();
		ef.getWebElement("XPATH", AddProductPageElements.MaxQty).sendKeys("30");
		ef.getWebElement("XPATH", AddProductPageElements.BulkPrice).clear();
		ef.getWebElement("XPATH", AddProductPageElements.BulkPrice).sendKeys("30");
		ef.getWebElement("XPATH", AddProductPageElements.Popular).click();
		Thread.sleep(2000);
		ef.getWebElement("XPATH", AddProductPageElements.AddRule).click();
	}
	public void SalesTax() throws InterruptedException
	{
		ef.ScrollToEndOfThePage();
		Thread.sleep(2000);
		ef.getWebElement("XPATH", AddProductPageElements.SalesTax).click();
		ef.getWebElement("XPATH", AddProductPageElements.SelectCGST).click();
		ef.getWebElement("XPATH", AddProductPageElements.SelectSalesTaxMulti).click();
	}

	public void Logistics() throws InterruptedException
	{
		Thread.sleep(2000);
		ef.getWebElement("XPATH", AddProductPageElements.ClickOnLogistics).click();
		ef.getWebElement("XPATH", AddProductPageElements.UpdateQty).clear();
		ef.getWebElement("XPATH", AddProductPageElements.UpdateQty).sendKeys("20");
		ef.ScrollToEndOfThePage();
		ef.getWebElement("XPATH", AddProductPageElements.Width).sendKeys("20");
		ef.getWebElement("XPATH", AddProductPageElements.Height).sendKeys("20");
		ef.getWebElement("XPATH", AddProductPageElements.Depth).sendKeys("20");
		ef.getWebElement("XPATH", AddProductPageElements.Weight).sendKeys("20");
	}
	
	public void SEO() throws InterruptedException
	{
		Thread.sleep(2000);
		ef.getWebElement("XPATH", AddProductPageElements.ClickOnSEOTab).click();
		ef.getWebElement("XPATH", AddProductPageElements.SEOEnable).click();
		ef.getWebElement("XPATH", AddProductPageElements.SEOPageTitle).sendKeys("Seo Page Title");
		ef.getWebElement("XPATH", AddProductPageElements.SEOMetaDescription).sendKeys("Seo Meta description");
				
	}
	
	public void Variants() throws InterruptedException
	{
		ef.getWebElement("XPATH", AddProductPageElements.ClickOnVariantsTab).click();
		 Thread.sleep(2000);
		ef.getWebElement("XPATH", AddProductPageElements.SelectOption).click();
		Thread.sleep(3000);
		ef.getWebElement("XPATH", AddProductPageElements.SelectOptionColor).click();
		ef.getWebElement("XPATH", AddProductPageElements.SelectOptionValue).click();
		Thread.sleep(3000);
		ef.getWebElement("XPATH", AddProductPageElements.SelectOptionColorValue1).click();
		ef.getWebElement("XPATH", AddProductPageElements.SelectOptionColorValue2).click();
		Thread.sleep(3000);
		ef.getWebElement("XPATH", AddProductPageElements.VariantsMultiSelectionOption).click();
		ef.getWebElement("XPATH", AddProductPageElements.ClickOnVariantCheckBox).click();
		 Thread.sleep(3000);
		 ef.ScrollToEndOfThePage();
		ef.getWebElement("XPATH", AddProductPageElements.addVariantsButton).click();
		 Thread.sleep(3000);
		ef.getWebElement("XPATH", AddProductPageElements.SelectVariantDropdown).click();
		Thread.sleep(3000);
		ef.getWebElement("XPATH", AddProductPageElements.CreateVariantsFromallAttributes).click();
		Thread.sleep(3000);
		ef.getWebElement("XPATH", AddProductPageElements.ClickOnGo).click();
		Thread.sleep(3000);
		ef.getWebElement("XPATH", AddProductPageElements.ClickOnMenuIcon).click();
		ef.getWebElement("XPATH", AddProductPageElements.ClickOnEdit).click();
		 Thread.sleep(3000);
		 ef.ScrollToEndOfThePage();
		ef.getWebElement("XPATH", AddProductPageElements.VariantSKU).click();
		ef.getWebElement("XPATH", AddProductPageElements.VariantSKU).clear();
		ef.getWebElement("XPATH", AddProductPageElements.VariantSKU).sendKeys("skuvariant");
		 Thread.sleep(3000);
		ef.getWebElement("XPATH", AddProductPageElements.ClickOnVariantPricingTab).click();
		ef.getWebElement("XPATH", AddProductPageElements.ClickOnBackToPage).click();
		 Thread.sleep(3000);
	}
	
	public void Recommendation() throws InterruptedException
	{
		ef.getWebElement("XPATH", AddProductPageElements.ClickOnRecomendationTab).click();
		 Thread.sleep(3000);
		ef.getWebElement("XPATH", AddProductPageElements.RecomendadProductsEnable).click();
		ef.getWebElement("XPATH", AddProductPageElements.SelectProducts).click();
		ef.getWebElement("XPATH", AddProductPageElements.SearchProduct).click();
		ef.getWebElement("XPATH", AddProductPageElements.RecMultiSelectOption).click();
	}
	
	public void SaveProduct()
	{
		ef.getWebElement("XPATH", AddProductPageElements.ClickOnSaveButton).click();
	}
	
	public void Cancel() 
	{
		ef.getWebElement("XPATH", AddProductPageElements.ClickOnCancelButton).click();
	}
}
