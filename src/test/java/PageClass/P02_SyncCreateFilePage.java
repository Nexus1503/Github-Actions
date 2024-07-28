package PageClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P02_SyncCreateFilePage {
	
	WebDriver driver;
	public P02_SyncCreateFilePage(WebDriver driver) {
		this.driver=driver;
	}
	
	By userNameField = By.id("text-auth-email");
	By passwordField = By.id("text-auth-password");
	By signInButton = By.id("btn-auth-login");

	By createFileLink = By.xpath("//a[@title='Create']");
	By fileNameField = By.xpath("//input[@id='create-blank-document-text']");
	By createFileButton = By.xpath("//button[@id='create-dialog-btn']");
	By fileElement = By.xpath("//a[@title='abcd.docx']");
	By threeDotsElement = By.id("webpath-option-btn");
	By deleteLink = By.id("delete-file-btn");
	By deleteButton = By.id("delete-dialog-btn");
	
	
	public void openUrl(String url) {
		driver.get(url);
		System.out.println("Opened url in the browser..");
	}
	
	public void loginToSyncApp(String uname, String pwd) {
		driver.findElement(userNameField).sendKeys(uname);
		driver.findElement(passwordField).sendKeys(pwd);
		driver.findElement(signInButton).click();
		System.out.println("Logged in to the app.");
	}
	
	public void clickCreateFileLink() {
		driver.findElement(createFileLink).click();
		System.out.println("Clicked on create file link..");
	}
	
	public void enterFileName(String fname) {
		driver.findElement(fileNameField).clear();
		driver.findElement(fileNameField).sendKeys(fname);
		System.out.println("Entered file name to be created.");
	}
	
	public void clickCreateFileButton() {
		driver.findElement(createFileButton).click();
		System.out.println("Clicked create file button");
	}
	
	public void checkIfFileIsPresent() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		WebElement ele= wait.until(ExpectedConditions.visibilityOfElementLocated(fileElement));
		System.out.println(ele.getText()); 
		System.out.println("Validated if the file is present..");
	}
	
	public void clickThreeDots() {
		driver.findElement(threeDotsElement).click();
		System.out.println("Clicked on three dots.");
	}
	
	public void clickOnDeleteOption() {
		driver.findElement(deleteLink).click();
		System.out.println("Clicked on delete option from three dots.");
	}
	
	public void clickOnDeleteButton() {
		driver.findElement(deleteButton).click();
		System.out.println("Clicked on delete button..");
	}
	
}
