package Utilities;

import org.apache.logging.log4j.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import PageObjects.ButtonsPage;
import PageObjects.CheckBoxPage;
import PageObjects.HomePage;
import PageObjects.RadioButtonPage;
import PageObjects.TextBoxPage;
import PageObjects.WebTablePage;

public class BaseClass {

	public static WebDriver ldriver;
	public JavascriptExecutor js;
	public Actions act;
	public static Logger log;
	
	public HomePage homePage;
	public TextBoxPage textBoxPage;
	public CheckBoxPage checkBoxPage;
	public RadioButtonPage radioButtonPage;
	public WebTablePage webTablePage;
	public ButtonsPage buttonsPage;
}
