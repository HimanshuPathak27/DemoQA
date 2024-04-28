package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class HomePage extends BaseClass {
	
	public HomePage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}

	@FindBy(xpath = "//h5[text()='Elements']/..")
	WebElement elementsTile;
	
	public String verifyHomePageTitle() {
		String homePageTitle = ldriver.getTitle();
		return homePageTitle;
	}
	
	public void clickElementsTile() {
		js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].scrollIntoView()", elementsTile);
		elementsTile.isEnabled();
		elementsTile.click();
	}
}
