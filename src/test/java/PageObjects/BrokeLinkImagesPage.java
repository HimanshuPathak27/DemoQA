package PageObjects;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class BrokeLinkImagesPage extends BaseClass{

	public BrokeLinkImagesPage(WebDriver rdriver){
		ldriver =rdriver;
		PageFactory.initElements(ldriver, this);

		js = (JavascriptExecutor) ldriver;
	}

	@FindBy(xpath="//span[text()='Broken Links - Images']/..")
	WebElement brokenLinkImagesButton;

	@FindBy(xpath="//h1")
	WebElement pageHeader;

	@FindBy(xpath="//p[text()='Valid image']/../img[1]")
	WebElement validImage;

	@FindBy(xpath="//p[text()='Valid image']/../img[2]")
	WebElement brokenImage;

	@FindBy(xpath="//p[text()='Valid image']/../a[1]")
	WebElement validLink;

	@FindBy(xpath="//p[text()='Valid image']/../a[2]")
	WebElement brokenLink;

	public int getResponseStatus(String url) throws IOException {
		HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
		connection.setRequestMethod("HEAD");
		connection.connect();
		int responseCode = connection.getResponseCode();
		connection.disconnect();
		return responseCode;
	}


	// Click on Broken Link Images button on left rail
	public void clickBrokenLinkImagesButton() {

		try {
			js.executeScript("arguments[0].scrollIntoView()", brokenLinkImagesButton);

			if(brokenLinkImagesButton.isDisplayed() && brokenLinkImagesButton.isEnabled()) {
				try {
					brokenLinkImagesButton.click();
				}
				catch (Exception e) {
					log.info("FAILED | Broken Link Images button click is intercepted");
					log.error("ERROR | " + e.getMessage() + " | " + e);
				}
			}
		}
		catch (Exception e) {
			log.info("FAILED | Broken Link Images button is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}
	}

	//Validate header of Broken Link Images page
	public String verifyPageHeader() {

		String actPageHeader = "";

		try {
			if(pageHeader.isDisplayed()) {
				actPageHeader = pageHeader.getText();
			}
		} 
		catch (Exception  e) {
			log.info("FAILED | Page Header is not Displayed");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

		return actPageHeader;

	}

	//Validate the Valid Image
	public int verifyValidImage() {

		int statusCode = 0 ;

		try {
			if(validImage.isDisplayed()) {

				try {
					String imageURL = validImage.getAttribute("src");
					Dimension imageSize = validImage.getSize();

					if (imageURL != null && !imageURL.isEmpty() && imageSize.getHeight() != 0 && imageSize.getWidth() != 0) {
						statusCode = getResponseStatus(imageURL);
					}

				}
				catch (Exception e) {
					log.info("FAILED | Unable to fetch status code of Valid Image");
					log.error("ERROR | " + e.getMessage() + " | " + e);
				}
			}
		}
		catch (Exception e) {
			log.info("FAILED | Valid Image is not Displayed");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}
		return statusCode;
	}

	//Validate the Broken Image
	public int verifyBrokenImage() {

		int statusCode = 0 ;

		try {
			if(brokenImage.isDisplayed()) {

				try {
					String imageURL = brokenImage.getAttribute("src");
					int imageWidth = validImage.getSize().getWidth();
					int imageHeight = validImage.getSize().getHeight();

					if (imageURL != null && !imageURL.isEmpty() && imageWidth != 0 && imageHeight != 0) {
						statusCode = getResponseStatus(imageURL);
					}
				}
				catch (Exception e) {
					log.info("FAILED | Unable to fetch status code of Broken Image");
					log.error("ERROR | " + e.getMessage() + " | " + e);
				}
			}
		}
		catch (Exception e) {
			log.info("FAILED | Broken Image is not Displayed");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}
		return statusCode;
	}

	//Validate the Valid Link
	public int verifyValidLink() {

		int statusCode = 0 ;

		try {
			if(validLink.isDisplayed()) {

				try {
					String URL = validLink.getAttribute("a");

					if (URL != null && !URL.isEmpty()) {
						statusCode = getResponseStatus(URL);
					}
				}
				catch (Exception e) {
					log.info("FAILED | Unable to fetch status code of Valid URL");
					log.error("ERROR | " + e.getMessage() + " | " + e);
				}
			}
		}
		catch (Exception e) {
			log.info("FAILED | Valid URL is not Displayed");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}
		return statusCode;
	}

	//Validate the Broken Link
	public int verifyBrokenLink() {

		int statusCode = 0 ;

		try {
			if(brokenLink.isDisplayed()) {

				try {
					String URL = brokenLink.getAttribute("a");

					if (URL != null && !URL.isEmpty()) {
						statusCode = getResponseStatus(URL);
					}
				}
				catch (Exception e) {
					log.info("FAILED | Unable to fetch status code of Broken URL");
					log.error("ERROR | " + e.getMessage() + " | " + e);
				}
			}
		}
		catch (Exception e) {
			log.info("FAILED | Broken URL is not Displayed");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}
		return statusCode;
	}

}
