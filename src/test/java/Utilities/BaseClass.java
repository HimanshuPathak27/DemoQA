package Utilities;

import org.apache.logging.log4j.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.ButtonsPage;
import PageObjects.CheckBoxPage;
import PageObjects.LinksPage;
import PageObjects.RadioButtonPage;
import PageObjects.TestBackground;
import PageObjects.TextBoxPage;
import PageObjects.WebTablePage;

public class BaseClass {

	public static WebDriver ldriver;
	public JavascriptExecutor js;
	public Actions act;
	public static Logger log;
	public static WebDriverWait wait;

	public TestBackground testBG;
	public TextBoxPage textBoxPage;
	public CheckBoxPage checkBoxPage;
	public RadioButtonPage radioButtonPage;
	public WebTablePage webTablePage;
	public ButtonsPage buttonsPage;
	public LinksPage linksPage;
}
