package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TexBoxPage {

	WebDriver ldriver;

	public TexBoxPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	@FindBy(xpath = "//div//h5[text()='Elements']")
	WebElement elementsTile;
	
	public void clickElementsTile() {
		elementsTile.click();	
		}
	
	public String validateLandingPageTitle() {
		String actualTitle = ldriver.getTitle();
		return actualTitle;
	}
}
