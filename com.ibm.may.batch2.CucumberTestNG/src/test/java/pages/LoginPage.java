package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.WaitHelper;

public class LoginPage {

	public WebDriver ldriver;
	public WaitHelper cond_wait;

	public LoginPage(WebDriver rdriver) {
		
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
		
		cond_wait = new WaitHelper(ldriver);
		
		
		
		
		
	}
	
	@FindBy(id = "Email")
	WebElement txtEmail;

	@FindBy(id = "Password")
	WebElement txtPassword;

	/*
	 * @FindBy(xpath = "//input[@value='Log in']")
	 * 
	 * @CacheLookup WebElement btnLogin;
	 */
	
	@FindBy(css = ".button-1")
	WebElement btnLogin;

	@FindBy(linkText = "Logout")
	WebElement lnkLogout;
	
	
	public void setUserName(String uname) {
		txtEmail.clear();
		txtEmail.sendKeys(uname);

	}

	public void setPassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}

	public void clickLogin() {
		btnLogin.click();
	}

	public void clickLogout() {
		lnkLogout.click();
	}
	
}
