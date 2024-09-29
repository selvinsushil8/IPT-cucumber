package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomFB {

	public static WebDriver driver;

	@FindBy(id = "email")
	private WebElement user;

	@FindBy(id = "pass")
	private WebElement pass;

	@FindBy(name = "login")
	private WebElement log;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLog() {
		return log;
	}

	public PomFB(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver, this);
	}

}
