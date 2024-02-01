package PageEvents;

import PageElements.LoginPageElements;
import Utils.ElementFetch;
import Utils.Constants;


public class LoginPageEvents {

	//LoginPageElements lpe=new LoginPageElements();
	ElementFetch ef=new ElementFetch();
	public void login()
	{
		ef.getWebElement("XPATH", LoginPageElements.UserID).sendKeys(Constants.ID);
		ef.getWebElement("XPATH", LoginPageElements.Password).sendKeys(Constants.Password);
		ef.getWebElement("XPATH", LoginPageElements.LoginButton).click();
	}
}
