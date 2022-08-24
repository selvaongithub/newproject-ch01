package org.stepdefni;

import java.util.List;

import org.junit.Assert;
import org.pagerepos.Loginpagerepo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Loginpagestepdefsenariooutline {
	
	@Given("open Fb and launch the application")
	public void open_Fb_and_launch_the_application() {
//		List<String>asList=dt.asList();
//		System.out.println(asList.get(0));
//		System.out.println(asList.get(1));
//		System.out.println(asList.get(2));
		Hook. driver.get("http://www.facebook.com");
	  // Assert.assertTrue(false);//this is given for error generat for checking error 
	   //is stored in txt format
		
	}

	@When("Enter user name as {string} and password as {string}")
	public void enter_user_name_and_password(String username,String password) {

		
		
		Loginpagerepo lp=new Loginpagerepo();
	    Hook.type(lp.getUsername(),username);
        Hook.type(lp.getPassword(),password);

	}
	@Then("Close the browser")
	public void close_the_browser() {
		Hook.driver.close();
		
	   
	    
	}

	
	}

 


