package PageClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P03_SyncFolderPage {
	
	WebDriver driver;
	
	public P03_SyncFolderPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	String folderElementXpathStart ="//a[@title='";
	String folderElementXpathEnd ="' and @class='filelink showhand']";
	
	String threeDotsXpathSart="//a[@title='";
	String threeDotsXpathEnd="']/ancestor::tr//i[@id='webpath-option-btn']";
	
	String renameDropdownOptionXpathStart ="//a[@title='";
	String renameDropdownOptionXpathEnd ="']/ancestor::tr//a[@id='context-menu-rename']";
	
	
	By userNameField = By.id("text-auth-email");
	By passwordField = By.id("text-auth-password");
	By signInButton = By.id("btn-auth-login");
	
	By createFolderLink = By.xpath("//a[@title='Create a new folder']");
	By folderNameField = By.xpath("//input[@id='new-folder-text']");
	By addFolderButton = By.xpath("//button[@id='new-folder-add-btn']");
	By folderRenameField = By.xpath("//input[@id='path-rename-text']");
	By renameButton = By.xpath("//button[@id='path-rename-btn']");
		
	
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
	
	public void clickNewFolderButton() {
		driver.findElement(createFolderLink).click();
		System.out.println("Create folder button is click");
	}
	
	public void enterFolderName(String folderName) {
		driver.findElement(folderNameField).clear();
		driver.findElement(folderNameField)	.sendKeys(folderName);
		System.out.println("Folder name assign in folder name field");
	}
	
	public void clickAddFolderButton() {
		driver.findElement(addFolderButton).click();
		System.out.println("New folder created.");
	}
	
	public void checkFolderIsPresent(String folderName)
	{
		By folderElement = By.xpath(folderElementXpathStart+folderName+folderElementXpathEnd);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		WebElement ele= wait.until(ExpectedConditions.visibilityOfElementLocated(folderElement));
		System.out.println(ele.getText()); 
		System.out.println("Validated if the folder is present..");
	}
	
	public void clickFolderThreeDotsDropdown(String folderName) {
		By threeDotsDropdown = By.xpath(threeDotsXpathSart+folderName+threeDotsXpathEnd);
		driver.findElement(threeDotsDropdown).click();
		System.out.println("Clicked on three dots dropdown.");
	}
	
	public void clickRenameDropdownOption(String folderName)
	{
		By renameDropdownOption = By.xpath(renameDropdownOptionXpathStart+folderName+renameDropdownOptionXpathEnd);
		driver.findElement(renameDropdownOption).click();
		System.out.println("Clicked on rename dropdown option.");
	}
	
	public void enterRenameField(String newFolderName)
	{
		driver.findElement(folderRenameField).clear();
		driver.findElement(folderRenameField).sendKeys(newFolderName);
		System.out.println("New folder name assigned in rename field");
	}
	
	public void clickRenameButton() {
		driver.findElement(renameButton).click();
		System.out.println("clicked rename button");
	}
     
}
