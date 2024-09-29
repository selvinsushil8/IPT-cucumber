package com.IPTcucmuber;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DBcucPractice {
	public static WebDriver driver;
	
	public static WebDriver InvokeBrowser() {
		System.setProperty("webdriver.edge.driver", "D:\\Selenium2024\\IPTcucmuber\\Drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public static void loginPage(String url) {
		driver.get(url);
	}

	public static void login(WebElement log) {
		log.click();
	}

	public static void logUser(WebElement logus, String input) {
		logus.sendKeys(input);
	}

	public static void LogPas(WebElement logpas, String input) {
		logpas.sendKeys(input);
	}

	public static void logButton(WebElement logb) {
		logb.click();
	}

	public static void teardown() {
		driver.quit();
	}
	
}
