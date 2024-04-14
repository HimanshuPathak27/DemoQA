package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver ldriver;
	JavascriptExecutor js;
	
	public HomePage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
		
		 js = (JavascriptExecutor)ldriver;
	}
	
	@FindBy(xpath = "//h5[text()='Elements']/..")
	WebElement elementsTile;
	
	public String verifyHomePageTitle() {
		String homePageTitle = ldriver.getTitle();
		return homePageTitle;
	}
	
	public void clickElementsTile() {
		js.executeScript("arguments[0].scrollIntoView();", elementsTile);
		elementsTile.isEnabled();
		elementsTile.click();
	}
}
