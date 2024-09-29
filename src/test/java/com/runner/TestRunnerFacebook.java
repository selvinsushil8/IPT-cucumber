package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.IPTcucmuber.FBlogin;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Selenium2024\\IPTcucmuber\\src\\test\\java\\Feature\\fb.feature", glue = "com.stepdef", monochrome = true)
public class TestRunnerFacebook extends FBlogin {

	public static WebDriver driver;

	@BeforeClass
	public static void setup() {
		driver = InvokeBrowser();
	}

}
