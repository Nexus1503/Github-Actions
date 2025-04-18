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
	
	String deleteDropdownOptionXpathStart ="//a[@title='";
	String deleteDropdownOptionXpathEnd ="']/ancestor::tr//a[@id='delete-file-btn']";
	
	String restoreDropdownButtonXpathSart = "//a[@title='";
	String restoreDropdownButtonXpathEnd = "']/ancestor::tr//a[@id='restore-file-btn']";	
	
	By userNameField = By.id("text-auth-email");
	By passwordField = By.id("text-auth-password");
	By signInButton = By.id("btn-auth-login");
	
	By createFolderLink = By.xpath("//a[@title='Create a new folder']");
	By folderNameField = By.xpath("//input[@id='new-folder-text']");
	By addFolderButton = By.xpath("//button[@id='new-folder-add-btn']");
	By folderRenameField = By.xpath("//input[@id='path-rename-text']");
	By renameButton = By.xpath("//button[@id='path-rename-btn']");
	By deleteDialogButton = By.xpath("//button[@id='delete-dialog-btn']");
	By showDeletedFiles = By.xpath("//a[@id='deleted-files-btn']");
	//By restoreDropdownButton = By.xpath("restore-file-btn");
	By comformRestoreButton = By.xpath("//button[@id='restore']");
		
	
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
	
	public void clickDeleteFileDropdownButton(String folderName) {
		By daleteDropdownOption = By.xpath(deleteDropdownOptionXpathStart+folderName+deleteDropdownOptionXpathEnd);
		driver.findElement(daleteDropdownOption).click();
		System.out.println("Clicked on delete dropdown option.");
	}
	
	public void clickConfirmDeleteDialogButton() {
		driver.findElement(deleteDialogButton).click();
		System.out.println("Clicked on delete button Dialog(comform delete option)");
	}
	
	public void clickShowDeletedFilesButton() {
		driver.findElement(showDeletedFiles).click();
		System.out.println("Clicked on show deleted files button.");
	}
	
	public void clickRestoreDropdownButton(String folderName) {
		By restoreDropdownButton = By.xpath(restoreDropdownButtonXpathSart+folderName+restoreDropdownButtonXpathEnd);
		driver.findElement(restoreDropdownButton).click();
		System.out.println("clicked restore dropdown Button");
	}
	
	public void clickConfirmRestoreButton() {
		driver.findElement(comformRestoreButton).click();
		System.out.println("clicked on comform restore button");
	}
     
}
