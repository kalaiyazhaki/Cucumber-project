package org.stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.utilities.BaseClass;

import io.cucumber.java.en.*;
import pom.pojo.LoginPojo;

public class LoginStepDefinition extends BaseClass {
	
	@Given("User should launch chrome and load the url")
	public void user_should_launch_chrome_and_load_the_url() throws IOException {
	   
	}

@When("User should click the sign in button")
public void user_should_click_the_sign_in_button() throws InterruptedException {
	LoginPojo l=new LoginPojo();
	btnClick(l.getSignIn());
	maxiWait(5000);
}

@When("User should click the sign in with zappos button")
public void user_should_click_the_sign_in_with_zappos_button() {
	LoginPojo l=new LoginPojo();
	btnClick(l.getLogin());
	}

	@When("User should pass the invalid email and invalid password")
	public void user_should_pass_the_invalid_email_and_valid_password() throws InterruptedException, IOException {
		LoginPojo l=new LoginPojo();
		fill(l.getEmail(), getData(2, 0));
		fill(l.getPass(), getData(2,1));
	 	}

	@When("User should click the login button")
	public void user_should_click_the_login_button() {
		LoginPojo l=new LoginPojo();
		btnClick(l.getBtnClk());
	}
	
	@When("User should pass the invalid EMAIL and invalid password")
	public void user_should_pass_the_invalid_EMAIL_and_invalid_password(io.cucumber.datatable.DataTable d2) {
		//1D Map
		LoginPojo l=new LoginPojo();
		Map<String, String> mp = d2.asMap(String.class, String.class);
		fill(l.getEmail(), mp.get("mobile"));//moto
		fill(l.getPass(), mp.get("color")); //pink@456
	}
	
	@When("User should pass the INVALID email and invalid password")
	public void user_should_pass_the_INVALID_email_and_invalid_password(io.cucumber.datatable.DataTable d3) {
		//2D Map
		LoginPojo l=new LoginPojo();
		List<Map<String, String>> mp1 = d3.asMaps();
		fill(l.getEmail(), mp1.get(2).get("laptop"));//sony
		fill(l.getPass(),mp1.get(4).get("color")); //brown@567
	}

	@Then("User should navigate to incorrect credential page")
	public void user_should_navigate_to_incorrect_credential_page() {
	    String url = driver.getCurrentUrl();
	    Assert.assertTrue("Please check the URL", url.contains("signin"));
	    System.out.println(url);
	    //driver.close();
	}
	@When("User should print the title of ur page")
	public void user_should_print_the_title_of_ur_page() {
	 toPrintTitle();
	}
	@When("User should pass the valid email and invalid password")
	public void user_should_pass_the_valid_email_and_invalid_password() throws IOException {
		LoginPojo l=new LoginPojo();
		fill(l.getEmail(), getData(3, 0));
		fill(l.getPass(), getData(3,1));
	}
	@When("User should pass the valid email and invalid passworD")
	public void user_should_pass_the_valid_email_and_invalid_passworD(io.cucumber.datatable.DataTable d) {
		//use 1D List
		List<String> li = d.asList();
		String s = li.get(4); //use this 
		LoginPojo l=new LoginPojo();
		fill(l.getEmail(), s); //shalini
		fill(l.getPass(), li.get(5));//or use this shailini@123
	}
	@When("User should pass the valid email and invalid PASSWORD")
	public void user_should_pass_the_valid_email_and_invalid_PASSWORD(io.cucumber.datatable.DataTable d1) {
	//use 2D List
		LoginPojo l=new LoginPojo();
		List<List<String>> s = d1.asLists();
		fill(l.getEmail(), s.get(1).get(4)); //note
		fill(l.getPass(),s.get(2).get(3));//or use this  gayu@34
	}


	@When("User should pass the valid email and valid password")
	public void userShouldPassTheValidEmailAndValidPassword() throws IOException {
		LoginPojo l=new LoginPojo();
		fill(l.getEmail(), getData(12, 0));
		fill(l.getPass(), getData(12,1));
	}


@When("User should pass the invalid email{string} and valid password {string}")
public void userShouldPassTheInvalidEmailAndValidPassword(String s1, String s2) {
	LoginPojo l=new LoginPojo();
	fill(l.getEmail(),s1);
	fill(l.getPass(), s2);
}

@When("User should print the current url of the page")
public void userShouldPrintTheCurrentUrlOfThePage() {
    printcurrentUrl();
}
@When("User should logout the account")
public void userShouldLogoutTheAccount() {
	 LoginPojo l=new LoginPojo();
	   cusorTo(l.getLogOut());
	 cusorTo(l.getSignOut());
}

@Then("User should navigate to correct credential page")
public void userShouldNavigateToCorrectCredentialPage() {
	String url = driver.getCurrentUrl();
    Assert.assertTrue("Please check the URL", url.contains("com"));
    System.out.println(url);
   //driver.close();
}
@When("User should pass the invalid email and VALID password")
public void user_should_pass_the_invalid_email_and_VALID_password() throws IOException {
	LoginPojo l=new LoginPojo();
	fill(l.getEmail(), getData(6, 0));
	fill(l.getPass(), getData(6,1));
}
@When("User should print the TITLE of ur page")
public void user_should_print_the_TITLE_of_ur_page() {
String title = driver.getTitle();
Assert.assertTrue("Please check the title", title.contains("Zappos"));
System.out.println("Testing");

}
	  
}

	





