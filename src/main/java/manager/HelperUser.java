package manager;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelperUser extends HelperBase {

	public HelperUser (WebDriver wd) {
		super(wd);
	}

	public void openLoginForm () {
		mouseClick(By.xpath("//a[@class='navigation-link'][normalize-space()='Log in']"));
	}

	public boolean isLogged () {
		return isElementPresent(By.xpath("//a[normalize-space()='Logout']"));
	}

	public boolean isLoggedSuccess() {
		WebDriverWait wait = new WebDriverWait(wd, 5);
		wait.until(ExpectedConditions.visibilityOf(By.cssSelector(".")));
		return false;
	}

	public void logout () {
		mouseClick(By.xpath("//a[normalize-space()='Logout']"));
	}

	public void fillLoginForm (String mail, String password) {
		type(By.xpath("//input[@id='email']"), mail);
		type(By.xpath("//input[@id='password']"), password);
	}

	public void submitLogin () {
		mouseClick(By.xpath("//button[@type='submit']"));
	}

	public void clickOkButton () {
		mouseClick(By.xpath("//button[@type='button']"));
	}

	public void fillLoginForm (User data) {
		type(By.xpath("//input[@id='email']"), data.getEmail());
		type(By.xpath("//input[@id='password']"), data.getPassword());
	}

}
