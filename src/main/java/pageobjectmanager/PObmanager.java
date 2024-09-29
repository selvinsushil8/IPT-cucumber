package pageobjectmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pom.PomFB;

public class PObmanager {

	public static WebDriver driver;

	private PomFB pom;

	public PomFB getPom() {
		pom = new PomFB(driver);
		return pom;
	}

	public PObmanager(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver, this);
	}

}
