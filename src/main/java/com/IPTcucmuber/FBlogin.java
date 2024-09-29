package com.IPTcucmuber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FBlogin {

	public static WebDriver driver;

	public static WebDriver InvokeBrowser() {
		System.setProperty("webdriver.edge.driver", "D:\\Selenium2024\\IPTcucmuber\\Drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public static void url(String url) {
		driver.get(url);
	}

	public static void userName(WebElement un, String input) {
		un.sendKeys(input);
	}

	public static void passWord(WebElement pass, String input) {
		pass.sendKeys(input);
	}

	public static void log(WebElement log) {
		log.click();
	}
}
