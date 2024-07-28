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
		System.out.println("URL opened in the browser.");
	}
	public void loginToSyncApp(String uname, String pwd) {
		driver.findElement(userNameField).sendKeys(uname);
		driver.findElement(passwordField).sendKeys(pwd);
		driver.findElement(signInButton).click();
		System.out.println("Logged in to the Sync app.");
	}
	
	public void enterUsername(String uname) {
		driver.findElement(userNameField).sendKeys(uname);
		System.out.println("Entered user name.");
	}
	
	public void enterPassword(String pwd) {
		driver.findElement(passwordField).sendKeys(pwd);
		System.out.println("Entered Password");
	}
	
	public void clickSignInButton() {
		driver.findElement(signInButton).click();
		System.out.println("Clicked sign in button");
	}
	
	public void clickAccountSection() {
		driver.findElement(accountSection).click();
		System.out.println("Clicked account profile link..");
	}
	
	public void clickSignOut() {
		driver.findElement(signOutButton).click();
		System.out.println("Clicked signin button..");
	}
}
