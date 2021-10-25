package stepDefinitions;

import core.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class initializer extends Base {
	////in this class we will define Before Hooks and After hooks of cuccumber
	//before hooks will run before each scenario
	//after hooks will run after each scenario
	
	
	@Before
	public void beforHooks(Scenario scenario) {
     browser();//
     openBrowser();//
	}
  
	
	@After
    public void afterHooks(Scenario scenario) {
		tearDown();
	}
	}