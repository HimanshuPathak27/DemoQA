package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.BaseClass;

public class LinksPage extends BaseClass{

	public LinksPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);

		js = (JavascriptExecutor) ldriver;

	}

	@FindBy(xpath="//span[text()='Links']/..")
	WebElement linksButton;

	@FindBy(linkText = "Created")
	WebElement createdLink;

	@FindBy(linkText = "No Content")
	WebElement noContentLink;

	@FindBy(linkText = "Moved")
	WebElement movedLink;

	@FindBy(linkText = "Bad Request")
	WebElement badRequestLink;

	@FindBy(linkText = "Unauthorized")
	WebElement unauthorizedLink;

	@FindBy(linkText = "Forbidden")
	WebElement forbiddenLink;

	@FindBy(linkText = "Not Found")
	WebElement notFoundLink;

	@FindBy(xpath="//p[@id='linkResponse']//b[1]")
	WebElement APIResponseCode;

	@FindBy(xpath="//p[@id='linkResponse']//b[2]")
	WebElement APIResponseMessage;

	public void clickLinksButton() {

		js.executeScript("arguments[0].scrollIntoView()", linksButton);

		try {
			if(linksButton.isDisplayed() && linksButton.isEnabled()){
				try {
					linksButton.click();
				} catch (Exception e) {
					log.info("FAILED | Radio button click is intercepted");
					log.error("ERROR | " + e.getMessage() + " | " + e);
				}
			}
		}
		catch (Exception e) {
			log.info("FAILED | Links button is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

	}

	public String[] validateCreatedLinkResponses() {

		try {
			js.executeScript("arguments[0].scrollIntoView()", createdLink);

			if(createdLink.isDisplayed() && createdLink.isEnabled()){
				try {
					createdLink.click();
					log.info("PASSED | Created Link clicked");
				}
				catch (Exception e) {
					log.info("FAILED | Created Link click is intercepted");
					log.error("ERROR | " + e.getMessage() + " | " + e);
				}
			}
		}
		catch (Exception e) {
			log.info("FAILED | Created Link is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

		String[] responses = new String[2];
		responses[0] = "";
		responses[1] = "";

		/*
		 * Avoiding use of Explicit wait bcz same element is triggering for responses. So hard wait is necessity
		 * 
		 * wait.until(ExpectedConditions.visibilityOf(APIResponseCode));
		 */
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		try {
			responses[0] = APIResponseCode.getText();
			responses[1] = APIResponseMessage.getText();
		}
		catch (Exception e) {
			log.info("FAILED | Unable to fetch API responses");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

		return responses;

	}

	public String[] validateNoContentLinkResponses() {

		try {
			if(noContentLink.isDisplayed() && noContentLink.isEnabled()){
				try {
					noContentLink.click();
				}
				catch (Exception e) {
					log.info("FAILED | No Content Link click is intercepted");
					log.error("ERROR | " + e.getMessage() + " | " + e);
				}
			}
		}
		catch (Exception e) {
			log.info("FAILED | No Content Link is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

		String[] responses = new String[2];
		responses[0] = "";
		responses[1] = "";

		/*
		 * Avoiding use of Explicit wait bcz same element is triggering for responses. So hard wait is necessity
		 * 
		 * wait.until(ExpectedConditions.visibilityOf(APIResponseCode));
		 */
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		try {
			responses[0] = APIResponseCode.getText();
			responses[1] = APIResponseMessage.getText();
		}
		catch (Exception e) {
			log.info("FAILED | Unable to fetch API responses");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

		return responses;

	}

	public String[] validateMovedLinkResponses() {

		try {
			if(movedLink.isDisplayed() && movedLink.isEnabled()){
				try {
					movedLink.click();
				}
				catch (Exception e) {
					log.info("FAILED | Moved Link click is intercepted");
					log.error("ERROR | " + e.getMessage() + " | " + e);
				}
			}
		}
		catch (Exception e) {
			log.info("FAILED | Moved Link is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

		String[] responses = new String[2];
		responses[0] = "";
		responses[1] = "";

		/*
		 * Avoiding use of Explicit wait bcz same element is triggering for responses. So hard wait is necessity
		 * 
		 * wait.until(ExpectedConditions.visibilityOf(APIResponseCode));
		 */
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		try {
			responses[0] = APIResponseCode.getText();
			responses[1] = APIResponseMessage.getText();
		}
		catch (Exception e) {
			log.info("FAILED | Unable to fetch API responses");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

		return responses;

	}

	public String[] validateBadRequestLinkResponses() {

		try {
			if(badRequestLink.isDisplayed() && badRequestLink.isEnabled()){
				try {
					badRequestLink.click();
				}
				catch (Exception e) {
					log.info("FAILED | Bad Request Link click is intercepted");
					log.error("ERROR | " + e.getMessage() + " | " + e);
				}
			}
		}
		catch (Exception e) {
			log.info("FAILED | Bad Request Link is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

		String[] responses = new String[2];
		responses[0] = "";
		responses[1] = "";

		/*
		 * Avoiding use of Explicit wait bcz same element is triggering for responses. So hard wait is necessity
		 * 
		 * wait.until(ExpectedConditions.visibilityOf(APIResponseCode));
		 */
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		try {
			responses[0] = APIResponseCode.getText();
			responses[1] = APIResponseMessage.getText();
		}
		catch (Exception e) {
			log.info("FAILED | Unable to fetch API responses");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

		return responses;

	}

	public String[] validateUnauthorizedLinkResponses() {

		try {
			if(unauthorizedLink.isDisplayed() && unauthorizedLink.isEnabled()){
				try {
					unauthorizedLink.click();
				}
				catch (Exception e) {
					log.info("FAILED | Unauthorized Link click is intercepted");
					log.error("ERROR | " + e.getMessage() + " | " + e);
				}
			}
		}
		catch (Exception e) {
			log.info("FAILED | Unauthorized Link is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

		String[] responses = new String[2];
		responses[0] = "";
		responses[1] = "";

		/*
		 * Avoiding use of Explicit wait bcz same element is triggering for responses. So hard wait is necessity
		 * 
		 * wait.until(ExpectedConditions.visibilityOf(APIResponseCode));
		 */
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		try {
			responses[0] = APIResponseCode.getText();
			responses[1] = APIResponseMessage.getText();
		}
		catch (Exception e) {
			log.info("FAILED | Unable to fetch API responses");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

		return responses;

	}

	public String[] validateFrobiddenLinkResponses() {

		try {
			js.executeScript("arguments[0].scrollIntoView()", forbiddenLink);

			if(forbiddenLink.isDisplayed() && forbiddenLink.isEnabled()){
				try {
					forbiddenLink.click();
				}
				catch (Exception e) {
					log.info("FAILED | Forbidden Link click is intercepted");
					log.error("ERROR | " + e.getMessage() + " | " + e);
				}
			}
		}
		catch (Exception e) {
			log.info("FAILED | Forbidden Link is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

		String[] responses = new String[2];
		responses[0] = "";
		responses[1] = "";

		/*
		 * Avoiding use of Explicit wait bcz same element is triggering for responses. So hard wait is necessity
		 * 
		 * wait.until(ExpectedConditions.visibilityOf(APIResponseCode));
		 */
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		try {
			responses[0] = APIResponseCode.getText();
			responses[1] = APIResponseMessage.getText();
		}
		catch (Exception e) {
			log.info("FAILED | Unable to fetch API responses");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

		return responses;

	}

	public String[] validateNotFoundLinkResponses() {

		try {
			if(notFoundLink.isDisplayed() && notFoundLink.isEnabled()){
				try {
					notFoundLink.click();
				}
				catch (Exception e) {
					log.info("FAILED | Not Found Link click is intercepted");
					log.error("ERROR | " + e.getMessage() + " | " + e);
				}
			}
		}
		catch (Exception e) {
			log.info("FAILED | Not Found Link is not Displayed or Enabled");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

		String[] responses = new String[2];
		responses[0] = "";
		responses[1] = "";

		/*
		 * Avoiding use of Explicit wait bcz same element is triggering for responses. So hard wait is necessity
		 * 
		 * wait.until(ExpectedConditions.visibilityOf(APIResponseCode));
		 */
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		try {
			responses[0] = APIResponseCode.getText();
			responses[1] = APIResponseMessage.getText();
		}
		catch (Exception e) {
			log.info("FAILED | Unable to fetch API responses");
			log.error("ERROR | " + e.getMessage() + " | " + e);
		}

		return responses;

	}

}
