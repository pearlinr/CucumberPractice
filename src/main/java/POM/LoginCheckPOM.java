package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginCheckPOM {
	public static WebDriver driver;

	public LoginCheckPOM(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

//=====login===
	@FindBy(xpath = "//img[@class='logo img-responsive']")
	private WebElement logo;
	@FindBy(xpath = "//a[@title='Log in to your customer account']")
	private WebElement signIn;
	@FindBy(id = "email")
	private WebElement email;
	@FindBy(id = "passwd")
	private WebElement password;
	@FindBy(id = "SubmitLogin")
	private WebElement submitButton;
	@FindBy(xpath = "//a[@class='account']")
	private WebElement userName;

// ===logout===
	@FindBy(xpath = "//a[@class='logout']")
	private WebElement logout;
	@FindBy(xpath = "//a[@class='login']")
	private WebElement loginButton;

//===All getters====	
	public WebElement getLogo() {
		return logo;
	}

	public WebElement getSignIn() {
		return signIn;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

}
