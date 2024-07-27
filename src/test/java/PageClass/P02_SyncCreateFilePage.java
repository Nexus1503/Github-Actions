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
	}
	
	public void loginToSyncApp(String uname, String pwd) {
		driver.findElement(userNameField).sendKeys(uname);
		driver.findElement(passwordField).sendKeys(pwd);
		driver.findElement(signInButton).click();
	}
	
	public void clickCreateFileLink() {
		driver.findElement(createFileLink).click();
	}
	
	public void enterFileName(String fname) {
		driver.findElement(fileNameField).clear();
		driver.findElement(fileNameField).sendKeys(fname);
	}
	
	public void clickCreateFileButton() {
		driver.findElement(createFileButton).click();
	}
	
	public void checkIfFileIsPresent() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		WebElement ele= wait.until(ExpectedConditions.visibilityOfElementLocated(fileElement));
		System.out.println(ele.getText()); 
	}
	
	public void clickThreeDots() {
		driver.findElement(threeDotsElement).click();
	}
	
	public void clickOnDeleteOption() {
		driver.findElement(deleteLink).click();
	}
	
	public void clickOnDeleteButton() {
		driver.findElement(deleteButton).click();
	}
	
}
