package PageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P01_SyncLoginPage{
	
	WebDriver driver;
	public P01_SyncLoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	By userNameField = By.id("text-auth-email");
	By passwordField = By.id("text-auth-password");
	By signInButton = By.id("btn-auth-login");
	By accountSection = By.xpath("//span[contains(text(),'sandipthopate1414+test@gmail.com')]");
	By signOutButton = By.xpath("//a[text()='Sign out']");

	
	public void openUrl(String url) {
		driver.get(url);
	}
	public void loginToSyncApp(String uname, String pwd) {
		driver.findElement(userNameField).sendKeys(uname);
		driver.findElement(passwordField).sendKeys(pwd);
		driver.findElement(signInButton).click();
	}
	
	public void enterUsername(String uname) {
		driver.findElement(userNameField).sendKeys(uname);
	}
	
	public void enterPassword(String pwd) {
		driver.findElement(passwordField).sendKeys(pwd);
	}
	
	public void clickSignInButton() {
		driver.findElement(signInButton).click();
	}
	
	public void clickAccountSection() {
		driver.findElement(accountSection).click();
	}
	
	public void clickSignOut() {
		driver.findElement(signOutButton).click();
	}
}
