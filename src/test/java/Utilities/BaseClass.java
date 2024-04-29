package Utilities;

import org.apache.logging.log4j.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import PageObjects.CheckBoxPage;
import PageObjects.HomePage;
import PageObjects.TextBoxPage;

public class BaseClass {

	public static WebDriver ldriver;
	public JavascriptExecutor js;
	public static Logger log;
	
	public HomePage homePage;
	public TextBoxPage textBoxPage;
	public CheckBoxPage checkBoxPage;
}
