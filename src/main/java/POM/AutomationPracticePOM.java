package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationPracticePOM {
	public static WebDriver driver;

	public AutomationPracticePOM(WebDriver ldriver) {
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

//====Order 1: mouse-over====
	@FindBy(xpath = "(//a[@class='sf-with-ul'])[1]")
	private WebElement womenIcon;
	@FindBy(xpath = "(//a[@href='http://automationpractice.com/index.php?id_category=7&controller=category'])[1]")
	private WebElement blouseIcon;
	@FindBy(xpath = "(//img[@class='replace-2x img-responsive'])[2]")
	private WebElement productImage;
	@FindBy(xpath = "//a[@class='button lnk_view btn btn-default']")
	private WebElement moreButtonForProductDetails;
	@FindBy(xpath = "//i[@class='icon-plus']")
	private WebElement quantityIncrementIcon;
	@FindBy(name = "qty")
	private WebElement productQuantityCheck;
	@FindBy(name = "group_1")
	private WebElement productSize;
	@FindBy(name = "Black")
	private WebElement productColour;

//====Order 2: search dresses====	
	@FindBy(name = "search_query")
	private WebElement searchField;
	@FindBy(name = "submit_search")
	private WebElement searchSubmit;
	@FindBy(xpath = "(//p[@class='product-description'])[5]")
	private WebElement scrollUpto;
	@FindBy(xpath = "//img[@title='Faded Short Sleeve T-shirts']")
	private WebElement productMouseOver;

//====Common check-out=====	
	@FindBy(id = "add_to_cart")
	private WebElement addToCart;
	@FindBy(xpath = "(//i[@class='icon-chevron-right right'])[2]")
	private WebElement proceed1;
	@FindBy(xpath = "//a[@class='button btn btn-default standard-checkout button-medium']")
	private WebElement proceed2;
	@FindBy(name = "processAddress")
	private WebElement addressCheck;
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkBox;
	@FindBy(name = "processCarrier")
	private WebElement proceed3;
	@FindBy(xpath = "//a[@class='bankwire']")
	private WebElement payment;
	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
	private WebElement proceed4;
	@FindBy(xpath = "(//strong[@class='dark'])[6]")
	private WebElement orderConfiramtion;
	@FindBy(xpath = "//a[@class='button-exclusive btn btn-default']")
	private WebElement orderHistoryPage;
	@FindBy(xpath = "//a[@class='color-myaccount']")
	private WebElement orderNumber;

//===logout===
	@FindBy(xpath = "//a[@class='logout']")
	private WebElement logout;
	@FindBy(xpath = "//a[@class='login']")
	private WebElement loginButton;

// ===All getters====
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

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getWomenIcon() {
		return womenIcon;
	}

	public WebElement getBlouseIcon() {
		return blouseIcon;
	}

	public WebElement getProductImage() {
		return productImage;
	}

	public WebElement getMoreButtonForProductDetails() {
		return moreButtonForProductDetails;
	}

	public WebElement getQuantityIncrementIcon() {
		return quantityIncrementIcon;
	}

	public WebElement getProductQuantityCheck() {
		return productQuantityCheck;
	}

	public WebElement getProductSize() {
		return productSize;
	}

	public WebElement getProductColour() {
		return productColour;
	}

	public WebElement getSearchField() {
		return searchField;
	}

	public WebElement getSearchSubmit() {
		return searchSubmit;
	}

	public WebElement getScrollUpto() {
		return scrollUpto;
	}

	public WebElement getProductMouseOver() {
		return productMouseOver;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getProceed1() {
		return proceed1;
	}

	public WebElement getProceed2() {
		return proceed2;
	}

	public WebElement getAddressCheck() {
		return addressCheck;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getProceed3() {
		return proceed3;
	}

	public WebElement getPayment() {
		return payment;
	}

	public WebElement getProceed4() {
		return proceed4;
	}

	public WebElement getOrderConfiramtion() {
		return orderConfiramtion;
	}

	public WebElement getOrderHistoryPage() {
		return orderHistoryPage;
	}

	public WebElement getOrderNumber() {
		return orderNumber;

	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
}
