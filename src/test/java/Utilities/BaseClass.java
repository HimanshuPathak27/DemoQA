package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import PageObjects.HomePage;
import PageObjects.TextBoxPage;

public class BaseClass {

	public static WebDriver ldriver;
	public JavascriptExecutor js;
	
	public HomePage homePage;
	public TextBoxPage textBoxPage;
	
}
