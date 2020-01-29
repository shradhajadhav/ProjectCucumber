package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {

	public PageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "SignIn")
	public WebElement signin;

	@FindBy(name = "userName")
	public WebElement username;

	@FindBy(name = "password")
	public WebElement password;

	@FindBy(name = "Login")
	public WebElement Login;

}
