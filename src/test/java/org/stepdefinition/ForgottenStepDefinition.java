package org.stepdefinition;

import org.openqa.selenium.By;
import org.utilities.BaseClass;

import io.cucumber.java.en.*;
import pom.pojo.ForgotPojoClass;

public class ForgottenStepDefinition extends BaseClass {
	@When("User should click the forgot your password link")
	public void user_should_click_the_forgot_your_password_link() {
		ForgotPojoClass e=new ForgotPojoClass();
		cusorTo(e.getForgot());
	}

	@When("User should input invalid email in the find your account text box")
	public void user_should_input_invalid_email_in_the_find_your_account_text_box() throws InterruptedException {
		ForgotPojoClass e=new ForgotPojoClass();
		fill(e.getEmail(), "anu234@gmail.com");
		maxiWait(10000);
	}

	@When("User should click the continue button")
	public void user_should_click_the_continue_button() throws InterruptedException {
		ForgotPojoClass e=new ForgotPojoClass();
		btnClick(e.getContin());
		maxiWait(10000);
	}

	@Then("User should navigate to password reset page")
	public void user_should_navigate_to_password_reset_page() {
		ForgotPojoClass e=new ForgotPojoClass();
		printText(e.getText());
		txtToPre(By.xpath("//h4[text()='There was a problem']"));
	}

}
