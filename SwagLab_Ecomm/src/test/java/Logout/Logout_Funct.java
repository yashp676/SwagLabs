package Logout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_Funct {

	
	@FindBy(id="user-name")
	private WebElement usernmtb;
	
	@FindBy(id="password")
	private WebElement pwdtb;
	
	@FindBy(id="login-button")
	private WebElement loginbt;
	
	@FindBy(id="react-burger-menu-btn")
	private WebElement menutb;
	
	@FindBy(id="logout_sidebar_link")
	private WebElement lgtb;
	
	public Logout_Funct(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void usernamemtab(String un) {
		usernmtb.sendKeys(un);
	}
	
	public void passwordtab(String pw) {
		pwdtb.sendKeys(pw);
	}
	
	public void loginbutton() {
		loginbt.click();
    }
	
	public void menubutton() {
		menutb.click();
	}
	
	public void logout() {
		lgtb.click();
	}
	
}
