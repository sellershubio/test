package PageEvents;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Base.BaseTest;
import PageElements.HomePageElements;
import Utils.ElementFetch;

public class CategoriesPageEvents extends BaseTest
{
	ElementFetch ef=new ElementFetch();
	public void ClickedOnCategories() throws InterruptedException {
     ef.getWebElement("XPATH",HomePageElements.CategoriesPage).click();
		Thread.sleep(200);

	}

	public void ClickedOnNewCategoryButton() {
		driver.findElement(By.xpath("//*[@class='btn__text' and text()='New Category']")).click();
	}

	public void EnterTheCategoryName(String CategoryName) {
		// Enter the Category Name
		driver.findElement(By.xpath("//*[@placeholder=\"Name\"]")).click();
		driver.findElement(By.xpath("//*[@placeholder=\"Name\"]")).sendKeys(CategoryName);

	}

	public void SelectTheParentCategory() throws InterruptedException {
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@class=\"s-content__left\" and text()='Select..']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("(//*[@class='body-md ls-md mb-0'])[1]")).click();
	}

	public void EnterTheCategoryDescription(String Descriptin) {
		driver.findElement(By.cssSelector("textarea")).click();
		driver.findElement(By.xpath("(//textarea[@placeholder=\"Description\"])[1]")).sendKeys(Descriptin);

	}
	
	public void ClickOnHome() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),\"Home\")]")).click();
	}
	
	public void HideOrUnhidecategory() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@class=\"icon__box icon__secondary undefined \" and @title='Hide'])[1]")).click();

	}
	
	public void ClickOnMenu() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@class=\"fa-solid fa-ellipsis\"])[1]")).click();
	}

	public void EditCategory() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@title=\"Edit\"])[1]")).click();
	}
	
	public void DeleteCategory() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@title=\"Delete\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class=\"btn__text\" and text()='Delete']")).click();

	}
	public void SearchCategory(String searchcategory) throws InterruptedException {
		driver.findElement(By.className("input__content-left")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder=\"Search\"]")).clear();
		driver.findElement(By.xpath("//input[@placeholder=\"Search\"]")).sendKeys(searchcategory);

		Actions enter1 = new Actions(driver);
		enter1.sendKeys(Keys.chord(Keys.ENTER)).perform();

	}
	
	public void ClickOnSaveButton() {
		driver.findElement(By.xpath("(//*[@class=\"btn__text\"])[2]")).click();
		}

	public void scrolldown() {
		// jse.executeScript("window.scrollTo(0,1000)");
		JavascriptExecutor jse = (JavascriptExecutor) BaseTest.driver;
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	public void EnableGoogleShopping() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) BaseTest.driver;
		driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[1]")).click();
		Thread.sleep(1000);
		WebElement eg=driver.findElement(By.xpath("(//*[contains(@class, 'content__left') and contains(text(), 'Select..')])[2]"));
		jse.executeScript("arguments[0].scrollIntoView();", eg);
		eg.click();
		driver.findElement(By.xpath("//h6[contains(text(),\"Animals & Pet Supplies\")]")).click();
		//driver.findElement(By.xpath("//*[@class=\"fa-solid fa-circle-xmark\"]")).click();
		//driver.findElement(By.xpath("//h6[contains(text(),\"Animals & Pet Supplies\")]")).click();
		Thread.sleep(1000);
	}

	public void EnableSEO() throws AWTException, InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor) BaseTest.driver;
		driver.findElement(By.xpath("(//*[@type=\"checkbox\"])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder=\"Page Title\"]")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"Page Title\"]")).sendKeys("Test");
		WebElement des=driver.findElement(By.xpath("(//textarea[@placeholder=\"Description\"])[2]"));
		jse.executeScript("arguments[0].scrollIntoView();", des);
		des.click();
		scrolldown();
		WebElement des1=driver.findElement(By.xpath("(//textarea[@placeholder=\"Description\"])[2]"));
		jse.executeScript("arguments[0].scrollIntoView();", des1);
		des1.sendKeys("Test");
		jse.executeScript("window.scrollTo(0,5000)");
		Thread.sleep(1000);
		jse.executeScript("window.scrollTo(0,1000)");
		driver.findElement(By.xpath("(//*[@class=\"file__uploaded-images\"])[2]")).click();
		jse.executeScript("window.scrollTo(0,1000)");
		Thread.sleep(1000);
		
		Thread.sleep(1000);

	}
	
	public void UploadTheImage() throws AWTException, InterruptedException {

		Robot rb = new Robot();
		String filename = System.getProperty("user.dir") + "\\driver\\Images\\ezgif.com-webp-to-jpg (2).jpg";
		StringSelection Str = new StringSelection(filename);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Str, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		Thread.sleep(500);
		rb.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		Actions enter = new Actions(driver);
		enter.sendKeys(Keys.chord(Keys.ENTER)).perform();
		Thread.sleep(1000);

	}
}
