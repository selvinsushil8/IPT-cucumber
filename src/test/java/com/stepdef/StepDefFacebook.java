package com.stepdef;

import org.openqa.selenium.WebDriver;
import com.IPTcucmuber.FBlogin;
import com.config.ConfigReader;
import com.runner.TestRunnerFacebook;
import io.cucumber.java.en.*;
import pageobjectmanager.PObmanager;

public class StepDefFacebook extends FBlogin {
	public WebDriver driver = TestRunnerFacebook.driver;

	PObmanager p = new PObmanager(driver);
	public ConfigReader c;

	@Given("user should navigate to login url")
	public void user_should_navigate_to_login_url() throws Throwable {
		c = new ConfigReader();
		url(c.getUrl());
	}

	@When("user should able to enter username {string}")
	public void user_should_able_to_enter_username(String un) {
		userName(p.getPom().getUser(), un);
	}

	@When("user should able to enter password {string}")
	public void user_should_able_to_enter_password(String password) {
		passWord(p.getPom().getPass(), password);
	}

	@Then("validate user should able to click log in button")
	public void validate_user_should_able_to_click_log_in_button() {
		log(p.getPom().getLog());
	}

}
