package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LoginPageObjects extends Base {

	//in this class we will store UI elements of Login page 
	//we will implement PageFactory.initElement method to initialize the page elements
	//we will use @FindBy annotations to store UI WebElements
	//we will store UI elements as Private WebElements and access them
	//Through public methods and we will  write the function inside the public 
	//methods.
	/**
	 * this constructor will use to initialize the WebElements inside this POM class 
	 * we will create PageFactory.InitElements method inside the constructor 
	 */
	
	
	public LoginPageObjects() {
	PageFactory.initElements(driver,this);
	}
    //PageFactory class provides an annotation @findby to find UI elements 
	//@findby == driver.findElements()
	
	@FindBy(xpath = "//span[text()='My Account']")
    private WebElement myAccount;
    @FindBy(xpath = "//span[text()='Login']")
	private WebElement login;
	@FindBy(id="input-email")
	private WebElement email;
	@FindBy(id="input-password")
	private WebElement password;
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButton;
	@FindBy(xpath ="//h2[text(=My Account']")
	private WebElement MyAccountText;
	
	
	public void clicOnMyAccount() {
		myAccount.click();
		
	
	}
		
	public void clickonLogin()	{
		login.click();
		
	}	
	public void enterEmailAndPassword(String EmailValue, String PasswordValue) {	
	email.sendKeys(EmailValue);	
	password.sendKeys(PasswordValue);	
	}
	
	public void clickOnLoginButton() {
	loginButton.click();

	
	}
	
	public boolean myAccountTextisPresent() {
		if(MyAccountText.isDisplayed())
			return true;
			else
				return false;
	}
	}











