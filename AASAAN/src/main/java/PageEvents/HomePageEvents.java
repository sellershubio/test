package PageEvents;

import PageElements.HomePageElements;
import Utils.ElementFetch;

public class HomePageEvents {

	ElementFetch ef=new ElementFetch();
	public void ClickOnHomePage() {
		ef.getWebElement("XPATH", HomePageElements.HomePage).click();
	}
	public void ClickOnProductsPage() {
		ef.getWebElement("XPATH", HomePageElements.ProductsPage).click();
	}
	public void ClickOnCategoriesPage() {
		ef.getWebElement("XPATH", HomePageElements.CategoriesPage).click();
	}
	public void ClickOnBrandsPage() {
		ef.getWebElement("XPATH", HomePageElements.BrandsPage).click();
	}
	public void ClickOnReviewsPage() {
		ef.getWebElement("XPATH", HomePageElements.ReviewsPage).click();
	}
	public void ClickOnOrdersPage() {
		ef.getWebElement("XPATH", HomePageElements.OrdersPage).click();
	}
	
}
