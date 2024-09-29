package com.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.IPTcucmuber.DBcucPractice;
import com.runner.DBTestRunner;

import io.cucumber.java.en.*;

public class StepDefDB extends DBcucPractice {
	public static WebDriver driver = DBTestRunner.driver;

	@Given("user should able to navigate to the login page")
	public void user_should_able_to_navigate_to_the_login_page() {
		loginPage("https://www.demoblaze.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@When("user should able to click the log in tab")
	public void user_should_able_to_click_the_log_in_tab() throws Throwable {
		WebElement log = driver.findElement(By.id("login2"));
		login(log);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@When("user should able to enter username")
	public void user_should_able_to_enter_username() throws InterruptedException {
		WebElement loguser = driver.findElement(By.id("loginusername"));
		logUser(loguser, "selvin");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@When("user should able to enter password")
	public void user_should_able_to_enter_password() {
		WebElement logpass = driver.findElement(By.id("loginpassword"));
		LogPas(logpass, "123456");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@When("user should able to click log in button")
	public void user_should_able_to_click_log_in_button() throws InterruptedException {
		WebElement logb = driver.findElement(By.xpath("(//button[@type='button'])[9]"));
		logButton(logb);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Then("user should able to navigate to the home page")
	public void user_should_able_to_navigate_to_the_home_page() {
		System.out.println("success");
		driver.quit();
	}

}
