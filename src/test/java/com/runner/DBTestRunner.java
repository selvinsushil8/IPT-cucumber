package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.IPTcucmuber.DBcucPractice;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Selenium2024\\IPTcucmuber\\src\\test\\java\\Feature\\DB.feature", glue = "com.stepdef"
,tags = "@SmokeTest",plugin = {"pretty","json:Reports/report2.json"})

public class DBTestRunner extends DBcucPractice {
	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() {
		driver= InvokeBrowser();
	}

}
