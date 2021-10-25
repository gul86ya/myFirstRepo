package stepDefinitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPageObjects;

public class LoginStepDef extends Base {

	//Each step in scenario should have 
	//one java method associated with that step
	//we can't have duplicate methods for step in 
	//scenario steps
	// in order to  get access to POM class method we need to creat 
	//object of LoginPageObject = new LoginPageObject();
	 
	LoginPageObjects loginPageObject = new LoginPageObjects();
	
	
	
	
	@Given("^user is on Retail website$")
	public void user_user_is_on_Retair_website() {
	System.out.println("First step");
	String  actualPageTittle = driver.getTitle();
	String expectPageTittle = "TEK SCHOOL";
	Assert.assertEquals(expectPageTittle, actualPageTittle);
	}
	
	
	@When("^user click on Myaccount$")
	public void user_click_oN_Myaccount() {
	System.out.println("Second step");
	loginPageObject.clicOnMyAccount();
	}
	@And ("^user click on Login option$")
	public void user_click_on_login_option() {
    System.out.println("Third step");
    loginPageObject.clickonLogin();
	} 
	
	@And ("^user enter userName '(.+)'and password'(.+)'$")
	public void user_enter_userName_and_password(String uName,String pass) {
	System.out.println("Fifth step");
	loginPageObject.enterEmailAndPassword(uName, pass);
	}
	
	@And ("^user click on Login BUtton$")
	public void user_click_on_Login_Button() {
	System.out.println("Six step");
	loginPageObject.clickOnLoginButton();
	}
	@Then ("^user should be logged in to Myaccount dashboard$")
    public void user_should_be_logged_in_to_Myaccount_dashboard() {
    System.out.println("Seven step");
    Assert.assertTrue(loginPageObject.myAccountTextisPresent());
	}

}