package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.BaseTest;

public class ElementFetch {
	//WebDriver driver;
	public WebElement getWebElement(String IdentifierType, String IdentifierValue)
	{
		//driver=getDriver();
		switch(IdentifierType)
		{
			case "XPATH": 
			return BaseTest.driver.findElement(By.xpath(IdentifierValue));
			
			case "ID":
				return BaseTest.driver.findElement(By.id(IdentifierValue));	
				
			case "CSS":
				return BaseTest.driver.findElement(By.cssSelector(IdentifierValue));
				
			 default:
				 return null;
		}
			
	}
	public void Scroll(WebElement Element)
	{
		JavascriptExecutor jse = (JavascriptExecutor) BaseTest.driver;

		jse.executeScript("arguments[0].scrollIntoView();", Element);
		jse.executeScript("window.scrollBy(2*window.innerHieght,0)");
		 //jse.executeScript("window.scrollBy(0, 5 * window.innerHeight)");

	}
	public void ScrollToEndOfThePage()
	{
		JavascriptExecutor jse = (JavascriptExecutor) BaseTest.driver;

		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");

	}
}
