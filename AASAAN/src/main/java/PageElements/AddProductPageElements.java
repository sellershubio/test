package PageElements;

public interface AddProductPageElements {
// Elements of General Page
	String NewProductButton="//div[@class='btn__text']";
	String ProductName="//input[@placeholder='Name']";
	String ProductType="//p[contains(text(),'Item has weight and must be shipped or picked up b')]";
	String Description=".public-DraftEditor-content:nth-child(1)";
	String ShortDescription="(//div[contains(@class, 'public-DraftEditor-content') and @aria-label='rdw-editor'])[2]";
	String Images="//*[@class='fa-regular fa-cloud-arrow-up']";
	String VideoUrl="//input[@id='videourl']";
	String Categories="//div[contains(text(),'Select Categories')]";
	//String SelectedCategory="//h6[normalize-space()='TestCategory1']"; 
	String CategorySearch=" (//*[@class='body-md ls-md mb-0' and text()='Test Category'])[1]";
	String MultiSelectionOption="//*[@class='multi__selected-options']";
	String Brands="//div[contains(text(),'Select Brands')]";
	String BrandsSelect="//*[@class='body-md ls-md mb-0' and text()='Head & Shoulders']";
	String BrandClick="(//*[@class='select__btn'])[2]";
	String Tags="//div[contains(text(),'Select Tags')]";
	String TagsSelect="//*[@class='body-md ls-md mb-0' and text()='test']";
	String TagsClick="(//*[@class='select__btn'])[3]";
	String Sku="//input[contains(@name,'sku')]";
	String GTIN="//input[@name='gtinNumber']";
	String CustomFieldsEnableorDisable="//*[@type='checkbox']";
	String SelectCustomField="//*[@class='content__left' and text()='Select Custom Field']";
	String SelectCustomFieldValueSelect="//*[@class='body-md ls-md mb-0' and text()='Test2']";
	String SelectCustomeFieldClick="(//*[@class='select__btn'])[4]";
	String Manage="";
	String TrustedBadge="";
	String SizeChart="";
	
	//Elements of Pricing
	String ClickOnPricingTab="//*[@class='heading-xs ls-md mb-0 mr-2' and text()='Pricing *']";
	String MSRP="(//*[@type='number' and @placeholder='100'])[1]";
	String SellingPrice="(//*[@type='number' and @placeholder='100'])[2]";
	String HideOrUnhide="(//*[@type='checkbox'])[1]";
	String BulkPriceEnableOrDisable="(//*[@type='checkbox'])[2]";
	String MinQty="(//*[@type='number' and @placeholder='1'])[1]";
	String MaxQty="(//*[@type='number' and @placeholder='1'])[2]";
	String BulkPrice="(//*[@type='number' and @placeholder='1'])[3]";
	String Popular="//*[@class='checkbox__wrapper']";
	String AddRule="//*[@class='btn__text' and text()='Add Rule']";
	String SalesTax="//*[@class='s-content__left' and text()='Select..']";
	String SelectCGST="//*[@class='body-md ls-md mb-0' and text()='cgst']";
	String SelectSalesTaxMulti="//*[@class='multi__selected-options']";
	
	
}
